package com.juhe.news.entity;

/**
 * Created by Administrator on 17.8.2.
 */

public class News {

    /**
     * uniquekey : 5eedf7d576bcb5efd9b8758cebdd5013
     * title : 三年过去了，赵丽颖的恋情藏不住了，网友纷纷祝福！
     * date : 2017-08-02 06:36
     * category : 头条
     * author_name : 赵梦杨
     * url : http://mini.eastday.com/mobile/170802063647423.html
     * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170802/20170802063647_d41d8cd98f00b204e9800998ecf8427e_9_mwpm_03200403.jpg
     * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170802/20170802063647_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg
     * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170802/20170802063647_d41d8cd98f00b204e9800998ecf8427e_11_mwpm_03200403.jpg
     */

    private String uniquekey;
    private String title;
    private String date;
    private String category;
    private String author_name;
    private String url;
    private String thumbnail_pic_s;
    private String thumbnail_pic_s02;
    private String thumbnail_pic_s03;

    public String getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail_pic_s() {
        return thumbnail_pic_s;
    }

    public void setThumbnail_pic_s(String thumbnail_pic_s) {
        this.thumbnail_pic_s = thumbnail_pic_s;
    }

    public String getThumbnail_pic_s02() {
        return thumbnail_pic_s02;
    }

    public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
    }

    public String getThumbnail_pic_s03() {
        return thumbnail_pic_s03;
    }

    public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }
}
