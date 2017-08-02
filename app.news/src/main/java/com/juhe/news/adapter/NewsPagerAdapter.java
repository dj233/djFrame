package com.juhe.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.juhe.news.entity.NewsType;
import com.juhe.news.fragment.NewsListFragment;

import java.util.List;

import market.lib.ui.adapter.TabPageAdapter;

/**
 * Created by Administrator on 17.8.2.
 */

public class NewsPagerAdapter extends TabPageAdapter<NewsType> {
    public NewsPagerAdapter(FragmentManager fm, List<NewsType> dataList) {
        super(fm, dataList);
    }

    @Override
    protected Fragment buildPage(int pos, NewsType item) {
        String type = item.getTypeKey();
        return NewsListFragment.$(type);
    }

    @Override
    protected String getTabName(int pos, NewsType item) {
        return item.getTypeName();
    }
}
