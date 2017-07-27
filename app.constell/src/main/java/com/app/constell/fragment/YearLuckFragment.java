package com.app.constell.fragment;

import com.app.constell.R;
import com.app.constell.entity.YearLuck;
import com.app.constell.presenter.LuckContract;
import com.app.constell.presenter.YearLuckPresenter;

/**
 * Created by Administrator on 17.7.27.
 */

public class YearLuckFragment extends BaseLuckFragment<YearLuck> {

    public static YearLuckFragment $(){
        return new YearLuckFragment();
    }

    @Override
    public void onLuckRsp(YearLuck luck) {
        super.onLuckRsp(luck);
    }

    @Override
    protected LuckContract.IPresenter getPresenter() {
        return new YearLuckPresenter(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_luck_year;
    }
}
