# FaresApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ticketsAgenciesGet**](FaresApi.md#ticketsAgenciesGet) | **GET** /tickets/agencies | Returns agencies list
[**ticketsFaresAgencyIdTagGet**](FaresApi.md#ticketsFaresAgencyIdTagGet) | **GET** /tickets/fares/{agencyId}/{tag} | Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;
[**ticketsFaresAttributesFareIdGet**](FaresApi.md#ticketsFaresAttributesFareIdGet) | **GET** /tickets/fares/attributes/{fareId} | Returns attributes of a given fare
[**ticketsFaresDelete**](FaresApi.md#ticketsFaresDelete) | **DELETE** /tickets/fares | Delete a given fare
[**ticketsFaresGet**](FaresApi.md#ticketsFaresGet) | **GET** /tickets/fares | Returns fare tickets list
[**ticketsFaresLineZonePost**](FaresApi.md#ticketsFaresLineZonePost) | **POST** /tickets/fares/line-zone | Add new line/zone fare
[**ticketsFaresOriginDestinationPost**](FaresApi.md#ticketsFaresOriginDestinationPost) | **POST** /tickets/fares/origin-destination | Add new origin/destination fare
[**ticketsFaresSearchPost**](FaresApi.md#ticketsFaresSearchPost) | **POST** /tickets/fares/search | Returns fare tickets list
[**ticketsFaresUniqueAgencyIdTagGet**](FaresApi.md#ticketsFaresUniqueAgencyIdTagGet) | **GET** /tickets/fares/unique/{agencyId}/{tag} | Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;
[**ticketsNotesAgencyIdGet**](FaresApi.md#ticketsNotesAgencyIdGet) | **GET** /tickets/notes/{agencyId} | Returns notes list
[**ticketsRoutesAgencyIdGet**](FaresApi.md#ticketsRoutesAgencyIdGet) | **GET** /tickets/routes/{agencyId} | Returns routes list
[**ticketsRoutesSearchPost**](FaresApi.md#ticketsRoutesSearchPost) | **POST** /tickets/routes/search | Returns routes list
[**ticketsRoutesTypesNearbyPost**](FaresApi.md#ticketsRoutesTypesNearbyPost) | **POST** /tickets/routes/types/nearby | Returns route types list nearby a given position
[**ticketsStopStopIdGet**](FaresApi.md#ticketsStopStopIdGet) | **GET** /tickets/stop/{stopId} | Returns tickets stop info
[**ticketsStopsAgencyIdGet**](FaresApi.md#ticketsStopsAgencyIdGet) | **GET** /tickets/stops/{agencyId} | Returns tickets stops list
[**ticketsStopsAgencyIdRouteTypeGet**](FaresApi.md#ticketsStopsAgencyIdRouteTypeGet) | **GET** /tickets/stops/{agencyId}/{routeType} | Returns stops list
[**ticketsStopsNearbyPost**](FaresApi.md#ticketsStopsNearbyPost) | **POST** /tickets/stops/nearby | Returns stops list nearby a given position
[**ticketsZonesAgencyIdGet**](FaresApi.md#ticketsZonesAgencyIdGet) | **GET** /tickets/zones/{agencyId} | Returns zones list
[**ticketsZonesFindByStopsPost**](FaresApi.md#ticketsZonesFindByStopsPost) | **POST** /tickets/zones/findByStops | Returns zones list
[**ticketsZonesNearbyPost**](FaresApi.md#ticketsZonesNearbyPost) | **POST** /tickets/zones/nearby | Returns zones list nearby a given position


<a name="ticketsAgenciesGet"></a>
# **ticketsAgenciesGet**
> ticketsAgenciesGet()

Returns agencies list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
try {
    apiInstance.ticketsAgenciesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsAgenciesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresAgencyIdTagGet"></a>
# **ticketsFaresAgencyIdTagGet**
> ticketsFaresAgencyIdTagGet(agencyId, tag)

Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.ticketsFaresAgencyIdTagGet(agencyId, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresAgencyIdTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresAttributesFareIdGet"></a>
# **ticketsFaresAttributesFareIdGet**
> ticketsFaresAttributesFareIdGet(fareId)

Returns attributes of a given fare

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String fareId = "fareId_example"; // String | fare attribuites request
try {
    apiInstance.ticketsFaresAttributesFareIdGet(fareId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresAttributesFareIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fareId** | **String**| fare attribuites request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresDelete"></a>
# **ticketsFaresDelete**
> ticketsFaresDelete(fareId)

Delete a given fare

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String fareId = "fareId_example"; // String | Fare id to delete
try {
    apiInstance.ticketsFaresDelete(fareId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fareId** | **String**| Fare id to delete |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresGet"></a>
# **ticketsFaresGet**
> ticketsFaresGet(agencyId, tag, unique, userId)

Returns fare tickets list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
String tag = "tag_example"; // String | gtfs tag
Boolean unique = true; // Boolean | get unique results
String userId = "userId_example"; // String | user id
try {
    apiInstance.ticketsFaresGet(agencyId, tag, unique, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **tag** | **String**| gtfs tag | [optional]
 **unique** | **Boolean**| get unique results | [optional]
 **userId** | **String**| user id | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresLineZonePost"></a>
# **ticketsFaresLineZonePost**
> ticketsFaresLineZonePost(body)

Add new line/zone fare

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
CreateLineZoneTicketRequest body = new CreateLineZoneTicketRequest(); // CreateLineZoneTicketRequest | line/zone fare creation
try {
    apiInstance.ticketsFaresLineZonePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresLineZonePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLineZoneTicketRequest**](CreateLineZoneTicketRequest.md)| line/zone fare creation |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresOriginDestinationPost"></a>
# **ticketsFaresOriginDestinationPost**
> ticketsFaresOriginDestinationPost(body)

Add new origin/destination fare

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
CreateOriginDestinationTicketRequest body = new CreateOriginDestinationTicketRequest(); // CreateOriginDestinationTicketRequest | line/zone fare creation
try {
    apiInstance.ticketsFaresOriginDestinationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresOriginDestinationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOriginDestinationTicketRequest**](CreateOriginDestinationTicketRequest.md)| line/zone fare creation |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresSearchPost"></a>
# **ticketsFaresSearchPost**
> ticketsFaresSearchPost(body)

Returns fare tickets list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
FareRequest body = new FareRequest(); // FareRequest | fare request
try {
    apiInstance.ticketsFaresSearchPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FareRequest**](FareRequest.md)| fare request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsFaresUniqueAgencyIdTagGet"></a>
# **ticketsFaresUniqueAgencyIdTagGet**
> ticketsFaresUniqueAgencyIdTagGet(agencyId, tag)

Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.ticketsFaresUniqueAgencyIdTagGet(agencyId, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsFaresUniqueAgencyIdTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsNotesAgencyIdGet"></a>
# **ticketsNotesAgencyIdGet**
> ticketsNotesAgencyIdGet(agencyId)

Returns notes list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.ticketsNotesAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsNotesAgencyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsRoutesAgencyIdGet"></a>
# **ticketsRoutesAgencyIdGet**
> ticketsRoutesAgencyIdGet(agencyId)

Returns routes list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.ticketsRoutesAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsRoutesAgencyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsRoutesSearchPost"></a>
# **ticketsRoutesSearchPost**
> ticketsRoutesSearchPost(body)

Returns routes list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
RouteRequest body = new RouteRequest(); // RouteRequest | route request
try {
    apiInstance.ticketsRoutesSearchPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsRoutesSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteRequest**](RouteRequest.md)| route request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsRoutesTypesNearbyPost"></a>
# **ticketsRoutesTypesNearbyPost**
> ticketsRoutesTypesNearbyPost(body)

Returns route types list nearby a given position

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
Body4 body = new Body4(); // Body4 | route request
try {
    apiInstance.ticketsRoutesTypesNearbyPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsRoutesTypesNearbyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body4**](Body4.md)| route request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsStopStopIdGet"></a>
# **ticketsStopStopIdGet**
> ticketsStopStopIdGet(stopId)

Returns tickets stop info

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String stopId = "stopId_example"; // String | stop id
try {
    apiInstance.ticketsStopStopIdGet(stopId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsStopStopIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **String**| stop id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsStopsAgencyIdGet"></a>
# **ticketsStopsAgencyIdGet**
> ticketsStopsAgencyIdGet(agencyId)

Returns tickets stops list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.ticketsStopsAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsStopsAgencyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsStopsAgencyIdRouteTypeGet"></a>
# **ticketsStopsAgencyIdRouteTypeGet**
> ticketsStopsAgencyIdRouteTypeGet(agencyId, routeType)

Returns stops list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
String routeType = "routeType_example"; // String | stops request by route types
try {
    apiInstance.ticketsStopsAgencyIdRouteTypeGet(agencyId, routeType);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsStopsAgencyIdRouteTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **routeType** | **String**| stops request by route types |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsStopsNearbyPost"></a>
# **ticketsStopsNearbyPost**
> ticketsStopsNearbyPost(body)

Returns stops list nearby a given position

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
Body3 body = new Body3(); // Body3 | stop request
try {
    apiInstance.ticketsStopsNearbyPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsStopsNearbyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body3**](Body3.md)| stop request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsZonesAgencyIdGet"></a>
# **ticketsZonesAgencyIdGet**
> ticketsZonesAgencyIdGet(agencyId)

Returns zones list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.ticketsZonesAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsZonesAgencyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsZonesFindByStopsPost"></a>
# **ticketsZonesFindByStopsPost**
> ticketsZonesFindByStopsPost(body)

Returns zones list

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
Body5 body = new Body5(); // Body5 | zones request by stops
try {
    apiInstance.ticketsZonesFindByStopsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsZonesFindByStopsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)| zones request by stops |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsZonesNearbyPost"></a>
# **ticketsZonesNearbyPost**
> ticketsZonesNearbyPost(body)

Returns zones list nearby a given position

### Example
```java
// Import classes:
//import com.openmove.api.FaresApi;

FaresApi apiInstance = new FaresApi();
Body6 body = new Body6(); // Body6 | zone request
try {
    apiInstance.ticketsZonesNearbyPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FaresApi#ticketsZonesNearbyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body6**](Body6.md)| zone request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

