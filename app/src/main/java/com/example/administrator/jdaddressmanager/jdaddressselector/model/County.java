package com.example.administrator.jdaddressmanager.jdaddressselector.model;

/**
 * Created by Administrator on 2016/8/10.
 */

public class County {
    public int id;
    public int city_id;
    public String name;

    public County(int id, int city_id, String name) {
        this.id = id;
        this.city_id = city_id;
        this.name = name;
    }
}
