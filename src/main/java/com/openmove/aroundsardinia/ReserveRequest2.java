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

import com.openmove.aroundsardinia.ParkingsreserveTickets1;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ReserveRequest2 {
  
  @SerializedName("tickets")
  private List<ParkingsreserveTickets1> tickets = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ParkingsreserveTickets1> getTickets() {
    return tickets;
  }
  public void setTickets(List<ParkingsreserveTickets1> tickets) {
    this.tickets = tickets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReserveRequest2 reserveRequest2 = (ReserveRequest2) o;
    return (this.tickets == null ? reserveRequest2.tickets == null : this.tickets.equals(reserveRequest2.tickets));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tickets == null ? 0: this.tickets.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReserveRequest2 {\n");
    
    sb.append("  tickets: ").append(tickets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
