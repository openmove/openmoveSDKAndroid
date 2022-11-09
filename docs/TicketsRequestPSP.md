
# TicketsRequestPSP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**TicketsRequestPSPUser**](TicketsRequestPSPUser.md) |  | 
**fares** | [**List&lt;TicketsRequestPSPFares&gt;**](TicketsRequestPSPFares.md) |  | 
**transactionId** | **String** | transaction id has to be unique for a merchant | 
**force3DSecure** | **Boolean** | if true the user have to authorize the payment, even if a previous payment was authorized. If false the user can skip the authorization redirect if a previous payment was authorized |  [optional]
**description** | **String** |  | 
**outcomeURL** | **String** |  |  [optional]



