package com.app.constell.net;

import com.app.constell.entity.Luck;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 17.7.27.
 */

public interface Api {
    String URL = "http://web.juhe.cn:8080/";
    String KEY = "4c7cb6eb9c84f11677a900f4fa9f648b";

    @GET("/constellation/getAll")
    Observable<Luck> get(@Query("key")String key, @Query("consName")String consName, @Query("type")String type);

}
