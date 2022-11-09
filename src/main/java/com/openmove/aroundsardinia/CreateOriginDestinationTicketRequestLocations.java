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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateOriginDestinationTicketRequestLocations {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("lat")
  private BigDecimal lat = null;
  @SerializedName("lng")
  private BigDecimal lng = null;
  @SerializedName("hereLocationId")
  private String hereLocationId = null;
  public enum TypeEnum {
     origin,  destination, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLat() {
    return lat;
  }
  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLng() {
    return lng;
  }
  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHereLocationId() {
    return hereLocationId;
  }
  public void setHereLocationId(String hereLocationId) {
    this.hereLocationId = hereLocationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOriginDestinationTicketRequestLocations createOriginDestinationTicketRequestLocations = (CreateOriginDestinationTicketRequestLocations) o;
    return (this.name == null ? createOriginDestinationTicketRequestLocations.name == null : this.name.equals(createOriginDestinationTicketRequestLocations.name)) &&
        (this.lat == null ? createOriginDestinationTicketRequestLocations.lat == null : this.lat.equals(createOriginDestinationTicketRequestLocations.lat)) &&
        (this.lng == null ? createOriginDestinationTicketRequestLocations.lng == null : this.lng.equals(createOriginDestinationTicketRequestLocations.lng)) &&
        (this.hereLocationId == null ? createOriginDestinationTicketRequestLocations.hereLocationId == null : this.hereLocationId.equals(createOriginDestinationTicketRequestLocations.hereLocationId)) &&
        (this.type == null ? createOriginDestinationTicketRequestLocations.type == null : this.type.equals(createOriginDestinationTicketRequestLocations.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lng == null ? 0: this.lng.hashCode());
    result = 31 * result + (this.hereLocationId == null ? 0: this.hereLocationId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOriginDestinationTicketRequestLocations {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lng: ").append(lng).append("\n");
    sb.append("  hereLocationId: ").append(hereLocationId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
