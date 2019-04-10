package com.pax.market.api.sdk.java.base.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fojut on 2019/4/8.
 */
public class SdkPageObject<T extends Serializable> extends SdkObject {

    @SerializedName("list")
    private List<T> list;
    @SerializedName("totalCount")
    private long totalCount;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotalCount() {
        if (totalCount == 0 && list != null) {
            return list.size();
        }
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "SdkPageObject{" +
                "list=" + list +
                ", totalCount=" + totalCount +
                "} " + super.toString();
    }
}
