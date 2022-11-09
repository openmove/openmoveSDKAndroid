# AroundSardiniaClient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.openmove.sardegna</groupId>
    <artifactId>AroundSardiniaClient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.openmove.sardegna:AroundSardiniaClient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/AroundSardiniaClient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.openmove.api.AnalyticsApi;

public class AnalyticsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openmove.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsApi* | [**parkingAvailabilityGet**](docs/AnalyticsApi.md#parkingAvailabilityGet) | **GET** /parking/availability | Report about parking availabilities
*AnalyticsApi* | [**parkingCancellationGet**](docs/AnalyticsApi.md#parkingCancellationGet) | **GET** /parking/cancellation | Report about parking cancellations
*AnalyticsApi* | [**parkingReservationsGet**](docs/AnalyticsApi.md#parkingReservationsGet) | **GET** /parking/reservations | Report about parking reservations
*AnalyticsApi* | [**ticketsCountPost**](docs/AnalyticsApi.md#ticketsCountPost) | **POST** /tickets/count | Totals about purchased tickets in given dates slot
*AnalyticsApi* | [**ticketsStatusPost**](docs/AnalyticsApi.md#ticketsStatusPost) | **POST** /tickets/status | Report about purchased tickets in given dates slot
*BookingsApi* | [**agenciesGet**](docs/BookingsApi.md#agenciesGet) | **GET** /agencies | Returns agencies enabled info
*BookingsApi* | [**routesAgencyIdGet**](docs/BookingsApi.md#routesAgencyIdGet) | **GET** /routes/{agencyId} | Returns routes info
*BookingsApi* | [**routesWithFaresAgencyIdGet**](docs/BookingsApi.md#routesWithFaresAgencyIdGet) | **GET** /routes-with-fares/{agencyId} | Returns routes info
*BookingsApi* | [**stopsAgencyIdRouteIdGet**](docs/BookingsApi.md#stopsAgencyIdRouteIdGet) | **GET** /stops/{agencyId}/{routeId} | Returns stops info
*BookingsApi* | [**tripsGet**](docs/BookingsApi.md#tripsGet) | **GET** /trips | Returns trips list
*BookingsApi* | [**tripsReserveConfirmPost**](docs/BookingsApi.md#tripsReserveConfirmPost) | **POST** /trips/reserve/confirm | Confirm reservation
*BookingsApi* | [**tripsReserveDelete**](docs/BookingsApi.md#tripsReserveDelete) | **DELETE** /trips/reserve | Delete reservation
*BookingsApi* | [**tripsReservePost**](docs/BookingsApi.md#tripsReservePost) | **POST** /trips/reserve | Register reservation (not confirmed), waiting for the confirmation
*BookingsApi* | [**tripsReservePut**](docs/BookingsApi.md#tripsReservePut) | **PUT** /trips/reserve | Update reservation with user info
*FaresApi* | [**ticketsAgenciesGet**](docs/FaresApi.md#ticketsAgenciesGet) | **GET** /tickets/agencies | Returns agencies list
*FaresApi* | [**ticketsFaresAgencyIdTagGet**](docs/FaresApi.md#ticketsFaresAgencyIdTagGet) | **GET** /tickets/fares/{agencyId}/{tag} | Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;
*FaresApi* | [**ticketsFaresAttributesFareIdGet**](docs/FaresApi.md#ticketsFaresAttributesFareIdGet) | **GET** /tickets/fares/attributes/{fareId} | Returns attributes of a given fare
*FaresApi* | [**ticketsFaresDelete**](docs/FaresApi.md#ticketsFaresDelete) | **DELETE** /tickets/fares | Delete a given fare
*FaresApi* | [**ticketsFaresGet**](docs/FaresApi.md#ticketsFaresGet) | **GET** /tickets/fares | Returns fare tickets list
*FaresApi* | [**ticketsFaresLineZonePost**](docs/FaresApi.md#ticketsFaresLineZonePost) | **POST** /tickets/fares/line-zone | Add new line/zone fare
*FaresApi* | [**ticketsFaresOriginDestinationPost**](docs/FaresApi.md#ticketsFaresOriginDestinationPost) | **POST** /tickets/fares/origin-destination | Add new origin/destination fare
*FaresApi* | [**ticketsFaresSearchPost**](docs/FaresApi.md#ticketsFaresSearchPost) | **POST** /tickets/fares/search | Returns fare tickets list
*FaresApi* | [**ticketsFaresUniqueAgencyIdTagGet**](docs/FaresApi.md#ticketsFaresUniqueAgencyIdTagGet) | **GET** /tickets/fares/unique/{agencyId}/{tag} | Returns fare tickets list DEPRECATED use GET &#39;tickets/fares&#39;
*FaresApi* | [**ticketsNotesAgencyIdGet**](docs/FaresApi.md#ticketsNotesAgencyIdGet) | **GET** /tickets/notes/{agencyId} | Returns notes list
*FaresApi* | [**ticketsRoutesAgencyIdGet**](docs/FaresApi.md#ticketsRoutesAgencyIdGet) | **GET** /tickets/routes/{agencyId} | Returns routes list
*FaresApi* | [**ticketsRoutesSearchPost**](docs/FaresApi.md#ticketsRoutesSearchPost) | **POST** /tickets/routes/search | Returns routes list
*FaresApi* | [**ticketsRoutesTypesNearbyPost**](docs/FaresApi.md#ticketsRoutesTypesNearbyPost) | **POST** /tickets/routes/types/nearby | Returns route types list nearby a given position
*FaresApi* | [**ticketsStopStopIdGet**](docs/FaresApi.md#ticketsStopStopIdGet) | **GET** /tickets/stop/{stopId} | Returns tickets stop info
*FaresApi* | [**ticketsStopsAgencyIdGet**](docs/FaresApi.md#ticketsStopsAgencyIdGet) | **GET** /tickets/stops/{agencyId} | Returns tickets stops list
*FaresApi* | [**ticketsStopsAgencyIdRouteTypeGet**](docs/FaresApi.md#ticketsStopsAgencyIdRouteTypeGet) | **GET** /tickets/stops/{agencyId}/{routeType} | Returns stops list
*FaresApi* | [**ticketsStopsNearbyPost**](docs/FaresApi.md#ticketsStopsNearbyPost) | **POST** /tickets/stops/nearby | Returns stops list nearby a given position
*FaresApi* | [**ticketsZonesAgencyIdGet**](docs/FaresApi.md#ticketsZonesAgencyIdGet) | **GET** /tickets/zones/{agencyId} | Returns zones list
*FaresApi* | [**ticketsZonesFindByStopsPost**](docs/FaresApi.md#ticketsZonesFindByStopsPost) | **POST** /tickets/zones/findByStops | Returns zones list
*FaresApi* | [**ticketsZonesNearbyPost**](docs/FaresApi.md#ticketsZonesNearbyPost) | **POST** /tickets/zones/nearby | Returns zones list nearby a given position
*IDMApi* | [**idmRegisterPost**](docs/IDMApi.md#idmRegisterPost) | **POST** /idm/register | Create an agency for having the clientId and secret for the authentication token
*IDMApi* | [**idmTokenPost**](docs/IDMApi.md#idmTokenPost) | **POST** /idm/token | Generate an authentication token
*InspectorApi* | [**ticketsBurnPost**](docs/InspectorApi.md#ticketsBurnPost) | **POST** /tickets/burn | Returns ticket status
*InspectorApi* | [**ticketsCheckGet**](docs/InspectorApi.md#ticketsCheckGet) | **GET** /tickets/check | Returns ticket status
*ParkingsApi* | [**parkingsFaresTypesGet**](docs/ParkingsApi.md#parkingsFaresTypesGet) | **GET** /parkings/fares/types | Returns parkings fares
*ParkingsApi* | [**parkingsGet**](docs/ParkingsApi.md#parkingsGet) | **GET** /parkings | Returns parkings
*ParkingsApi* | [**parkingsReserveConfirmPost**](docs/ParkingsApi.md#parkingsReserveConfirmPost) | **POST** /parkings/reserve/confirm | Confirm reservation
*ParkingsApi* | [**parkingsReserveDelete**](docs/ParkingsApi.md#parkingsReserveDelete) | **DELETE** /parkings/reserve | Delete parking reservation
*ParkingsApi* | [**parkingsReservePost**](docs/ParkingsApi.md#parkingsReservePost) | **POST** /parkings/reserve | Register parking reservation (not confirmed) and get Stripe payment intent
*ParkingsApi* | [**parkingsReservePut**](docs/ParkingsApi.md#parkingsReservePut) | **PUT** /parkings/reserve | Update parking reservation with payment info
*PreferencesApi* | [**preferencesAddTicketPost**](docs/PreferencesApi.md#preferencesAddTicketPost) | **POST** /preferences/add/ticket | Add ticket to user preferences
*PreferencesApi* | [**preferencesAddTripPost**](docs/PreferencesApi.md#preferencesAddTripPost) | **POST** /preferences/add/trip | Add trip to user preferences
*PreferencesApi* | [**preferencesAddValidationPost**](docs/PreferencesApi.md#preferencesAddValidationPost) | **POST** /preferences/add/validation | Add validation to user counter
*PreferencesApi* | [**preferencesGetRankingPost**](docs/PreferencesApi.md#preferencesGetRankingPost) | **POST** /preferences/get/ranking | Get user rank position data
*PreferencesApi* | [**preferencesGetTicketPost**](docs/PreferencesApi.md#preferencesGetTicketPost) | **POST** /preferences/get/ticket | Get user tickets preferences
*PreferencesApi* | [**preferencesGetTripPost**](docs/PreferencesApi.md#preferencesGetTripPost) | **POST** /preferences/get/trip | Get user trips preferences
*ShelterApi* | [**shelterAgenciesGet**](docs/ShelterApi.md#shelterAgenciesGet) | **GET** /shelter/agencies | Returns agencies list
*ShelterApi* | [**shelterCalendarDatesTagGet**](docs/ShelterApi.md#shelterCalendarDatesTagGet) | **GET** /shelter/calendarDates/{tag} | Returns calendar dates list of given agency tag
*ShelterApi* | [**shelterCalendarTagGet**](docs/ShelterApi.md#shelterCalendarTagGet) | **GET** /shelter/calendar/{tag} | Returns calendar list of given agency tag
*ShelterApi* | [**shelterRoutesTagGet**](docs/ShelterApi.md#shelterRoutesTagGet) | **GET** /shelter/routes/{tag} | Returns routes list of given agency tag
*ShelterApi* | [**shelterShapesTagShapeIdGet**](docs/ShelterApi.md#shelterShapesTagShapeIdGet) | **GET** /shelter/shapes/{tag}/{shapeId} | Returns shapes list of given agency tag
*ShelterApi* | [**shelterStopTimesTagTripIdGet**](docs/ShelterApi.md#shelterStopTimesTagTripIdGet) | **GET** /shelter/stopTimes/{tag}/{tripId} | Returns stopTimes list of given agency tag and trip id
*ShelterApi* | [**shelterStopTimesTagTripIdStopIdGet**](docs/ShelterApi.md#shelterStopTimesTagTripIdStopIdGet) | **GET** /shelter/stopTimes/{tag}/{tripId}/{stopId} | Returns stopTimes list of given agency tag, trip id and stop id
*ShelterApi* | [**shelterStopsTagGet**](docs/ShelterApi.md#shelterStopsTagGet) | **GET** /shelter/stops/{tag} | Returns stops list of given agency tag
*ShelterApi* | [**shelterTripsTagRouteIdGet**](docs/ShelterApi.md#shelterTripsTagRouteIdGet) | **GET** /shelter/trips/{tag}/{routeId} | Returns trips list of given agency tag and route id
*TicketsApi* | [**parkingConvertPost**](docs/TicketsApi.md#parkingConvertPost) | **POST** /parking/convert | Convert a valid parking reservation with specific parking code
*TicketsApi* | [**ticketsActivatePut**](docs/TicketsApi.md#ticketsActivatePut) | **PUT** /tickets/activate | Activate the given ticket
*TicketsApi* | [**ticketsGet**](docs/TicketsApi.md#ticketsGet) | **GET** /tickets | Return the list of tickets filtered by userId or ticketId
*TicketsApi* | [**ticketsSelectMultiPost**](docs/TicketsApi.md#ticketsSelectMultiPost) | **POST** /tickets/select/multi | Purchase the given fares via PSP
*TicketsApi* | [**ticketsSelectPaymentResponsePost**](docs/TicketsApi.md#ticketsSelectPaymentResponsePost) | **POST** /tickets/select/payment/response | Get payment response via PSP
*TicketsApi* | [**ticketsSelectPost**](docs/TicketsApi.md#ticketsSelectPost) | **POST** /tickets/select | Purchase the given ticket via PSP
*TicketsApi* | [**ticketsUserIdGet**](docs/TicketsApi.md#ticketsUserIdGet) | **GET** /tickets/{userId} | Return the list of tickets filtered by userId DEPRECATED use GET &#39;tickets&#39;
*TripPlannerApi* | [**tripPlannerGetPost**](docs/TripPlannerApi.md#tripPlannerGetPost) | **POST** /trip-planner/get | Returns trips list
*TripPlannerApi* | [**tripPlannerTicketsGetPost**](docs/TripPlannerApi.md#tripPlannerTicketsGetPost) | **POST** /trip-planner/tickets/get | Returns tickets list for a trip
*UsersApi* | [**userCardRegistrationApiResponsePost**](docs/UsersApi.md#userCardRegistrationApiResponsePost) | **POST** /user/card/registration/api/response | Get card registration response via PSP
*UsersApi* | [**userCardRegistrationDelete**](docs/UsersApi.md#userCardRegistrationDelete) | **DELETE** /user/card/registration | Delete card registration via PSP
*UsersApi* | [**userCardRegistrationPost**](docs/UsersApi.md#userCardRegistrationPost) | **POST** /user/card/registration | Get card registration via PSP
*UsersApi* | [**userCardRegistrationResponsePost**](docs/UsersApi.md#userCardRegistrationResponsePost) | **POST** /user/card/registration/response | Get card registration response via PSP
*UsersApi* | [**userCheckPost**](docs/UsersApi.md#userCheckPost) | **POST** /user/check | Check user
*UsersApi* | [**userGet**](docs/UsersApi.md#userGet) | **GET** /user | Get users
*UsersApi* | [**userPost**](docs/UsersApi.md#userPost) | **POST** /user | Register new user
*UsersApi* | [**userUserIdDelete**](docs/UsersApi.md#userUserIdDelete) | **DELETE** /user/{userId} | Delete user
*UsersApi* | [**userUserIdPut**](docs/UsersApi.md#userUserIdPut) | **PUT** /user/{userId} | Update user


## Documentation for Models

 - [ActivateTicketRequest](docs/ActivateTicketRequest.md)
 - [AttributesRequest](docs/AttributesRequest.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body12](docs/Body12.md)
 - [Body13](docs/Body13.md)
 - [Body14](docs/Body14.md)
 - [Body15](docs/Body15.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [BurnTicketRequest](docs/BurnTicketRequest.md)
 - [BurnTicketRequestBurnObj](docs/BurnTicketRequestBurnObj.md)
 - [BurnTicketRequestBurnObjCheck](docs/BurnTicketRequestBurnObjCheck.md)
 - [CreateLineZoneTicketRequest](docs/CreateLineZoneTicketRequest.md)
 - [CreateLineZoneTicketRequestLocations](docs/CreateLineZoneTicketRequestLocations.md)
 - [CreateLineZoneTicketRequestTicket](docs/CreateLineZoneTicketRequestTicket.md)
 - [CreateLineZoneTicketRequestTicketDuration](docs/CreateLineZoneTicketRequestTicketDuration.md)
 - [CreateLineZoneTicketRequestTicketExpire](docs/CreateLineZoneTicketRequestTicketExpire.md)
 - [CreateOriginDestinationTicketRequest](docs/CreateOriginDestinationTicketRequest.md)
 - [CreateOriginDestinationTicketRequestLocations](docs/CreateOriginDestinationTicketRequestLocations.md)
 - [CreateOriginDestinationTicketRequestTicket](docs/CreateOriginDestinationTicketRequestTicket.md)
 - [FareRequest](docs/FareRequest.md)
 - [GenerateToken](docs/GenerateToken.md)
 - [IdmregisterCompany](docs/IdmregisterCompany.md)
 - [IdmregisterSupport](docs/IdmregisterSupport.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [LatLng](docs/LatLng.md)
 - [LatLngStop](docs/LatLngStop.md)
 - [ParkingsreserveTickets](docs/ParkingsreserveTickets.md)
 - [ParkingsreserveTickets1](docs/ParkingsreserveTickets1.md)
 - [ParkingsreserveUser](docs/ParkingsreserveUser.md)
 - [PassRequest](docs/PassRequest.md)
 - [Password](docs/Password.md)
 - [Plate](docs/Plate.md)
 - [ReserveConfirm](docs/ReserveConfirm.md)
 - [ReserveConfirm1](docs/ReserveConfirm1.md)
 - [ReserveConfirm2](docs/ReserveConfirm2.md)
 - [ReserveDelete](docs/ReserveDelete.md)
 - [ReserveDelete1](docs/ReserveDelete1.md)
 - [ReserveRequest](docs/ReserveRequest.md)
 - [ReserveRequest1](docs/ReserveRequest1.md)
 - [ReserveRequest2](docs/ReserveRequest2.md)
 - [RouteRequest](docs/RouteRequest.md)
 - [StatusTicketRequest](docs/StatusTicketRequest.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionItem](docs/SubscriptionItem.md)
 - [SubscriptionItemNotification](docs/SubscriptionItemNotification.md)
 - [SubscriptionItemNotificationHttp](docs/SubscriptionItemNotificationHttp.md)
 - [SubscriptionItemSubject](docs/SubscriptionItemSubject.md)
 - [Ticket](docs/Ticket.md)
 - [TicketFare](docs/TicketFare.md)
 - [TicketFareAttributes](docs/TicketFareAttributes.md)
 - [TicketFareAttributesMeta](docs/TicketFareAttributesMeta.md)
 - [TicketRequest](docs/TicketRequest.md)
 - [TicketRequestPSP](docs/TicketRequestPSP.md)
 - [TicketsRequestPSP](docs/TicketsRequestPSP.md)
 - [TicketsRequestPSPFares](docs/TicketsRequestPSPFares.md)
 - [TicketsRequestPSPUser](docs/TicketsRequestPSPUser.md)
 - [TicketsstatusSelector](docs/TicketsstatusSelector.md)
 - [TicketsstatusSelectorDate](docs/TicketsstatusSelectorDate.md)
 - [TripRequest](docs/TripRequest.md)
 - [TripRequestOptions](docs/TripRequestOptions.md)
 - [TripRequestOptionsExtra](docs/TripRequestOptionsExtra.md)
 - [TripTicketsRequest](docs/TripTicketsRequest.md)
 - [TripsreserveFrom](docs/TripsreserveFrom.md)
 - [TripsreserveTickets](docs/TripsreserveTickets.md)
 - [TripsreserveTickets1](docs/TripsreserveTickets1.md)
 - [TripsreserveTrips](docs/TripsreserveTrips.md)
 - [TripsreserveUser](docs/TripsreserveUser.md)
 - [TripsreserveconfirmTickets](docs/TripsreserveconfirmTickets.md)
 - [UserCheckRequest](docs/UserCheckRequest.md)
 - [UserCheckRequestUser](docs/UserCheckRequestUser.md)
 - [UserProfileRequest](docs/UserProfileRequest.md)
 - [UserProfileRequestUser](docs/UserProfileRequestUser.md)
 - [UserRequest](docs/UserRequest.md)
 - [UserRequestUser](docs/UserRequestUser.md)
 - [UserTicket](docs/UserTicket.md)
 - [UserTicketChecks](docs/UserTicketChecks.md)
 - [UserTicketFare](docs/UserTicketFare.md)
 - [UserTicketFareAttributes](docs/UserTicketFareAttributes.md)
 - [UserTicketFareAttributesMeta](docs/UserTicketFareAttributesMeta.md)
 - [UserTicketFareAttributesMetaTemplate](docs/UserTicketFareAttributesMetaTemplate.md)
 - [UserTicketFareAttributesMetaTemplateIt](docs/UserTicketFareAttributesMetaTemplateIt.md)
 - [UserTicketPayment](docs/UserTicketPayment.md)
 - [UserTicketStatus](docs/UserTicketStatus.md)
 - [ValidatePassRequest](docs/ValidatePassRequest.md)
 - [ValidateTicketRequest](docs/ValidateTicketRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@openmove.com

