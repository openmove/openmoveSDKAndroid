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
public class CreateLineZoneTicketRequestTicket {
  
  @SerializedName("title")
  private String title = null;
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
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
    CreateLineZoneTicketRequestTicket createLineZoneTicketRequestTicket = (CreateLineZoneTicketRequestTicket) o;
    return (this.title == null ? createLineZoneTicketRequestTicket.title == null : this.title.equals(createLineZoneTicketRequestTicket.title)) &&
        (this.price == null ? createLineZoneTicketRequestTicket.price == null : this.price.equals(createLineZoneTicketRequestTicket.price)) &&
        (this.quantity == null ? createLineZoneTicketRequestTicket.quantity == null : this.quantity.equals(createLineZoneTicketRequestTicket.quantity)) &&
        (this.specialInfo == null ? createLineZoneTicketRequestTicket.specialInfo == null : this.specialInfo.equals(createLineZoneTicketRequestTicket.specialInfo)) &&
        (this.textBack == null ? createLineZoneTicketRequestTicket.textBack == null : this.textBack.equals(createLineZoneTicketRequestTicket.textBack)) &&
        (this.duration == null ? createLineZoneTicketRequestTicket.duration == null : this.duration.equals(createLineZoneTicketRequestTicket.duration)) &&
        (this.expire == null ? createLineZoneTicketRequestTicket.expire == null : this.expire.equals(createLineZoneTicketRequestTicket.expire));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
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
    sb.append("class CreateLineZoneTicketRequestTicket {\n");
    
    sb.append("  title: ").append(title).append("\n");
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
