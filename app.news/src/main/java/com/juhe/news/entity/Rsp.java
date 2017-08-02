package com.juhe.news.entity;

import java.util.List;

/**
 * Created by Administrator on 17.8.2.
 */

public class Rsp {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[]}
     * error_code : 0
     */

    private String reason;
    private Result result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class Result {
        /**
         * stat : 1
         * data : []
         */

        private String stat;
        private List<News> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<News> getData() {
            return data;
        }

        public void setData(List<News> data) {
            this.data = data;
        }
    }
}
