package com.app.constell.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.app.constell.R;
import com.app.constell.entity.DailyLuck;
import com.app.constell.presenter.DailyLuckPresenter;
import com.app.constell.presenter.LuckContract;

import butterknife.BindView;

/**
 * Created by Administrator on 17.7.27.
 */

public class DailyFragment extends BaseLuckFragment<DailyLuck> {


    @BindView(R.id.tv_constell)
    TextView tvConstell;
    @BindView(R.id.tv_luck_date)
    TextView tvLuckDate;
    @BindView(R.id.tv_luck_friend)
    TextView tvLuckFriend;
    @BindView(R.id.tv_luck_color)
    TextView tvLuckColor;
    @BindView(R.id.tv_luck_summary)
    TextView tvLuckSummary;
    @BindView(R.id.tv_all_ratio)
    TextView tvAllRatio;
    @BindView(R.id.tv_health_ratio)
    TextView tvHealthRatio;
    @BindView(R.id.tv_love_ratio)
    TextView tvLoveRatio;
    @BindView(R.id.tv_money_ratio)
    TextView tvMoneyRatio;
    @BindView(R.id.tv_work_ratio)
    TextView tvWorkRatio;

    boolean isTomorrow;

    @Override
    protected void getBundleData(Bundle bundle) {
        isTomorrow = bundle.getBoolean("isTomorrow");
    }

    public static DailyFragment $(boolean isTomorrow){
        DailyFragment frag = new DailyFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isTomorrow",isTomorrow);
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_luck_daily;
    }

    @Override
    protected LuckContract.IPresenter getPresenter() {
        return new DailyLuckPresenter(this,isTomorrow);
    }

    @Override
    public void onLuckRsp(DailyLuck luck) {
        super.onLuckRsp(luck);
        tvConstell.setText(getString(R.string.luck_info,"我的星座",luck.getName()));
        tvLuckDate.setText(getString(R.string.luck_info,"运势周期",luck.getDatetime()));
        tvLuckFriend.setText(getString(R.string.luck_info,"幸运星座",luck.getQFriend()));
        tvLuckColor.setText(getString(R.string.luck_info,"幸运颜色",luck.getColor()));
        tvLuckSummary.setText(getString(R.string.luck_info,"今日运势",luck.getSummary()));

        tvAllRatio.setText(getString(R.string.daily_ratio,"幸运",luck.getAll()));
        tvHealthRatio.setText(getString(R.string.daily_ratio,"健康",luck.getHealth()));
        tvLoveRatio.setText(getString(R.string.daily_ratio,"爱情",luck.getLove()));
        tvMoneyRatio.setText(getString(R.string.daily_ratio,"财富",luck.getMoney()));
        tvWorkRatio.setText(getString(R.string.daily_ratio,"事业",luck.getWork()));
    }

}
