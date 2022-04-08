package com.paydaytrade.orderservice.links;

public enum ServiceLinks {

    STOCK_INFOMATION_GET("/v1`/stock/get-stock/");

    private String link;

    ServiceLinks(){}

    ServiceLinks(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }


}
