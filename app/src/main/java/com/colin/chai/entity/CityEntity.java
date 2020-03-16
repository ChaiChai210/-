package com.colin.chai.entity;


import com.colin.indexview.entity.BaseEntity;

/**
 * @author: laohu on 2016/12/25
 * @site: http://ittiger.cn
 */

public class CityEntity implements BaseEntity {
    private String mCityName;

    public CityEntity(String cityName) {

        mCityName = cityName;
    }

    @Override
    public String getIndexField() {

        return mCityName;
    }

    public String getCityName() {

        return mCityName;
    }

    public void setCityName(String cityName) {

        mCityName = cityName;
    }
}
