package com.app.constell.presenter;

import com.app.constell.entity.DailyLuck;
import com.app.constell.entity.Luck;
import com.app.constell.net.Req;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 17.7.27.
 */

public class DailyLuckPresenter extends BaseLuckPresenter<DailyLuck> {

    private boolean isTomorrow;

    public DailyLuckPresenter(LuckContract.IView<DailyLuck> view, boolean isTomorrow) {
        super(view);
        this.isTomorrow = isTomorrow;
    }

    @Override
    public void reqLuck(String cons) {
        String type = isTomorrow ? "tomorrow" : "today";
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
                DailyLuck luck = (DailyLuck) o;
                view.onLuckRsp(luck);
            }
        });
    }
}
