package com.juhe.news.presenter;

import com.juhe.news.entity.News;
import com.juhe.news.entity.Rsp;
import com.juhe.news.net.Req;

import java.util.List;

import market.lib.ui.presenter.BaseListContract;
import market.lib.ui.presenter.BaseListPresenter;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 17.8.2.
 */

public class NewsListPresenter extends BaseListPresenter {

    private String type;

    public NewsListPresenter(BaseListContract.IView view, String type) {
        super(view);
        this.type = type;
    }

    @Override
    public void refresh(int pageSize) {
        Req.$().req(type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<Rsp>() {
            @Override
            public void call(Rsp rsp) {
                if(rsp.getError_code() == 0){
                    List<News> news = rsp.getResult().getData();
                    view.onRefresh(news);
                }
            }
        });
    }

    @Override
    public void add(int page, int pageSize) {

    }
}
