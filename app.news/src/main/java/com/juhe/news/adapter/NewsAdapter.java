package com.juhe.news.adapter;

import android.content.Context;

import com.juhe.news.R;
import com.juhe.news.entity.News;

import market.lib.ui.adapter.RecyclerAdapter;
import market.lib.ui.viewholder.BaseViewHolder;

/**
 * Created by Administrator on 17.8.2.
 */

public class NewsAdapter extends RecyclerAdapter<News> {

    public NewsAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    public int getItemLayout(int viewType) {
        return R.layout.item_news;
    }

    @Override
    public void bindData(int viewType, BaseViewHolder holder, News item) {
        holder.setImageUrl(R.id.item_news_img,item.getThumbnail_pic_s());
        holder.setText(R.id.item_news_title,item.getTitle());
        holder.setText(R.id.item_news_author,item.getAuthor_name());
        holder.setText(R.id.item_news_category,item.getCategory());
        holder.setText(R.id.item_news_date,item.getDate());
    }
}
