package com.juhe.news.net;

import com.juhe.news.entity.Rsp;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 17.8.2.
 */

public interface Api {
    String URL = "http://v.juhe.cn";
    String APP_KEY = "400c567c4ec1e350e63f24bf1861c943";

    @GET("/toutiao/index")
    Observable<Rsp> reqNews(@Query("type")String type,@Query("key")String appKey);
}
