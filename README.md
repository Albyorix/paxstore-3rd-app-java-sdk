# PAXSTORE 3rd App Java SDK [ ![Download](https://api.bintray.com/packages/paxstore-support/paxstore/paxstore-3rd-app-java-sdk/images/download.svg?version=6.2) ](https://bintray.com/paxstore-support/paxstore/paxstore-3rd-app-java-sdk/6.2/link)

PAXSTORE 3rd App Java SDK provides the basic java APIs for third party developers to integrate their apps on PAXSTORE.

## Integrate with SDK

Gradle:<br/>
```
implementation 'com.pax.market:paxstore-3rd-app-java-sdk:6.3'
```

Maven:<br/>
```
<dependency>
    <groupId>com.pax.market</groupId>
    <artifactId>paxstore-3rd-app-java-sdk/</artifactId>
    <version>6.3</version>
</dependency>
```

## Sample Code
```
public class Sample {

	private String BASEURL = "https://api.whatspos.com/p-market-api";
	private String KEY = "YOUR APP KEY";
	private String SECRET = "YOUR APP SECRET";

	public SdkPageObject<TerminalLocation> getGeolocation(List<String> serialNos) {
        TerminalApi terminalApi = new TerminalApi(BASEURL, KEY, SECRET);
        SdkPageObject<TerminalLocation> geolocations = terminalApi.getGeolocation(serialNos);
    	return geolocations;
	}
}
```

## [Terminal APIs](docs/TERMINAL_API.md)

## [PARAM APIs](docs/PARAM_API.md)

## [SYNC APIs](docs/SYNC_API.md)

## License

See the [Apache 2.0 license](https://github.com/PAXSTORE/paxstore-3rd-app-android-sdk/blob/master/LICENSE) file for details.

    Copyright 2018 PAX Computer Technology(Shenzhen) CO., LTD ("PAX")

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at following link.

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
