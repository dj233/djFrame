package com.app.constell.presenter;

/**
 * Created by Administrator on 17.7.27.
 */

public class LuckContract {
    public interface IView<T>{
        void onLuckRsp(T luck);
        void onError(Throwable e);
    }

    public interface IPresenter{
        void reqLuck(String cons);
    }
}
