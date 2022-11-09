# IDMApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**idmRegisterPost**](IDMApi.md#idmRegisterPost) | **POST** /idm/register | Create an agency for having the clientId and secret for the authentication token
[**idmTokenPost**](IDMApi.md#idmTokenPost) | **POST** /idm/token | Generate an authentication token


<a name="idmRegisterPost"></a>
# **idmRegisterPost**
> idmRegisterPost(body)

Create an agency for having the clientId and secret for the authentication token

### Example
```java
// Import classes:
//import com.openmove.api.IDMApi;

IDMApi apiInstance = new IDMApi();
Body7 body = new Body7(); // Body7 | agency registration request
try {
    apiInstance.idmRegisterPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling IDMApi#idmRegisterPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body7**](Body7.md)| agency registration request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="idmTokenPost"></a>
# **idmTokenPost**
> idmTokenPost(generateToken)

Generate an authentication token

### Example
```java
// Import classes:
//import com.openmove.api.IDMApi;

IDMApi apiInstance = new IDMApi();
GenerateToken generateToken = new GenerateToken(); // GenerateToken | token generation request
try {
    apiInstance.idmTokenPost(generateToken);
} catch (ApiException e) {
    System.err.println("Exception when calling IDMApi#idmTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateToken** | [**GenerateToken**](GenerateToken.md)| token generation request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

