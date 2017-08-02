package com.juhe.news.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.juhe.news.R;
import com.juhe.news.adapter.NewsPagerAdapter;
import com.juhe.news.entity.NewsType;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NewsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewsType> types = new ArrayList<>();
        types.add(new NewsType("top","头条"));
        types.add(new NewsType("shehui","社会"));
        types.add(new NewsType("guonei","国内"));
        types.add(new NewsType("guoji","国际"));
        types.add(new NewsType("yule","娱乐"));
        types.add(new NewsType("tiyu","体育"));
        types.add(new NewsType("junshi","军事"));
        types.add(new NewsType("keji","科技"));
        types.add(new NewsType("caijing","财经"));
        types.add(new NewsType("shishang","时尚"));

        mSectionsPagerAdapter = new NewsPagerAdapter(getSupportFragmentManager(),types);

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(5);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

}
