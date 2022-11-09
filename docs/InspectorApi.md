# InspectorApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ticketsBurnPost**](InspectorApi.md#ticketsBurnPost) | **POST** /tickets/burn | Returns ticket status
[**ticketsCheckGet**](InspectorApi.md#ticketsCheckGet) | **GET** /tickets/check | Returns ticket status


<a name="ticketsBurnPost"></a>
# **ticketsBurnPost**
> ticketsBurnPost(sequence)

Returns ticket status

### Example
```java
// Import classes:
//import com.openmove.api.InspectorApi;

InspectorApi apiInstance = new InspectorApi();
String sequence = "sequence_example"; // String | status ticket request
try {
    apiInstance.ticketsBurnPost(sequence);
} catch (ApiException e) {
    System.err.println("Exception when calling InspectorApi#ticketsBurnPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| status ticket request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsCheckGet"></a>
# **ticketsCheckGet**
> ticketsCheckGet(sequence)

Returns ticket status

### Example
```java
// Import classes:
//import com.openmove.api.InspectorApi;

InspectorApi apiInstance = new InspectorApi();
String sequence = "sequence_example"; // String | status ticket request
try {
    apiInstance.ticketsCheckGet(sequence);
} catch (ApiException e) {
    System.err.println("Exception when calling InspectorApi#ticketsCheckGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| status ticket request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

