package com.pax.market.api.sdk.java.api.terminal.dto;

import com.google.gson.annotations.SerializedName;
import com.pax.market.api.sdk.java.base.dto.SdkObject;

import java.util.Date;

/**
 * Created by fojut on 2019/4/8.
 */
public class TerminalLocation extends SdkObject {
    @SerializedName("id")
    private Long id;
    @SerializedName("serialNo")
    private String serialNo;
    @SerializedName("lat")
    private Double lat;
    @SerializedName("lng")
    private Double lng;
    @SerializedName("updatedDate")
    private Date updatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
