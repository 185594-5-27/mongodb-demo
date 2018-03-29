package com.shop.mongodbdemo.sys.entity;

import java.util.Date;

public class OrderDetail {

    //点餐列表流水ID
    private long id;
    //菜单ID
    private int dinnerId;
    //订单ID
    private int orderId;
    //单价
    private String price;
    //数量
    private int num;
    //图片地址
    private String imageUrl;
    //菜品类型名字
    private String goodTypeName;
    //菜名
    private String name;
    //优惠价格
    private String preferentialPrice;
    //是否优惠（1：是；2：否）
    private String isPreferential;
    //下单时间
    private Date orderTime;
    // （1：正常；2：撤单）
    private String state;
    //点餐类型（1：正常；2：加菜）
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDinnerId() {
        return dinnerId;
    }

    public void setDinnerId(int dinnerId) {
        this.dinnerId = dinnerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferentialPrice() {
        return preferentialPrice;
    }

    public void setPreferentialPrice(String preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    public String getIsPreferential() {
        return isPreferential;
    }

    public void setIsPreferential(String isPreferential) {
        this.isPreferential = isPreferential;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
