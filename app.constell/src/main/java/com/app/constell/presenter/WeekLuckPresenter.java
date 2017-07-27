package com.app.constell.presenter;

import com.app.constell.entity.DailyLuck;
import com.app.constell.entity.Luck;
import com.app.constell.entity.WeekendLuck;
import com.app.constell.net.Req;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 17.7.27.
 */

public class WeekLuckPresenter extends BaseLuckPresenter<WeekendLuck> {

    private boolean isNextWeek;

    public WeekLuckPresenter(LuckContract.IView<WeekendLuck> view, boolean isNextWeek) {
        super(view);
        this.isNextWeek = isNextWeek;
    }

    @Override
    public void reqLuck(String cons) {
        String type = isNextWeek ? "nextweek" : "week";
        Req.$().get(cons,type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Luck>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.onError(e);
            }

            @Override
            public void onNext(Luck o) {
                WeekendLuck luck = (WeekendLuck) o;
                view.onLuckRsp(luck);
            }
        });
    }
}
