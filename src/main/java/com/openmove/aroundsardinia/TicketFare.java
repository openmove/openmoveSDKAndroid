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

import com.openmove.aroundsardinia.TicketFareAttributes;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TicketFare {
  
  @SerializedName("attributes")
  private TicketFareAttributes attributes = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TicketFareAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(TicketFareAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketFare ticketFare = (TicketFare) o;
    return (this.attributes == null ? ticketFare.attributes == null : this.attributes.equals(ticketFare.attributes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketFare {\n");
    
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}