## PARAM APIs

Param APIs allow third-party application download parameters.

**Constructors of ParamApi**

```
public ParamApi(String baseUrl, String appKey, String appSecret, String termianlSN)
```

**Constructor parameters description**

|Name|Type|Description|
|:--|:--|:--|
|baseUrl|String|the base url of REST API|
|appKey|String|the application key, get this key from PAXSTORE developer application detail console -> APP KEYS.|
|appSecret|String|the application secret, get app secret from PAXSTORE developer application detail console -> APP KEYS.|
|terminalSN|String|the terminal serial No. for single terminal app call. Ignore this param for backend service call.|


