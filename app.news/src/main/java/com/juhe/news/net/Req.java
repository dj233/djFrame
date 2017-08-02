package com.juhe.news.net;

import com.juhe.news.entity.Rsp;

import lib.data.BaseReq;
import rx.Observable;

/**
 * Created by Administrator on 17.8.2.
 */

public class Req extends BaseReq {

    private Api api;
    private static Req _$;

    private Req(){
        api = mRetrofit.create(Api.class);
    }

    public static Req $(){
        if(_$ == null){
            _$ = new Req();
        }
        return _$;
    }

    @Override
    protected String baseUrl() {
        return Api.URL;
    }

    public Observable<Rsp> req(String type){
        return api.reqNews(type,Api.APP_KEY);
    }
}
