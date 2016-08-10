package com.example.administrator.jdaddressmanager.jdaddressselector.model;

/**
 * Created by Administrator on 2016/8/10.
 */

public class Province {
    public int id;
    public String name;

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
