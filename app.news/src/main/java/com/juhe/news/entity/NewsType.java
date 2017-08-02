package com.juhe.news.entity;

/**
 * Created by Administrator on 17.8.2.
 */

public class NewsType {
    private String typeKey;
    private String typeName;

    public NewsType() {
    }

    public NewsType(String typeKey, String typeName) {
        this.typeKey = typeKey;
        this.typeName = typeName;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
