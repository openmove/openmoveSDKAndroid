# BookingsApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agenciesGet**](BookingsApi.md#agenciesGet) | **GET** /agencies | Returns agencies enabled info
[**routesAgencyIdGet**](BookingsApi.md#routesAgencyIdGet) | **GET** /routes/{agencyId} | Returns routes info
[**routesWithFaresAgencyIdGet**](BookingsApi.md#routesWithFaresAgencyIdGet) | **GET** /routes-with-fares/{agencyId} | Returns routes info
[**stopsAgencyIdRouteIdGet**](BookingsApi.md#stopsAgencyIdRouteIdGet) | **GET** /stops/{agencyId}/{routeId} | Returns stops info
[**tripsGet**](BookingsApi.md#tripsGet) | **GET** /trips | Returns trips list
[**tripsReserveConfirmPost**](BookingsApi.md#tripsReserveConfirmPost) | **POST** /trips/reserve/confirm | Confirm reservation
[**tripsReserveDelete**](BookingsApi.md#tripsReserveDelete) | **DELETE** /trips/reserve | Delete reservation
[**tripsReservePost**](BookingsApi.md#tripsReservePost) | **POST** /trips/reserve | Register reservation (not confirmed), waiting for the confirmation
[**tripsReservePut**](BookingsApi.md#tripsReservePut) | **PUT** /trips/reserve | Update reservation with user info


<a name="agenciesGet"></a>
# **agenciesGet**
> agenciesGet()

Returns agencies enabled info

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
try {
    apiInstance.agenciesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#agenciesGet");
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

<a name="routesAgencyIdGet"></a>
# **routesAgencyIdGet**
> routesAgencyIdGet(agencyId)

Returns routes info

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.routesAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#routesAgencyIdGet");
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

<a name="routesWithFaresAgencyIdGet"></a>
# **routesWithFaresAgencyIdGet**
> routesWithFaresAgencyIdGet(agencyId)

Returns routes info

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
String agencyId = "agencyId_example"; // String | agency id
try {
    apiInstance.routesWithFaresAgencyIdGet(agencyId);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#routesWithFaresAgencyIdGet");
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

<a name="stopsAgencyIdRouteIdGet"></a>
# **stopsAgencyIdRouteIdGet**
> stopsAgencyIdRouteIdGet(agencyId, routeId)

Returns stops info

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
String agencyId = "agencyId_example"; // String | agency id
String routeId = "routeId_example"; // String | route id
try {
    apiInstance.stopsAgencyIdRouteIdGet(agencyId, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#stopsAgencyIdRouteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **routeId** | **String**| route id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripsGet"></a>
# **tripsGet**
> tripsGet(agencyId, routeId, stopIdFrom, stopIdTo, date, quantity)

Returns trips list

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
String agencyId = "agencyId_example"; // String | agency id
String routeId = "routeId_example"; // String | route id
String stopIdFrom = "stopIdFrom_example"; // String | from stop id
String stopIdTo = "stopIdTo_example"; // String | to stop id
String date = "date_example"; // String | start date
BigDecimal quantity = new BigDecimal(); // BigDecimal | number of passengers
try {
    apiInstance.tripsGet(agencyId, routeId, stopIdFrom, stopIdTo, date, quantity);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#tripsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agencyId** | **String**| agency id |
 **routeId** | **String**| route id |
 **stopIdFrom** | **String**| from stop id |
 **stopIdTo** | **String**| to stop id |
 **date** | **String**| start date |
 **quantity** | **BigDecimal**| number of passengers | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripsReserveConfirmPost"></a>
# **tripsReserveConfirmPost**
> tripsReserveConfirmPost(reserveConfirm)

Confirm reservation

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
ReserveConfirm1 reserveConfirm = new ReserveConfirm1(); // ReserveConfirm1 | trips reserve confirmation
try {
    apiInstance.tripsReserveConfirmPost(reserveConfirm);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#tripsReserveConfirmPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveConfirm** | [**ReserveConfirm1**](ReserveConfirm1.md)| trips reserve confirmation |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripsReserveDelete"></a>
# **tripsReserveDelete**
> tripsReserveDelete(reserveDelete)

Delete reservation

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
ReserveDelete reserveDelete = new ReserveDelete(); // ReserveDelete | trips reserve delete
try {
    apiInstance.tripsReserveDelete(reserveDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#tripsReserveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveDelete** | [**ReserveDelete**](ReserveDelete.md)| trips reserve delete |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripsReservePost"></a>
# **tripsReservePost**
> tripsReservePost(reserveRequest)

Register reservation (not confirmed), waiting for the confirmation

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
ReserveRequest reserveRequest = new ReserveRequest(); // ReserveRequest | trips reserve data
try {
    apiInstance.tripsReservePost(reserveRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#tripsReservePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveRequest** | [**ReserveRequest**](ReserveRequest.md)| trips reserve data |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="tripsReservePut"></a>
# **tripsReservePut**
> tripsReservePut(reserveConfirm)

Update reservation with user info

### Example
```java
// Import classes:
//import com.openmove.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
ReserveConfirm reserveConfirm = new ReserveConfirm(); // ReserveConfirm | trips reserve user info
try {
    apiInstance.tripsReservePut(reserveConfirm);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#tripsReservePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveConfirm** | [**ReserveConfirm**](ReserveConfirm.md)| trips reserve user info |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

