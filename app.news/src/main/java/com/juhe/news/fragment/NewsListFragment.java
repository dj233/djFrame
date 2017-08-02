package com.juhe.news.fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.juhe.news.adapter.NewsAdapter;
import com.juhe.news.entity.News;
import com.juhe.news.presenter.NewsListPresenter;

import market.lib.ui.adapter.RecyclerAdapter;
import market.lib.ui.fragment.BaseListFragment;
import market.lib.ui.presenter.BaseListContract;

/**
 * Created by Administrator on 17.8.2.
 */

public class NewsListFragment extends BaseListFragment<News> implements RecyclerAdapter.OnItemClickListener<News>{

    private String type;

    public static NewsListFragment $(String type){
        NewsListFragment fragment = new NewsListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type",type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void getIntentValue(Bundle bundle) {
        type = bundle.getString("type");
    }

    @Override
    protected RecyclerAdapter<News> initAdapter() {
        NewsAdapter adapter = new NewsAdapter(getContext());
        adapter.setOnItemClickListener(this);
        return adapter;
    }

    @Override
    protected BaseListContract.IPresenter initPresenter() {
        return new NewsListPresenter(this,type);
    }

    @Override
    public void onItemClick(News item, int pos) {
        Toast.makeText(getContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
    }
}
