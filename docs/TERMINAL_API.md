## Terminal APIs

Terminal APIs allow third-party application query terminal geolocation, online status and so on.

All the terminal APIs are in the class *com.pax.market.api.sdk.java.api.terminal.TerminalApi*.   

**Constructors of TerminalApi**

```
public TerminalApi(String baseUrl, String appKey, String appSecret);
```

**Constructor parameters description**

|Name|Type|Description|
|:--|:--|:--|
|baseUrl|String|the base url of REST API|
|appKey|String|the application key, get this key from PAXSTORE developer application detail console -> APP KEYS.|
|appSecret|String|the application secret, get app secret from PAXSTORE developer application detail console -> APP KEYS.|
|terminalSN|String|the terminal serial No. for single terminal app call. Ignore this param for backend service call.|


### Get Geolocation

Allow third-party application or backend service to query terminal geolocation.

Excluding terminal(s) which not installed this third-party application from result.

**API**

```
public SdkPageObject<TerminalOnlineStatus> getOnlineStatus(List<String> serialNoList)
```

**Input parameter(s) description**

| Name| Type | Nullable|Description |
|:--- | :---|:---|:---|
|serialNos|List&lt;String&gt;|false|the terminal serial No. list|
|pageNo|int|false|page number, value must >= 1|
|pageSize|int|false|the record number per page, range is 1 to 1000|

**Sample codes**

```
TerminalApi terminalApi = new TerminalApi(BASEURL, KEY, SECRET);
SdkPageObject<TerminalLocation> geolocations = terminalApi.getGeolocation(serialNos, 1, 100);
```

**Validation failed sample result(JSON format)**

```
{
  "businessCode": 1833,
  "message": "Query location is not allowed"
}
```

**Successful sample result(JSON format)**

```
{
  "businessCode": 0,
  "list": [
    {
      "id": 770399,
      "serialNo": "0820156379",
      "lat": 31.308515,
      "lng": 120.774985,
      "updatedDate": 1520216048000
    },
    {
      "id": 44548,
      "serialNo": "1240000236",
      "lat": 31.308513,
      "lng": 120.775069,
      "updatedDate": 1519981127000
    }
  ],
  "totalCount": 2
}
```

The type in dataSet of result is list of TerminalLocation. The TerminalLocation structure shows below.

Structure of class TerminalLocation

|Property Name|Type|Description|
|:--|:--|:--|
|id|Long|Terminal id.|
|serialNo|String|Serial number of terminal.|
|lat|Double|The latitude coordinate.|
|lng|Double|The longitude coordinate.|


### Get online status

Allow third-party application or backend service to query terminal online status.

Excluding terminal(s) which not installed this third-party application from result.

**API**

```
public SdkPageObject<TerminalOnlineStatus> getOnlineStatus(List<String> serialNos, int pageNo, int pageSize)
```

**Input parameter(s) description**

| Name| Type | Nullable|Description |
|:--- | :---|:---|:---|
|serialNos|List&lt;String&gt;|false|the terminal serial No. list|
|pageNo|int|false|page number, value must >= 1|
|pageSize|int|false|the record number per page, range is 1 to 1000|


**Sample codes**

```
TerminalApi terminalApi = new TerminalApi(BASEURL, KEY, SECRET);
SdkPageObject<TerminalOnlineStatus> geolocations = terminalApi.getOnlineStatus(serialNos, 1, 100);
```

**Validation failed sample result(JSON format)**

```
{
  "businessCode": 1016,
  "message": "App Key or App Secret is invalid"
}
```

**Successful sample result(JSON format)**

```
{
  "businessCode": 0,
  "list": [
    {
      "id": 44548,
      "serialNo": "1240000236",
      "onlineStatus": 2
    },
    {
      "id": 770399,
      "serialNo": "0820156379",
      "onlineStatus": 1
    }
  ],
  "totalCount": 2
}
```

The type in dataSet of result is list of TerminalOnlineStatus. The TerminalOnlineStatus structure shows below.

Structure of class TerminalOnlineStatus

|Property Name|Type|Description|
|:--|:--|:--|
|id|Long|Terminal id.|
|serialNo|String|Serial number of terminal.|
|onlineStatus|int|The online status: 0 is unavailable, 1 is offline, 2 is online.|
