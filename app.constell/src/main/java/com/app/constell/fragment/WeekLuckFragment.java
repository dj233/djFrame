package com.app.constell.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.constell.R;
import com.app.constell.entity.WeekendLuck;
import com.app.constell.presenter.LuckContract;
import com.app.constell.presenter.WeekLuckPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 17.7.27.
 */

public class WeekLuckFragment extends BaseLuckFragment<WeekendLuck> {
    @BindView(R.id.tv_constell)
    TextView tvConstell;
    @BindView(R.id.tv_luck_date)
    TextView tvLuckDate;
    @BindView(R.id.tv_health_week)
    TextView tvHealthWeek;
    @BindView(R.id.tv_job_week)
    TextView tvJobWeek;
    @BindView(R.id.tv_love_week)
    TextView tvLoveWeek;
    @BindView(R.id.tv_money_week)
    TextView tvMoneyWeek;
    @BindView(R.id.tv_work_week)
    TextView tvWorkWeek;

    boolean isNextWeek;

    @Override
    protected void getBundleData(Bundle bundle) {
        isNextWeek = bundle.getBoolean("isNextWeek");
    }

    public static DailyFragment $(boolean isNextWeek){
        DailyFragment frag = new DailyFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isNextWeek",isNextWeek);
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public void onLuckRsp(WeekendLuck luck) {
        super.onLuckRsp(luck);
        tvConstell.setText(getString(R.string.luck_info,"我的星座",luck.getName()));
        tvLuckDate.setText(getString(R.string.luck_info,"运势周期",luck.getDate()));
        tvHealthWeek.setText(luck.getHealth());
        tvJobWeek.setText(luck.getJob());
        tvLoveWeek.setText(luck.getLove());
        tvMoneyWeek.setText(luck.getMoney());
        tvWorkWeek.setText(luck.getWork());
    }

    @Override
    protected LuckContract.IPresenter getPresenter() {
        return new WeekLuckPresenter(this,isNextWeek);
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_luck_week;
    }

}
