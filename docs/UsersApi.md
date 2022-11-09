# UsersApi

All URIs are relative to *https://api.openmove.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCardRegistrationApiResponsePost**](UsersApi.md#userCardRegistrationApiResponsePost) | **POST** /user/card/registration/api/response | Get card registration response via PSP
[**userCardRegistrationDelete**](UsersApi.md#userCardRegistrationDelete) | **DELETE** /user/card/registration | Delete card registration via PSP
[**userCardRegistrationPost**](UsersApi.md#userCardRegistrationPost) | **POST** /user/card/registration | Get card registration via PSP
[**userCardRegistrationResponsePost**](UsersApi.md#userCardRegistrationResponsePost) | **POST** /user/card/registration/response | Get card registration response via PSP
[**userCheckPost**](UsersApi.md#userCheckPost) | **POST** /user/check | Check user
[**userGet**](UsersApi.md#userGet) | **GET** /user | Get users
[**userPost**](UsersApi.md#userPost) | **POST** /user | Register new user
[**userUserIdDelete**](UsersApi.md#userUserIdDelete) | **DELETE** /user/{userId} | Delete user
[**userUserIdPut**](UsersApi.md#userUserIdPut) | **PUT** /user/{userId} | Update user


<a name="userCardRegistrationApiResponsePost"></a>
# **userCardRegistrationApiResponsePost**
> userCardRegistrationApiResponsePost(body)

Get card registration response via PSP

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Object body = null; // Object | PSP response obj
try {
    apiInstance.userCardRegistrationApiResponsePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userCardRegistrationApiResponsePost");
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

<a name="userCardRegistrationDelete"></a>
# **userCardRegistrationDelete**
> userCardRegistrationDelete(body)

Delete card registration via PSP

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Body15 body = new Body15(); // Body15 | card registration delete request
try {
    apiInstance.userCardRegistrationDelete(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userCardRegistrationDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body15**](Body15.md)| card registration delete request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="userCardRegistrationPost"></a>
# **userCardRegistrationPost**
> userCardRegistrationPost(body)

Get card registration via PSP

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Body14 body = new Body14(); // Body14 | card registration request
try {
    apiInstance.userCardRegistrationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userCardRegistrationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body14**](Body14.md)| card registration request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="userCardRegistrationResponsePost"></a>
# **userCardRegistrationResponsePost**
> userCardRegistrationResponsePost(body)

Get card registration response via PSP

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
Object body = null; // Object | PSP response obj
try {
    apiInstance.userCardRegistrationResponsePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userCardRegistrationResponsePost");
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

<a name="userCheckPost"></a>
# **userCheckPost**
> userCheckPost(body)

Check user

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UserCheckRequest body = new UserCheckRequest(); // UserCheckRequest | user check
try {
    apiInstance.userCheckPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userCheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCheckRequest**](UserCheckRequest.md)| user check |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userGet"></a>
# **userGet**
> userGet(userId)

Get users

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user id
try {
    apiInstance.userGet(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userPost"></a>
# **userPost**
> userPost(body)

Register new user

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UserRequest body = new UserRequest(); // UserRequest | user registration
try {
    apiInstance.userPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRequest**](UserRequest.md)| user registration |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userUserIdDelete"></a>
# **userUserIdDelete**
> userUserIdDelete(userId)

Delete user

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user id
try {
    apiInstance.userUserIdDelete(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userUserIdPut"></a>
# **userUserIdPut**
> userUserIdPut(userId, body)

Update user

### Example
```java
// Import classes:
//import com.openmove.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user id
UserProfileRequest body = new UserProfileRequest(); // UserProfileRequest | user registration
try {
    apiInstance.userUserIdPut(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id |
 **body** | [**UserProfileRequest**](UserProfileRequest.md)| user registration |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

