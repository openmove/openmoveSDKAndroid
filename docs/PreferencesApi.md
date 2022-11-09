# PreferencesApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preferencesAddTicketPost**](PreferencesApi.md#preferencesAddTicketPost) | **POST** /preferences/add/ticket | Add ticket to user preferences
[**preferencesAddTripPost**](PreferencesApi.md#preferencesAddTripPost) | **POST** /preferences/add/trip | Add trip to user preferences
[**preferencesAddValidationPost**](PreferencesApi.md#preferencesAddValidationPost) | **POST** /preferences/add/validation | Add validation to user counter
[**preferencesGetRankingPost**](PreferencesApi.md#preferencesGetRankingPost) | **POST** /preferences/get/ranking | Get user rank position data
[**preferencesGetTicketPost**](PreferencesApi.md#preferencesGetTicketPost) | **POST** /preferences/get/ticket | Get user tickets preferences
[**preferencesGetTripPost**](PreferencesApi.md#preferencesGetTripPost) | **POST** /preferences/get/trip | Get user trips preferences


<a name="preferencesAddTicketPost"></a>
# **preferencesAddTicketPost**
> preferencesAddTicketPost(body)

Add ticket to user preferences

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body8 body = new Body8(); // Body8 | add preferences request
try {
    apiInstance.preferencesAddTicketPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesAddTicketPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body8**](Body8.md)| add preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="preferencesAddTripPost"></a>
# **preferencesAddTripPost**
> preferencesAddTripPost(body)

Add trip to user preferences

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body9 body = new Body9(); // Body9 | add preferences request
try {
    apiInstance.preferencesAddTripPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesAddTripPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body9**](Body9.md)| add preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="preferencesAddValidationPost"></a>
# **preferencesAddValidationPost**
> preferencesAddValidationPost(body)

Add validation to user counter

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body13 body = new Body13(); // Body13 | user preferences request
try {
    apiInstance.preferencesAddValidationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesAddValidationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body13**](Body13.md)| user preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="preferencesGetRankingPost"></a>
# **preferencesGetRankingPost**
> preferencesGetRankingPost(body)

Get user rank position data

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body12 body = new Body12(); // Body12 | user preferences request
try {
    apiInstance.preferencesGetRankingPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesGetRankingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body12**](Body12.md)| user preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="preferencesGetTicketPost"></a>
# **preferencesGetTicketPost**
> preferencesGetTicketPost(body)

Get user tickets preferences

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body10 body = new Body10(); // Body10 | preferences request
try {
    apiInstance.preferencesGetTicketPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesGetTicketPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body10**](Body10.md)| preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="preferencesGetTripPost"></a>
# **preferencesGetTripPost**
> preferencesGetTripPost(body)

Get user trips preferences

### Example
```java
// Import classes:
//import com.openmove.api.PreferencesApi;

PreferencesApi apiInstance = new PreferencesApi();
Body11 body = new Body11(); // Body11 | preferences request
try {
    apiInstance.preferencesGetTripPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#preferencesGetTripPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body11**](Body11.md)| preferences request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

