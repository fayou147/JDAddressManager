package com.example.administrator.jdaddressmanager.jdaddressselector.model;

/**
 * Created by Administrator on 2016/8/10.
 */

public class City {

    public int id;
    public int province_id;
    public String name;

    public City(int id, int province_id, String name) {
        this.id = id;
        this.province_id = province_id;
        this.name = name;
    }
}
