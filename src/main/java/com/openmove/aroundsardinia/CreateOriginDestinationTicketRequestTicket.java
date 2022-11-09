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

import com.openmove.aroundsardinia.CreateLineZoneTicketRequestTicketDuration;
import com.openmove.aroundsardinia.CreateLineZoneTicketRequestTicketExpire;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateOriginDestinationTicketRequestTicket {
  
  @SerializedName("origin")
  private String origin = null;
  @SerializedName("destination")
  private String destination = null;
  @SerializedName("price")
  private BigDecimal price = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("special_info")
  private String specialInfo = null;
  @SerializedName("text_back")
  private String textBack = null;
  @SerializedName("duration")
  private CreateLineZoneTicketRequestTicketDuration duration = null;
  @SerializedName("expire")
  private CreateLineZoneTicketRequestTicketExpire expire = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSpecialInfo() {
    return specialInfo;
  }
  public void setSpecialInfo(String specialInfo) {
    this.specialInfo = specialInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTextBack() {
    return textBack;
  }
  public void setTextBack(String textBack) {
    this.textBack = textBack;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateLineZoneTicketRequestTicketDuration getDuration() {
    return duration;
  }
  public void setDuration(CreateLineZoneTicketRequestTicketDuration duration) {
    this.duration = duration;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateLineZoneTicketRequestTicketExpire getExpire() {
    return expire;
  }
  public void setExpire(CreateLineZoneTicketRequestTicketExpire expire) {
    this.expire = expire;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOriginDestinationTicketRequestTicket createOriginDestinationTicketRequestTicket = (CreateOriginDestinationTicketRequestTicket) o;
    return (this.origin == null ? createOriginDestinationTicketRequestTicket.origin == null : this.origin.equals(createOriginDestinationTicketRequestTicket.origin)) &&
        (this.destination == null ? createOriginDestinationTicketRequestTicket.destination == null : this.destination.equals(createOriginDestinationTicketRequestTicket.destination)) &&
        (this.price == null ? createOriginDestinationTicketRequestTicket.price == null : this.price.equals(createOriginDestinationTicketRequestTicket.price)) &&
        (this.quantity == null ? createOriginDestinationTicketRequestTicket.quantity == null : this.quantity.equals(createOriginDestinationTicketRequestTicket.quantity)) &&
        (this.specialInfo == null ? createOriginDestinationTicketRequestTicket.specialInfo == null : this.specialInfo.equals(createOriginDestinationTicketRequestTicket.specialInfo)) &&
        (this.textBack == null ? createOriginDestinationTicketRequestTicket.textBack == null : this.textBack.equals(createOriginDestinationTicketRequestTicket.textBack)) &&
        (this.duration == null ? createOriginDestinationTicketRequestTicket.duration == null : this.duration.equals(createOriginDestinationTicketRequestTicket.duration)) &&
        (this.expire == null ? createOriginDestinationTicketRequestTicket.expire == null : this.expire.equals(createOriginDestinationTicketRequestTicket.expire));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.origin == null ? 0: this.origin.hashCode());
    result = 31 * result + (this.destination == null ? 0: this.destination.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.specialInfo == null ? 0: this.specialInfo.hashCode());
    result = 31 * result + (this.textBack == null ? 0: this.textBack.hashCode());
    result = 31 * result + (this.duration == null ? 0: this.duration.hashCode());
    result = 31 * result + (this.expire == null ? 0: this.expire.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOriginDestinationTicketRequestTicket {\n");
    
    sb.append("  origin: ").append(origin).append("\n");
    sb.append("  destination: ").append(destination).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  specialInfo: ").append(specialInfo).append("\n");
    sb.append("  textBack: ").append(textBack).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  expire: ").append(expire).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
