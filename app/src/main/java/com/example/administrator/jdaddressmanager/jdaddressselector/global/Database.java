package com.example.administrator.jdaddressmanager.jdaddressselector.global;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.administrator.jdaddressmanager.jdaddressselector.model.City;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.County;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */

public class Database {
    private String TAG = "Database";
    public static final String NAME = "area.db";
    public static final int VERSION = 1;

    private static final String PROVINCE_TABLE_NAME = "Province";
    private static final String CITY_TABLE_NAME = "City";
    private static final String COUNTY_TABLE_NAME = "County";

    private SQLiteDatabase db;

    public Database(SQLiteDatabase db) {
        this.db = db;
    }

    public List<Province> getAllProvices() {
        if (db == null) {
            return null;
        }
        List<Province> list = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * from " + PROVINCE_TABLE_NAME, null);
        while (c.moveToNext()) {
            String province = c.getString(c.getColumnIndex("name"));
            int id = c.getInt(c.getColumnIndex("id"));
            Province item = new Province(id, province);
            list.add(item);
        }
        c.close();
      //  db.close();
        return list;
    }

    public List<City> getAllCityByProviceId(int province_id) {
        if (db == null) {
            return null;
        }
        List<City> list = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * from " + CITY_TABLE_NAME + " WHERE province_id=?", new String[]{String.valueOf(province_id)});
        while (c.moveToNext()) {
            String city = c.getString(c.getColumnIndex("name"));
            int id = c.getInt(c.getColumnIndex("id"));
            City item = new City(id, province_id, city);
            list.add(item);
        }
        c.close();
      //  db.close();
        return list;
    }

    public List<County> getAllCountyByCityId(int city_id) {
        if (db == null) {
            return null;
        }
        List<County> list = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * from " + COUNTY_TABLE_NAME + " WHERE city_id=?", new String[]{String.valueOf(city_id)});
        while (c.moveToNext()) {
            String city = c.getString(c.getColumnIndex("name"));
            int id = c.getInt(c.getColumnIndex("id"));
            County item = new County(id, city_id, city);
            list.add(item);
        }
        c.close();
       // db.close();
        return list;
    }
    public void close(){
        if (db!=null){
            db.close();
        }
    }
}
