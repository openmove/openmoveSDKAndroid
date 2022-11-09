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
public class TripsreserveconfirmTickets {
  
  @SerializedName("_id")
  private String id = null;
  @SerializedName("paymentIntentId")
  private String paymentIntentId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPaymentIntentId() {
    return paymentIntentId;
  }
  public void setPaymentIntentId(String paymentIntentId) {
    this.paymentIntentId = paymentIntentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripsreserveconfirmTickets tripsreserveconfirmTickets = (TripsreserveconfirmTickets) o;
    return (this.id == null ? tripsreserveconfirmTickets.id == null : this.id.equals(tripsreserveconfirmTickets.id)) &&
        (this.paymentIntentId == null ? tripsreserveconfirmTickets.paymentIntentId == null : this.paymentIntentId.equals(tripsreserveconfirmTickets.paymentIntentId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.paymentIntentId == null ? 0: this.paymentIntentId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripsreserveconfirmTickets {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  paymentIntentId: ").append(paymentIntentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}