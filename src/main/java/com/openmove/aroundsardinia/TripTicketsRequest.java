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

package com.openmove.aroundsardinia;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TripTicketsRequest {
  
  @SerializedName("trip")
  private Object trip = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Object getTrip() {
    return trip;
  }
  public void setTrip(Object trip) {
    this.trip = trip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripTicketsRequest tripTicketsRequest = (TripTicketsRequest) o;
    return (this.trip == null ? tripTicketsRequest.trip == null : this.trip.equals(tripTicketsRequest.trip));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.trip == null ? 0: this.trip.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripTicketsRequest {\n");
    
    sb.append("  trip: ").append(trip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
