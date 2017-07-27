package com.app.constell.presenter;

import com.app.constell.entity.DailyLuck;
import com.app.constell.entity.Luck;
import com.app.constell.entity.YearLuck;
import com.app.constell.net.Req;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 17.7.27.
 */

public class YearLuckPresenter extends BaseLuckPresenter<YearLuck> {

    public YearLuckPresenter(LuckContract.IView<YearLuck> view) {
        super(view);
    }

    @Override
    public void reqLuck(String cons) {
        String type = "year";
        Req.$().get(cons, type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Luck>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.onError(e);
            }

            @Override
            public void onNext(Luck o) {
                YearLuck luck = (YearLuck) o;
                view.onLuckRsp(luck);
            }
        });
    }
}
