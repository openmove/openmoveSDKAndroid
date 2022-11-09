# AnalyticsApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parkingAvailabilityGet**](AnalyticsApi.md#parkingAvailabilityGet) | **GET** /parking/availability | Report about parking availabilities
[**parkingCancellationGet**](AnalyticsApi.md#parkingCancellationGet) | **GET** /parking/cancellation | Report about parking cancellations
[**parkingReservationsGet**](AnalyticsApi.md#parkingReservationsGet) | **GET** /parking/reservations | Report about parking reservations
[**ticketsCountPost**](AnalyticsApi.md#ticketsCountPost) | **POST** /tickets/count | Totals about purchased tickets in given dates slot
[**ticketsStatusPost**](AnalyticsApi.md#ticketsStatusPost) | **POST** /tickets/status | Report about purchased tickets in given dates slot


<a name="parkingAvailabilityGet"></a>
# **parkingAvailabilityGet**
> parkingAvailabilityGet(date, startTime, endTime)

Report about parking availabilities

Return the parking slot available for the date passed. Without startTime and endTime the system search for daily availability.

### Example
```java
// Import classes:
//import com.openmove.api.AnalyticsApi;

AnalyticsApi apiInstance = new AnalyticsApi();
Integer date = 56; // Integer | Initial date of research. Syntax: YYYYMMDD
Integer startTime = 56; // Integer | Start time of research. Syntax: HHMMSS
Integer endTime = 56; // Integer | Start time of research. Syntax: HHMMSS
try {
    apiInstance.parkingAvailabilityGet(date, startTime, endTime);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#parkingAvailabilityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **Integer**| Initial date of research. Syntax: YYYYMMDD |
 **startTime** | **Integer**| Start time of research. Syntax: HHMMSS | [optional]
 **endTime** | **Integer**| Start time of research. Syntax: HHMMSS | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parkingCancellationGet"></a>
# **parkingCancellationGet**
> parkingCancellationGet(date)

Report about parking cancellations

Return the parking reservation deleted

### Example
```java
// Import classes:
//import com.openmove.api.AnalyticsApi;

AnalyticsApi apiInstance = new AnalyticsApi();
Integer date = 56; // Integer | Date of reservation. Syntax: YYYYMMDD
try {
    apiInstance.parkingCancellationGet(date);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#parkingCancellationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **Integer**| Date of reservation. Syntax: YYYYMMDD |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parkingReservationsGet"></a>
# **parkingReservationsGet**
> parkingReservationsGet(date, last)

Report about parking reservations

Returns parking reservations of a specific date or after the last received. Only one param has to be valued.

### Example
```java
// Import classes:
//import com.openmove.api.AnalyticsApi;

AnalyticsApi apiInstance = new AnalyticsApi();
Integer date = 56; // Integer | date in format YYYYMMDD
Integer last = 56; // Integer | last reservation received in unixtime (ms)
try {
    apiInstance.parkingReservationsGet(date, last);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#parkingReservationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **Integer**| date in format YYYYMMDD | [optional]
 **last** | **Integer**| last reservation received in unixtime (ms) | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketsCountPost"></a>
# **ticketsCountPost**
> ticketsCountPost(body)

Totals about purchased tickets in given dates slot

### Example
```java
// Import classes:
//import com.openmove.api.AnalyticsApi;

AnalyticsApi apiInstance = new AnalyticsApi();
Body2 body = new Body2(); // Body2 | get anonymized count ticket request
try {
    apiInstance.ticketsCountPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#ticketsCountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body2**](Body2.md)| get anonymized count ticket request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ticketsStatusPost"></a>
# **ticketsStatusPost**
> ticketsStatusPost(body)

Report about purchased tickets in given dates slot

### Example
```java
// Import classes:
//import com.openmove.api.AnalyticsApi;

AnalyticsApi apiInstance = new AnalyticsApi();
Body1 body = new Body1(); // Body1 | purchased tickets request
try {
    apiInstance.ticketsStatusPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#ticketsStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body1**](Body1.md)| purchased tickets request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

