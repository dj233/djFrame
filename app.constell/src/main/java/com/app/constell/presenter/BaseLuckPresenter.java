package com.app.constell.presenter;

/**
 * Created by Administrator on 17.7.27.
 */

public abstract class BaseLuckPresenter<T> implements LuckContract.IPresenter{
    protected LuckContract.IView<T> view;

    public BaseLuckPresenter(LuckContract.IView<T> view) {
        this.view = view;
    }
}
