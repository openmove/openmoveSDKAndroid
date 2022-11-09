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

import com.openmove.aroundsardinia.LatLng;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Body3 {
  
  @SerializedName("agencyId")
  private String agencyId = null;
  @SerializedName("location")
  private LatLng location = null;
  @SerializedName("radius")
  private BigDecimal radius = null;
  @SerializedName("limit")
  private BigDecimal limit = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAgencyId() {
    return agencyId;
  }
  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public LatLng getLocation() {
    return location;
  }
  public void setLocation(LatLng location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRadius() {
    return radius;
  }
  public void setRadius(BigDecimal radius) {
    this.radius = radius;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLimit() {
    return limit;
  }
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return (this.agencyId == null ? body3.agencyId == null : this.agencyId.equals(body3.agencyId)) &&
        (this.location == null ? body3.location == null : this.location.equals(body3.location)) &&
        (this.radius == null ? body3.radius == null : this.radius.equals(body3.radius)) &&
        (this.limit == null ? body3.limit == null : this.limit.equals(body3.limit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.agencyId == null ? 0: this.agencyId.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.radius == null ? 0: this.radius.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("  agencyId: ").append(agencyId).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  radius: ").append(radius).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
