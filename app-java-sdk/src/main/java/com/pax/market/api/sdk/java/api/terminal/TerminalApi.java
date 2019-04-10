package com.pax.market.api.sdk.java.api.terminal;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pax.market.api.sdk.java.api.terminal.dto.TerminalLocation;
import com.pax.market.api.sdk.java.api.terminal.dto.TerminalOnlineStatus;
import com.pax.market.api.sdk.java.api.terminal.dto.TerminalSNsQueryRequest;
import com.pax.market.api.sdk.java.base.api.BaseApi;
import com.pax.market.api.sdk.java.base.constant.Constants;
import com.pax.market.api.sdk.java.base.dto.SdkPageObject;
import com.pax.market.api.sdk.java.base.request.SdkRequest;
import com.pax.market.api.sdk.java.base.util.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by fojut on 2019/4/8.
 */
public class TerminalApi extends BaseApi {

    private final Logger logger = LoggerFactory.getLogger(TerminalApi.class.getSimpleName());

    /**
     * The constant get terminal geolocation URL
     */
    protected static String getGeolocationUrl = "/3rdApps/terminals/geolocation";
    /**
     * The constant get.
     */
    protected static String getOnlineStatusUrl = "/3rdApps/terminals/onlineStatus";

    /**
     * Constructor for 3rd-party backend service without terminal SN.
     *
     * @param baseUrl
     * @param appKey
     * @param appSecret
     */
    public TerminalApi(String baseUrl, String appKey, String appSecret) {
        super(baseUrl, appKey, appSecret, null);
    }

    /**
     * Constructor for 3rd-party app installed in single terminal.
     *
     * @param baseUrl
     * @param appKey
     * @param appSecret
     * @param terminalSN
     */
    public TerminalApi(String baseUrl, String appKey, String appSecret, String terminalSN) {
        super(baseUrl, appKey, appSecret, terminalSN);
    }

    /**
     * Get terminal(s) geolocation by serial No. list.
     *
     * @param serialNoList
     * @return
     */
    public SdkPageObject<TerminalLocation> getGeolocation(List<String> serialNoList) {
        SdkRequest request = new SdkRequest(getGeolocationUrl);
        request.setRequestMethod(SdkRequest.RequestMethod.POST);
        request.addHeader(Constants.CONTENT_TYPE, Constants.CONTENT_TYPE_JSON);
        TerminalSNsQueryRequest queryRequest = new TerminalSNsQueryRequest();
        queryRequest.setSerialNos(serialNoList);
        request.setRequestBody(new Gson().toJson(queryRequest, TerminalSNsQueryRequest.class));
        return JsonUtils.fromJson(call(request), new TypeToken<SdkPageObject<TerminalLocation>>(){}.getType());
    }

    /**
     * Get terminal(s) online status by serial No. list.
     *
     * @param serialNoList
     * @return
     */
    public SdkPageObject<TerminalOnlineStatus> getOnlineStatus(List<String> serialNoList) {
        SdkRequest request = new SdkRequest(getOnlineStatusUrl);
        request.setRequestMethod(SdkRequest.RequestMethod.POST);
        request.addHeader(Constants.CONTENT_TYPE, Constants.CONTENT_TYPE_JSON);
        TerminalSNsQueryRequest queryRequest = new TerminalSNsQueryRequest();
        queryRequest.setSerialNos(serialNoList);
        request.setRequestBody(new Gson().toJson(queryRequest, TerminalSNsQueryRequest.class));
        return JsonUtils.fromJson(call(request), new TypeToken<SdkPageObject<TerminalLocation>>(){}.getType());
    }

}
