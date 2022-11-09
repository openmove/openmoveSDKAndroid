# ParkingsApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parkingsFaresTypesGet**](ParkingsApi.md#parkingsFaresTypesGet) | **GET** /parkings/fares/types | Returns parkings fares
[**parkingsGet**](ParkingsApi.md#parkingsGet) | **GET** /parkings | Returns parkings
[**parkingsReserveConfirmPost**](ParkingsApi.md#parkingsReserveConfirmPost) | **POST** /parkings/reserve/confirm | Confirm reservation
[**parkingsReserveDelete**](ParkingsApi.md#parkingsReserveDelete) | **DELETE** /parkings/reserve | Delete parking reservation
[**parkingsReservePost**](ParkingsApi.md#parkingsReservePost) | **POST** /parkings/reserve | Register parking reservation (not confirmed) and get Stripe payment intent
[**parkingsReservePut**](ParkingsApi.md#parkingsReservePut) | **PUT** /parkings/reserve | Update parking reservation with payment info


<a name="parkingsFaresTypesGet"></a>
# **parkingsFaresTypesGet**
> parkingsFaresTypesGet()

Returns parkings fares

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
try {
    apiInstance.parkingsFaresTypesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsFaresTypesGet");
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

<a name="parkingsGet"></a>
# **parkingsGet**
> parkingsGet(fromDate, toDate, fareTypeId)

Returns parkings

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
Object fromDate = null; // Object | parking refervation from
Object toDate = null; // Object | parking refervation to
String fareTypeId = "fareTypeId_example"; // String | fare type id
try {
    apiInstance.parkingsGet(fromDate, toDate, fareTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | [**Object**](.md)| parking refervation from |
 **toDate** | [**Object**](.md)| parking refervation to |
 **fareTypeId** | **String**| fare type id | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="parkingsReserveConfirmPost"></a>
# **parkingsReserveConfirmPost**
> parkingsReserveConfirmPost(reserveConfirm)

Confirm reservation

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
ReserveConfirm2 reserveConfirm = new ReserveConfirm2(); // ReserveConfirm2 | parking reserve confirmation
try {
    apiInstance.parkingsReserveConfirmPost(reserveConfirm);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsReserveConfirmPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveConfirm** | [**ReserveConfirm2**](ReserveConfirm2.md)| parking reserve confirmation |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="parkingsReserveDelete"></a>
# **parkingsReserveDelete**
> parkingsReserveDelete(reserveDelete)

Delete parking reservation

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
ReserveDelete1 reserveDelete = new ReserveDelete1(); // ReserveDelete1 | parking reserve delete
try {
    apiInstance.parkingsReserveDelete(reserveDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsReserveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveDelete** | [**ReserveDelete1**](ReserveDelete1.md)| parking reserve delete |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="parkingsReservePost"></a>
# **parkingsReservePost**
> parkingsReservePost(reserveRequest)

Register parking reservation (not confirmed) and get Stripe payment intent

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
ReserveRequest2 reserveRequest = new ReserveRequest2(); // ReserveRequest2 | parking reserve data
try {
    apiInstance.parkingsReservePost(reserveRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsReservePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveRequest** | [**ReserveRequest2**](ReserveRequest2.md)| parking reserve data |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="parkingsReservePut"></a>
# **parkingsReservePut**
> parkingsReservePut(reserveRequest)

Update parking reservation with payment info

### Example
```java
// Import classes:
//import com.openmove.api.ParkingsApi;

ParkingsApi apiInstance = new ParkingsApi();
ReserveRequest1 reserveRequest = new ReserveRequest1(); // ReserveRequest1 | parking reserve data
try {
    apiInstance.parkingsReservePut(reserveRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ParkingsApi#parkingsReservePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reserveRequest** | [**ReserveRequest1**](ReserveRequest1.md)| parking reserve data |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

