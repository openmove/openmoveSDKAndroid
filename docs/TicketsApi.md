# TicketsApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parkingConvertPost**](TicketsApi.md#parkingConvertPost) | **POST** /parking/convert | Convert a valid parking reservation with specific parking code
[**ticketsActivatePut**](TicketsApi.md#ticketsActivatePut) | **PUT** /tickets/activate | Activate the given ticket
[**ticketsGet**](TicketsApi.md#ticketsGet) | **GET** /tickets | Return the list of tickets filtered by userId or ticketId
[**ticketsSelectMultiPost**](TicketsApi.md#ticketsSelectMultiPost) | **POST** /tickets/select/multi | Purchase the given fares via PSP
[**ticketsSelectPaymentResponsePost**](TicketsApi.md#ticketsSelectPaymentResponsePost) | **POST** /tickets/select/payment/response | Get payment response via PSP
[**ticketsSelectPost**](TicketsApi.md#ticketsSelectPost) | **POST** /tickets/select | Purchase the given ticket via PSP
[**ticketsUserIdGet**](TicketsApi.md#ticketsUserIdGet) | **GET** /tickets/{userId} | Return the list of tickets filtered by userId DEPRECATED use GET &#39;tickets&#39;


<a name="parkingConvertPost"></a>
# **parkingConvertPost**
> parkingConvertPost(body)

Convert a valid parking reservation with specific parking code

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
Body body = new Body(); // Body | body
try {
    apiInstance.parkingConvertPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#parkingConvertPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| body |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketsActivatePut"></a>
# **ticketsActivatePut**
> ticketsActivatePut(body)

Activate the given ticket

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
ValidateTicketRequest body = new ValidateTicketRequest(); // ValidateTicketRequest | validate ticket request
try {
    apiInstance.ticketsActivatePut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsActivatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidateTicketRequest**](ValidateTicketRequest.md)| validate ticket request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsGet"></a>
# **ticketsGet**
> List&lt;UserTicket&gt; ticketsGet(userId, ticketId)

Return the list of tickets filtered by userId or ticketId

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
String userId = "userId_example"; // String | user id
String ticketId = "ticketId_example"; // String | ticket id
try {
    List<UserTicket> result = apiInstance.ticketsGet(userId, ticketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id | [optional]
 **ticketId** | **String**| ticket id | [optional]

### Return type

[**List&lt;UserTicket&gt;**](UserTicket.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsSelectMultiPost"></a>
# **ticketsSelectMultiPost**
> InlineResponse200 ticketsSelectMultiPost(body)

Purchase the given fares via PSP

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
TicketsRequestPSP body = new TicketsRequestPSP(); // TicketsRequestPSP | tickets request with PSP
try {
    InlineResponse200 result = apiInstance.ticketsSelectMultiPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsSelectMultiPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TicketsRequestPSP**](TicketsRequestPSP.md)| tickets request with PSP |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsSelectPaymentResponsePost"></a>
# **ticketsSelectPaymentResponsePost**
> ticketsSelectPaymentResponsePost(body)

Get payment response via PSP

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
Object body = null; // Object | PSP response obj
try {
    apiInstance.ticketsSelectPaymentResponsePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsSelectPaymentResponsePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**| PSP response obj |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="ticketsSelectPost"></a>
# **ticketsSelectPost**
> ticketsSelectPost(body)

Purchase the given ticket via PSP

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
TicketRequestPSP body = new TicketRequestPSP(); // TicketRequestPSP | ticket request with PSP
try {
    apiInstance.ticketsSelectPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsSelectPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TicketRequestPSP**](TicketRequestPSP.md)| ticket request with PSP |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="ticketsUserIdGet"></a>
# **ticketsUserIdGet**
> ticketsUserIdGet(userId)

Return the list of tickets filtered by userId DEPRECATED use GET &#39;tickets&#39;

### Example
```java
// Import classes:
//import com.openmove.api.TicketsApi;

TicketsApi apiInstance = new TicketsApi();
String userId = "userId_example"; // String | ticket request
try {
    apiInstance.ticketsUserIdGet(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ticket request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

