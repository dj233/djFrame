package com.app.constell.net;

import com.app.constell.entity.Luck;

import lib.data.BaseReq;
import rx.Observable;

/**
 * Created by Administrator on 17.7.27.
 */

public class Req extends BaseReq {
    private Api api;
    private static Req _$;
    private Req(){api = mRetrofit.create(Api.class);}
    public static Req $(){
        if(_$ == null)
            _$ = new Req();
        return _$;
    }
    public Observable<Luck> get(String cons, String type){
        return api.get(Api.KEY,cons,type);
    }

    @Override
    protected String baseUrl() {
        return Api.URL;
    }
}
