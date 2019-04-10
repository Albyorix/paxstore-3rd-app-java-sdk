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

import java.io.Serializable;
import java.util.List;

/**
 * Created by fanjun on 2019/4/4.
 */
public class TerminalSNsQueryRequest implements Serializable {
    private static final long serialVersionUID = -904476726515451341L;

    private List<String> serialNos;

    private int pageNo = 1;         // 当前页码
    private int pageSize = -1;      // 页面大小，-1不分页

    public List<String> getSerialNos() {
        return serialNos;
    }
    public void setSerialNos(List<String> serialNos) {
        this.serialNos = serialNos;
    }
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
