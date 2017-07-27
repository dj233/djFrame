package com.app.constell.fragment;

import android.view.View;

import com.app.constell.presenter.LuckContract;

import lib.ui.empty.IEmptyLayout;
import market.lib.ui.fragment.BaseFragment;

/**
 * Created by Administrator on 17.7.27.
 */

public abstract class BaseLuckFragment<T> extends BaseFragment implements LuckContract.IView<T>{

    private LuckContract.IPresenter presenter;

    protected String cons;

    @Override
    protected void initView(View successView) {
        cons = "白羊座";
//        setStatue(IEmptyLayout.Type.Loading);
        presenter = getPresenter();
        presenter.reqLuck(cons);
    }

    protected abstract LuckContract.IPresenter getPresenter();

    @Override
    public void onLuckRsp(T luck) {
        setStatue(IEmptyLayout.Type.Data);
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }
}
