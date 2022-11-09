
# UserTicket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier |  [optional]
**userId** | **String** | user identifier |  [optional]
**paidAt** | [**Date**](Date.md) | paid date (if performed) |  [optional]
**startAt** | [**Date**](Date.md) | first check date (if performed) |  [optional]
**endAt** | [**Date**](Date.md) | end date for ticket availability |  [optional]
**updatedAt** | [**Date**](Date.md) | last event update date |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) | channel provider |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | currency ISO code |  [optional]
**sequence** | **String** | ticket sequence code |  [optional]
**price** | **Integer** | fare price, in cents |  [optional]
**totalPrice** | **Integer** | total price: price * quantity |  [optional]
**quantity** | **Integer** | number of passengers |  [optional]
**payment** | [**UserTicketPayment**](UserTicketPayment.md) |  |  [optional]
**fare** | [**UserTicketFare**](UserTicketFare.md) |  |  [optional]
**createdAt** | [**Date**](Date.md) | ticket creation date |  [optional]
**status** | [**UserTicketStatus**](UserTicketStatus.md) |  |  [optional]
**lastCheck** | [**Date**](Date.md) | last check date (if performed) |  [optional]
**checks** | [**List&lt;UserTicketChecks&gt;**](UserTicketChecks.md) | checks list |  [optional]


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----



