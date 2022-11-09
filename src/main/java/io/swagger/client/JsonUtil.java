/**
 * NUCLEUS API
 * OpenMove public APIs documentation. NUCLEUS API exposes a set of APIs tuned to support efficient and easy integration with any customer and to provide the best experience for users. We would welcome the opportunity to refine the specifications better to match your use case. These APIs have a thin nature in order to answer focused questions with very short response times. Some of these APIs also assume a user context, which will allow rolling various ID’s (such as stopId) between requests.
 *
 * OpenAPI spec version: 4.6.0
 * Contact: support@openmove.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import com.openmove.aroundsardinia.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActivateTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ActivateTicketRequest>>(){}.getType();
    }
    
    if ("AttributesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AttributesRequest>>(){}.getType();
    }
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body>>(){}.getType();
    }
    
    if ("Body1".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body1>>(){}.getType();
    }
    
    if ("Body10".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body10>>(){}.getType();
    }
    
    if ("Body11".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body11>>(){}.getType();
    }
    
    if ("Body12".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body12>>(){}.getType();
    }
    
    if ("Body13".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body13>>(){}.getType();
    }
    
    if ("Body14".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body14>>(){}.getType();
    }
    
    if ("Body15".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body15>>(){}.getType();
    }
    
    if ("Body2".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body2>>(){}.getType();
    }
    
    if ("Body3".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body3>>(){}.getType();
    }
    
    if ("Body4".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body4>>(){}.getType();
    }
    
    if ("Body5".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body5>>(){}.getType();
    }
    
    if ("Body6".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body6>>(){}.getType();
    }
    
    if ("Body7".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body7>>(){}.getType();
    }
    
    if ("Body8".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body8>>(){}.getType();
    }
    
    if ("Body9".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body9>>(){}.getType();
    }
    
    if ("BurnTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<BurnTicketRequest>>(){}.getType();
    }
    
    if ("BurnTicketRequestBurnObj".equalsIgnoreCase(className)) {
      return new TypeToken<List<BurnTicketRequestBurnObj>>(){}.getType();
    }
    
    if ("BurnTicketRequestBurnObjCheck".equalsIgnoreCase(className)) {
      return new TypeToken<List<BurnTicketRequestBurnObjCheck>>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateLineZoneTicketRequest>>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestLocations".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateLineZoneTicketRequestLocations>>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicket".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateLineZoneTicketRequestTicket>>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicketDuration".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateLineZoneTicketRequestTicketDuration>>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicketExpire".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateLineZoneTicketRequestTicketExpire>>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateOriginDestinationTicketRequest>>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequestLocations".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateOriginDestinationTicketRequestLocations>>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequestTicket".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateOriginDestinationTicketRequestTicket>>(){}.getType();
    }
    
    if ("FareRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<FareRequest>>(){}.getType();
    }
    
    if ("GenerateToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<GenerateToken>>(){}.getType();
    }
    
    if ("IdmregisterCompany".equalsIgnoreCase(className)) {
      return new TypeToken<List<IdmregisterCompany>>(){}.getType();
    }
    
    if ("IdmregisterSupport".equalsIgnoreCase(className)) {
      return new TypeToken<List<IdmregisterSupport>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("LatLng".equalsIgnoreCase(className)) {
      return new TypeToken<List<LatLng>>(){}.getType();
    }
    
    if ("LatLngStop".equalsIgnoreCase(className)) {
      return new TypeToken<List<LatLngStop>>(){}.getType();
    }
    
    if ("ParkingsreserveTickets".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParkingsreserveTickets>>(){}.getType();
    }
    
    if ("ParkingsreserveTickets1".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParkingsreserveTickets1>>(){}.getType();
    }
    
    if ("ParkingsreserveUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParkingsreserveUser>>(){}.getType();
    }
    
    if ("PassRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PassRequest>>(){}.getType();
    }
    
    if ("Password".equalsIgnoreCase(className)) {
      return new TypeToken<List<Password>>(){}.getType();
    }
    
    if ("Plate".equalsIgnoreCase(className)) {
      return new TypeToken<List<Plate>>(){}.getType();
    }
    
    if ("ReserveConfirm".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveConfirm>>(){}.getType();
    }
    
    if ("ReserveConfirm1".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveConfirm1>>(){}.getType();
    }
    
    if ("ReserveConfirm2".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveConfirm2>>(){}.getType();
    }
    
    if ("ReserveDelete".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveDelete>>(){}.getType();
    }
    
    if ("ReserveDelete1".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveDelete1>>(){}.getType();
    }
    
    if ("ReserveRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveRequest>>(){}.getType();
    }
    
    if ("ReserveRequest1".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveRequest1>>(){}.getType();
    }
    
    if ("ReserveRequest2".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReserveRequest2>>(){}.getType();
    }
    
    if ("RouteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<RouteRequest>>(){}.getType();
    }
    
    if ("StatusTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusTicketRequest>>(){}.getType();
    }
    
    if ("Subscription".equalsIgnoreCase(className)) {
      return new TypeToken<List<Subscription>>(){}.getType();
    }
    
    if ("SubscriptionItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionItem>>(){}.getType();
    }
    
    if ("SubscriptionItemNotification".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionItemNotification>>(){}.getType();
    }
    
    if ("SubscriptionItemNotificationHttp".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionItemNotificationHttp>>(){}.getType();
    }
    
    if ("SubscriptionItemSubject".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionItemSubject>>(){}.getType();
    }
    
    if ("Ticket".equalsIgnoreCase(className)) {
      return new TypeToken<List<Ticket>>(){}.getType();
    }
    
    if ("TicketFare".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketFare>>(){}.getType();
    }
    
    if ("TicketFareAttributes".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketFareAttributes>>(){}.getType();
    }
    
    if ("TicketFareAttributesMeta".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketFareAttributesMeta>>(){}.getType();
    }
    
    if ("TicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketRequest>>(){}.getType();
    }
    
    if ("TicketRequestPSP".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketRequestPSP>>(){}.getType();
    }
    
    if ("TicketsRequestPSP".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketsRequestPSP>>(){}.getType();
    }
    
    if ("TicketsRequestPSPFares".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketsRequestPSPFares>>(){}.getType();
    }
    
    if ("TicketsRequestPSPUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketsRequestPSPUser>>(){}.getType();
    }
    
    if ("TicketsstatusSelector".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketsstatusSelector>>(){}.getType();
    }
    
    if ("TicketsstatusSelectorDate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TicketsstatusSelectorDate>>(){}.getType();
    }
    
    if ("TripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripRequest>>(){}.getType();
    }
    
    if ("TripRequestOptions".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripRequestOptions>>(){}.getType();
    }
    
    if ("TripRequestOptionsExtra".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripRequestOptionsExtra>>(){}.getType();
    }
    
    if ("TripTicketsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripTicketsRequest>>(){}.getType();
    }
    
    if ("TripsreserveFrom".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveFrom>>(){}.getType();
    }
    
    if ("TripsreserveTickets".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveTickets>>(){}.getType();
    }
    
    if ("TripsreserveTickets1".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveTickets1>>(){}.getType();
    }
    
    if ("TripsreserveTrips".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveTrips>>(){}.getType();
    }
    
    if ("TripsreserveUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveUser>>(){}.getType();
    }
    
    if ("TripsreserveconfirmTickets".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripsreserveconfirmTickets>>(){}.getType();
    }
    
    if ("UserCheckRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCheckRequest>>(){}.getType();
    }
    
    if ("UserCheckRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCheckRequestUser>>(){}.getType();
    }
    
    if ("UserProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserProfileRequest>>(){}.getType();
    }
    
    if ("UserProfileRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserProfileRequestUser>>(){}.getType();
    }
    
    if ("UserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserRequest>>(){}.getType();
    }
    
    if ("UserRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserRequestUser>>(){}.getType();
    }
    
    if ("UserTicket".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicket>>(){}.getType();
    }
    
    if ("UserTicketChecks".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketChecks>>(){}.getType();
    }
    
    if ("UserTicketFare".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketFare>>(){}.getType();
    }
    
    if ("UserTicketFareAttributes".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketFareAttributes>>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMeta".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketFareAttributesMeta>>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMetaTemplate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketFareAttributesMetaTemplate>>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMetaTemplateIt".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketFareAttributesMetaTemplateIt>>(){}.getType();
    }
    
    if ("UserTicketPayment".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketPayment>>(){}.getType();
    }
    
    if ("UserTicketStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserTicketStatus>>(){}.getType();
    }
    
    if ("ValidatePassRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidatePassRequest>>(){}.getType();
    }
    
    if ("ValidateTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidateTicketRequest>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActivateTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ActivateTicketRequest>(){}.getType();
    }
    
    if ("AttributesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AttributesRequest>(){}.getType();
    }
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<Body>(){}.getType();
    }
    
    if ("Body1".equalsIgnoreCase(className)) {
      return new TypeToken<Body1>(){}.getType();
    }
    
    if ("Body10".equalsIgnoreCase(className)) {
      return new TypeToken<Body10>(){}.getType();
    }
    
    if ("Body11".equalsIgnoreCase(className)) {
      return new TypeToken<Body11>(){}.getType();
    }
    
    if ("Body12".equalsIgnoreCase(className)) {
      return new TypeToken<Body12>(){}.getType();
    }
    
    if ("Body13".equalsIgnoreCase(className)) {
      return new TypeToken<Body13>(){}.getType();
    }
    
    if ("Body14".equalsIgnoreCase(className)) {
      return new TypeToken<Body14>(){}.getType();
    }
    
    if ("Body15".equalsIgnoreCase(className)) {
      return new TypeToken<Body15>(){}.getType();
    }
    
    if ("Body2".equalsIgnoreCase(className)) {
      return new TypeToken<Body2>(){}.getType();
    }
    
    if ("Body3".equalsIgnoreCase(className)) {
      return new TypeToken<Body3>(){}.getType();
    }
    
    if ("Body4".equalsIgnoreCase(className)) {
      return new TypeToken<Body4>(){}.getType();
    }
    
    if ("Body5".equalsIgnoreCase(className)) {
      return new TypeToken<Body5>(){}.getType();
    }
    
    if ("Body6".equalsIgnoreCase(className)) {
      return new TypeToken<Body6>(){}.getType();
    }
    
    if ("Body7".equalsIgnoreCase(className)) {
      return new TypeToken<Body7>(){}.getType();
    }
    
    if ("Body8".equalsIgnoreCase(className)) {
      return new TypeToken<Body8>(){}.getType();
    }
    
    if ("Body9".equalsIgnoreCase(className)) {
      return new TypeToken<Body9>(){}.getType();
    }
    
    if ("BurnTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<BurnTicketRequest>(){}.getType();
    }
    
    if ("BurnTicketRequestBurnObj".equalsIgnoreCase(className)) {
      return new TypeToken<BurnTicketRequestBurnObj>(){}.getType();
    }
    
    if ("BurnTicketRequestBurnObjCheck".equalsIgnoreCase(className)) {
      return new TypeToken<BurnTicketRequestBurnObjCheck>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateLineZoneTicketRequest>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestLocations".equalsIgnoreCase(className)) {
      return new TypeToken<CreateLineZoneTicketRequestLocations>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicket".equalsIgnoreCase(className)) {
      return new TypeToken<CreateLineZoneTicketRequestTicket>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicketDuration".equalsIgnoreCase(className)) {
      return new TypeToken<CreateLineZoneTicketRequestTicketDuration>(){}.getType();
    }
    
    if ("CreateLineZoneTicketRequestTicketExpire".equalsIgnoreCase(className)) {
      return new TypeToken<CreateLineZoneTicketRequestTicketExpire>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateOriginDestinationTicketRequest>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequestLocations".equalsIgnoreCase(className)) {
      return new TypeToken<CreateOriginDestinationTicketRequestLocations>(){}.getType();
    }
    
    if ("CreateOriginDestinationTicketRequestTicket".equalsIgnoreCase(className)) {
      return new TypeToken<CreateOriginDestinationTicketRequestTicket>(){}.getType();
    }
    
    if ("FareRequest".equalsIgnoreCase(className)) {
      return new TypeToken<FareRequest>(){}.getType();
    }
    
    if ("GenerateToken".equalsIgnoreCase(className)) {
      return new TypeToken<GenerateToken>(){}.getType();
    }
    
    if ("IdmregisterCompany".equalsIgnoreCase(className)) {
      return new TypeToken<IdmregisterCompany>(){}.getType();
    }
    
    if ("IdmregisterSupport".equalsIgnoreCase(className)) {
      return new TypeToken<IdmregisterSupport>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("LatLng".equalsIgnoreCase(className)) {
      return new TypeToken<LatLng>(){}.getType();
    }
    
    if ("LatLngStop".equalsIgnoreCase(className)) {
      return new TypeToken<LatLngStop>(){}.getType();
    }
    
    if ("ParkingsreserveTickets".equalsIgnoreCase(className)) {
      return new TypeToken<ParkingsreserveTickets>(){}.getType();
    }
    
    if ("ParkingsreserveTickets1".equalsIgnoreCase(className)) {
      return new TypeToken<ParkingsreserveTickets1>(){}.getType();
    }
    
    if ("ParkingsreserveUser".equalsIgnoreCase(className)) {
      return new TypeToken<ParkingsreserveUser>(){}.getType();
    }
    
    if ("PassRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PassRequest>(){}.getType();
    }
    
    if ("Password".equalsIgnoreCase(className)) {
      return new TypeToken<Password>(){}.getType();
    }
    
    if ("Plate".equalsIgnoreCase(className)) {
      return new TypeToken<Plate>(){}.getType();
    }
    
    if ("ReserveConfirm".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveConfirm>(){}.getType();
    }
    
    if ("ReserveConfirm1".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveConfirm1>(){}.getType();
    }
    
    if ("ReserveConfirm2".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveConfirm2>(){}.getType();
    }
    
    if ("ReserveDelete".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveDelete>(){}.getType();
    }
    
    if ("ReserveDelete1".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveDelete1>(){}.getType();
    }
    
    if ("ReserveRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveRequest>(){}.getType();
    }
    
    if ("ReserveRequest1".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveRequest1>(){}.getType();
    }
    
    if ("ReserveRequest2".equalsIgnoreCase(className)) {
      return new TypeToken<ReserveRequest2>(){}.getType();
    }
    
    if ("RouteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<RouteRequest>(){}.getType();
    }
    
    if ("StatusTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<StatusTicketRequest>(){}.getType();
    }
    
    if ("Subscription".equalsIgnoreCase(className)) {
      return new TypeToken<Subscription>(){}.getType();
    }
    
    if ("SubscriptionItem".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionItem>(){}.getType();
    }
    
    if ("SubscriptionItemNotification".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionItemNotification>(){}.getType();
    }
    
    if ("SubscriptionItemNotificationHttp".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionItemNotificationHttp>(){}.getType();
    }
    
    if ("SubscriptionItemSubject".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionItemSubject>(){}.getType();
    }
    
    if ("Ticket".equalsIgnoreCase(className)) {
      return new TypeToken<Ticket>(){}.getType();
    }
    
    if ("TicketFare".equalsIgnoreCase(className)) {
      return new TypeToken<TicketFare>(){}.getType();
    }
    
    if ("TicketFareAttributes".equalsIgnoreCase(className)) {
      return new TypeToken<TicketFareAttributes>(){}.getType();
    }
    
    if ("TicketFareAttributesMeta".equalsIgnoreCase(className)) {
      return new TypeToken<TicketFareAttributesMeta>(){}.getType();
    }
    
    if ("TicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TicketRequest>(){}.getType();
    }
    
    if ("TicketRequestPSP".equalsIgnoreCase(className)) {
      return new TypeToken<TicketRequestPSP>(){}.getType();
    }
    
    if ("TicketsRequestPSP".equalsIgnoreCase(className)) {
      return new TypeToken<TicketsRequestPSP>(){}.getType();
    }
    
    if ("TicketsRequestPSPFares".equalsIgnoreCase(className)) {
      return new TypeToken<TicketsRequestPSPFares>(){}.getType();
    }
    
    if ("TicketsRequestPSPUser".equalsIgnoreCase(className)) {
      return new TypeToken<TicketsRequestPSPUser>(){}.getType();
    }
    
    if ("TicketsstatusSelector".equalsIgnoreCase(className)) {
      return new TypeToken<TicketsstatusSelector>(){}.getType();
    }
    
    if ("TicketsstatusSelectorDate".equalsIgnoreCase(className)) {
      return new TypeToken<TicketsstatusSelectorDate>(){}.getType();
    }
    
    if ("TripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TripRequest>(){}.getType();
    }
    
    if ("TripRequestOptions".equalsIgnoreCase(className)) {
      return new TypeToken<TripRequestOptions>(){}.getType();
    }
    
    if ("TripRequestOptionsExtra".equalsIgnoreCase(className)) {
      return new TypeToken<TripRequestOptionsExtra>(){}.getType();
    }
    
    if ("TripTicketsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TripTicketsRequest>(){}.getType();
    }
    
    if ("TripsreserveFrom".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveFrom>(){}.getType();
    }
    
    if ("TripsreserveTickets".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveTickets>(){}.getType();
    }
    
    if ("TripsreserveTickets1".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveTickets1>(){}.getType();
    }
    
    if ("TripsreserveTrips".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveTrips>(){}.getType();
    }
    
    if ("TripsreserveUser".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveUser>(){}.getType();
    }
    
    if ("TripsreserveconfirmTickets".equalsIgnoreCase(className)) {
      return new TypeToken<TripsreserveconfirmTickets>(){}.getType();
    }
    
    if ("UserCheckRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UserCheckRequest>(){}.getType();
    }
    
    if ("UserCheckRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<UserCheckRequestUser>(){}.getType();
    }
    
    if ("UserProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UserProfileRequest>(){}.getType();
    }
    
    if ("UserProfileRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<UserProfileRequestUser>(){}.getType();
    }
    
    if ("UserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UserRequest>(){}.getType();
    }
    
    if ("UserRequestUser".equalsIgnoreCase(className)) {
      return new TypeToken<UserRequestUser>(){}.getType();
    }
    
    if ("UserTicket".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicket>(){}.getType();
    }
    
    if ("UserTicketChecks".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketChecks>(){}.getType();
    }
    
    if ("UserTicketFare".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketFare>(){}.getType();
    }
    
    if ("UserTicketFareAttributes".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketFareAttributes>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMeta".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketFareAttributesMeta>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMetaTemplate".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketFareAttributesMetaTemplate>(){}.getType();
    }
    
    if ("UserTicketFareAttributesMetaTemplateIt".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketFareAttributesMetaTemplateIt>(){}.getType();
    }
    
    if ("UserTicketPayment".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketPayment>(){}.getType();
    }
    
    if ("UserTicketStatus".equalsIgnoreCase(className)) {
      return new TypeToken<UserTicketStatus>(){}.getType();
    }
    
    if ("ValidatePassRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ValidatePassRequest>(){}.getType();
    }
    
    if ("ValidateTicketRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ValidateTicketRequest>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};