package com.example.administrator.jdaddressmanager.jdaddressselector;

import com.example.administrator.jdaddressmanager.jdaddressselector.model.City;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.County;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.Province;

public interface OnAddressSelectedListener {
    void onAddressSelected(Province province, City city, County county);
}
