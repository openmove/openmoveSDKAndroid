# ShelterApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shelterAgenciesGet**](ShelterApi.md#shelterAgenciesGet) | **GET** /shelter/agencies | Returns agencies list
[**shelterCalendarDatesTagGet**](ShelterApi.md#shelterCalendarDatesTagGet) | **GET** /shelter/calendarDates/{tag} | Returns calendar dates list of given agency tag
[**shelterCalendarTagGet**](ShelterApi.md#shelterCalendarTagGet) | **GET** /shelter/calendar/{tag} | Returns calendar list of given agency tag
[**shelterRoutesTagGet**](ShelterApi.md#shelterRoutesTagGet) | **GET** /shelter/routes/{tag} | Returns routes list of given agency tag
[**shelterShapesTagShapeIdGet**](ShelterApi.md#shelterShapesTagShapeIdGet) | **GET** /shelter/shapes/{tag}/{shapeId} | Returns shapes list of given agency tag
[**shelterStopTimesTagTripIdGet**](ShelterApi.md#shelterStopTimesTagTripIdGet) | **GET** /shelter/stopTimes/{tag}/{tripId} | Returns stopTimes list of given agency tag and trip id
[**shelterStopTimesTagTripIdStopIdGet**](ShelterApi.md#shelterStopTimesTagTripIdStopIdGet) | **GET** /shelter/stopTimes/{tag}/{tripId}/{stopId} | Returns stopTimes list of given agency tag, trip id and stop id
[**shelterStopsTagGet**](ShelterApi.md#shelterStopsTagGet) | **GET** /shelter/stops/{tag} | Returns stops list of given agency tag
[**shelterTripsTagRouteIdGet**](ShelterApi.md#shelterTripsTagRouteIdGet) | **GET** /shelter/trips/{tag}/{routeId} | Returns trips list of given agency tag and route id


<a name="shelterAgenciesGet"></a>
# **shelterAgenciesGet**
> shelterAgenciesGet()

Returns agencies list

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
try {
    apiInstance.shelterAgenciesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterAgenciesGet");
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

<a name="shelterCalendarDatesTagGet"></a>
# **shelterCalendarDatesTagGet**
> shelterCalendarDatesTagGet(tag)

Returns calendar dates list of given agency tag

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.shelterCalendarDatesTagGet(tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterCalendarDatesTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterCalendarTagGet"></a>
# **shelterCalendarTagGet**
> shelterCalendarTagGet(tag)

Returns calendar list of given agency tag

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.shelterCalendarTagGet(tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterCalendarTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterRoutesTagGet"></a>
# **shelterRoutesTagGet**
> shelterRoutesTagGet(tag)

Returns routes list of given agency tag

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.shelterRoutesTagGet(tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterRoutesTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterShapesTagShapeIdGet"></a>
# **shelterShapesTagShapeIdGet**
> shelterShapesTagShapeIdGet(tag, shapeId)

Returns shapes list of given agency tag

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
String shapeId = "shapeId_example"; // String | gtfs shape id
try {
    apiInstance.shelterShapesTagShapeIdGet(tag, shapeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterShapesTagShapeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |
 **shapeId** | **String**| gtfs shape id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterStopTimesTagTripIdGet"></a>
# **shelterStopTimesTagTripIdGet**
> shelterStopTimesTagTripIdGet(tag, tripId)

Returns stopTimes list of given agency tag and trip id

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
String tripId = "tripId_example"; // String | gtfs trip id
try {
    apiInstance.shelterStopTimesTagTripIdGet(tag, tripId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterStopTimesTagTripIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |
 **tripId** | **String**| gtfs trip id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterStopTimesTagTripIdStopIdGet"></a>
# **shelterStopTimesTagTripIdStopIdGet**
> shelterStopTimesTagTripIdStopIdGet(tag, tripId, stopId)

Returns stopTimes list of given agency tag, trip id and stop id

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
String tripId = "tripId_example"; // String | gtfs trip id
String stopId = "stopId_example"; // String | gtfs stop id
try {
    apiInstance.shelterStopTimesTagTripIdStopIdGet(tag, tripId, stopId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterStopTimesTagTripIdStopIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |
 **tripId** | **String**| gtfs trip id |
 **stopId** | **String**| gtfs stop id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterStopsTagGet"></a>
# **shelterStopsTagGet**
> shelterStopsTagGet(tag)

Returns stops list of given agency tag

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
try {
    apiInstance.shelterStopsTagGet(tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterStopsTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shelterTripsTagRouteIdGet"></a>
# **shelterTripsTagRouteIdGet**
> shelterTripsTagRouteIdGet(tag, routeId)

Returns trips list of given agency tag and route id

### Example
```java
// Import classes:
//import com.openmove.api.ShelterApi;

ShelterApi apiInstance = new ShelterApi();
String tag = "tag_example"; // String | gtfs tag
String routeId = "routeId_example"; // String | gtfs route id
try {
    apiInstance.shelterTripsTagRouteIdGet(tag, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ShelterApi#shelterTripsTagRouteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| gtfs tag |
 **routeId** | **String**| gtfs route id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

