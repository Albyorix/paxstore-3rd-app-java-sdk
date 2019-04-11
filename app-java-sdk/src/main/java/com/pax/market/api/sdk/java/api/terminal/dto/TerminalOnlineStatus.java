/*
 * ******************************************************************************
 * COPYRIGHT
 *               PAX TECHNOLOGY, Inc. PROPRIETARY INFORMATION
 *   This software is supplied under the terms of a license agreement or
 *   nondisclosure agreement with PAX  Technology, Inc. and may not be copied
 *   or disclosed except in accordance with the terms in that agreement.
 *
 *      Copyright (C) 2019 PAX Technology, Inc. All rights reserved.
 * ******************************************************************************
 */

package com.pax.market.api.sdk.java.api.terminal.dto;

import com.google.gson.annotations.SerializedName;
import com.pax.market.api.sdk.java.base.dto.SdkObject;

/**
 * Created by fojut on 2019/4/8.
 */

public class TerminalOnlineStatus extends SdkObject {
    @SerializedName("id")
    private Long id;
    @SerializedName("serialNo")
    private String serialNo;
    @SerializedName("onlineStatus")
    private Integer onlineStatus;

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

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public boolean isOnline (){
        return onlineStatus != null && onlineStatus.intValue() == 2;
    }
}
