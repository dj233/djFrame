package com.app.constell.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.constell.R;
import com.app.constell.entity.MonthLuck;
import com.app.constell.presenter.LuckContract;
import com.app.constell.presenter.MonthLuckPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 17.7.27.
 */

public class MonthLuckFragment extends BaseLuckFragment<MonthLuck> {

    @BindView(R.id.tv_constell)
    TextView tvConstell;
    @BindView(R.id.tv_luck_month)
    TextView tvLuckMonth;
    @BindView(R.id.tv_health_month)
    TextView tvHealthMonth;
    @BindView(R.id.tv_love_month)
    TextView tvLoveMonth;
    @BindView(R.id.tv_money_week)
    TextView tvMoneyWeek;
    @BindView(R.id.tv_work_week)
    TextView tvWorkWeek;

    public static MonthLuckFragment $(){
        return new MonthLuckFragment();
    }

    @Override
    protected LuckContract.IPresenter getPresenter() {
        return new MonthLuckPresenter(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_luck_month;
    }

    @Override
    public void onLuckRsp(MonthLuck luck) {
        super.onLuckRsp(luck);
        tvConstell.setText(getString(R.string.luck_info,"我的星座",luck.getName()));
        tvLuckMonth.setText(getString(R.string.luck_style,"本月",luck.getAll()));
        tvHealthMonth.setText(getString(R.string.luck_style,"健康",luck.getHealth()));
        tvLoveMonth.setText(getString(R.string.luck_style,"爱情",luck.getLove()));
        tvMoneyWeek.setText(getString(R.string.luck_style,"财富",luck.getMoney()));
        tvWorkWeek.setText(getString(R.string.luck_style,"事业",luck.getWork()));
    }

}
