package com.example.administrator.jdaddressmanager.jdaddressselector;

import com.example.administrator.jdaddressmanager.jdaddressselector.global.Database;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.City;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.County;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.Province;

import java.util.List;


public interface AddressProvider {
    void provideProvinces(Database database,AddressReceiver<Province> addressReceiver);
    void provideCitiesWith(Database database,int provinceId, AddressReceiver<City> addressReceiver);
    void provideCountiesWith(Database database,int cityId, AddressReceiver<County> addressReceiver);

    interface AddressReceiver<T> {
        void send(List<T> data);
    }
}