package market.lib.ui.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import lib.ui.empty.IEmptyLayout;
import market.lib.R;

public abstract class BaseFragment extends Fragment {

    protected Activity activity;
    protected AppCompatActivity appCompatActivity;
    private IEmptyLayout emptyLayout;
    protected FrameLayout mEmptyRootView;

    public View mSuccessView;//成功视图

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        getBundleData(getArguments());
        View view = inflater.inflate(R.layout.fragment_empty, container, false);
        emptyLayout = (IEmptyLayout) view.findViewById(R.id.empty_layout);
        emptyLayout.setEmptyType(IEmptyLayout.Type.Data);
        mEmptyRootView = (FrameLayout) view.findViewById(R.id.emptyRootView);
        activity = getActivity();
        initRootView();
        return view;
    }

    protected void getBundleData(Bundle bundle){

    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        getActivity().overridePendingTransition(R.anim.popshow_anim, R.anim.pophide_anim_static);
    }

    private void initRootView() {
        mSuccessView = View.inflate(getContext(), getLayoutId(), null);
        ButterKnife.bind(this, mSuccessView);
        mEmptyRootView.addView(mSuccessView);
        initView(mSuccessView);
    }

    protected void initView(View successView){

    }

    public abstract int getLayoutId();


    protected Handler mHandler = new Handler(){
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            dispatchMessage(msg);
        }
    };

    protected void dispatchHandlerMsg(Message msg){

    }

    protected void gone(View... views) {
        for (View v : views) {
            v.setVisibility(View.GONE);
        }
    }

    protected void visiable(View... views) {
        for (View v : views) {
            v.setVisibility(View.VISIBLE);
        }
    }

    /**
     * @param statue IEmptyLayout.Type.XXX
     */
    protected void setStatue(int statue){
        emptyLayout.setEmptyType(statue);
    }

}
