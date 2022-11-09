# TripPlannerApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tripPlannerGetPost**](TripPlannerApi.md#tripPlannerGetPost) | **POST** /trip-planner/get | Returns trips list
[**tripPlannerTicketsGetPost**](TripPlannerApi.md#tripPlannerTicketsGetPost) | **POST** /trip-planner/tickets/get | Returns tickets list for a trip


<a name="tripPlannerGetPost"></a>
# **tripPlannerGetPost**
> tripPlannerGetPost(body)

Returns trips list

### Example
```java
// Import classes:
//import com.openmove.api.TripPlannerApi;

TripPlannerApi apiInstance = new TripPlannerApi();
TripRequest body = new TripRequest(); // TripRequest | trips request
try {
    apiInstance.tripPlannerGetPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TripPlannerApi#tripPlannerGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TripRequest**](TripRequest.md)| trips request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripPlannerTicketsGetPost"></a>
# **tripPlannerTicketsGetPost**
> tripPlannerTicketsGetPost(body)

Returns tickets list for a trip

### Example
```java
// Import classes:
//import com.openmove.api.TripPlannerApi;

TripPlannerApi apiInstance = new TripPlannerApi();
TripTicketsRequest body = new TripTicketsRequest(); // TripTicketsRequest | trip tickets request
try {
    apiInstance.tripPlannerTicketsGetPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TripPlannerApi#tripPlannerTicketsGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TripTicketsRequest**](TripTicketsRequest.md)| trip tickets request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

