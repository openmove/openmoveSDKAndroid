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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserTicketChecks {
  
  @SerializedName("time")
  private Date time = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("bus")
  private String bus = null;
  @SerializedName("site")
  private String site = null;
  @SerializedName("qr")
  private String qr = null;
  public enum TypeEnum {
     qr,  nfc,  code, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum PlaceEnum {
     S,  A, 
  };
  @SerializedName("place")
  private PlaceEnum place = null;

  /**
   * date when check is performed
   **/
  @ApiModelProperty(value = "date when check is performed")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   * code provided for the check or place name if identified
   **/
  @ApiModelProperty(value = "code provided for the check or place name if identified")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * bus code identified
   **/
  @ApiModelProperty(value = "bus code identified")
  public String getBus() {
    return bus;
  }
  public void setBus(String bus) {
    this.bus = bus;
  }

  /**
   * stop code identified
   **/
  @ApiModelProperty(value = "stop code identified")
  public String getSite() {
    return site;
  }
  public void setSite(String site) {
    this.site = site;
  }

  /**
   * code provided for the check
   **/
  @ApiModelProperty(value = "code provided for the check")
  public String getQr() {
    return qr;
  }
  public void setQr(String qr) {
    this.qr = qr;
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

  /**
   * place type (S: stop place, A: bus)
   **/
  @ApiModelProperty(value = "place type (S: stop place, A: bus)")
  public PlaceEnum getPlace() {
    return place;
  }
  public void setPlace(PlaceEnum place) {
    this.place = place;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTicketChecks userTicketChecks = (UserTicketChecks) o;
    return (this.time == null ? userTicketChecks.time == null : this.time.equals(userTicketChecks.time)) &&
        (this.code == null ? userTicketChecks.code == null : this.code.equals(userTicketChecks.code)) &&
        (this.bus == null ? userTicketChecks.bus == null : this.bus.equals(userTicketChecks.bus)) &&
        (this.site == null ? userTicketChecks.site == null : this.site.equals(userTicketChecks.site)) &&
        (this.qr == null ? userTicketChecks.qr == null : this.qr.equals(userTicketChecks.qr)) &&
        (this.type == null ? userTicketChecks.type == null : this.type.equals(userTicketChecks.type)) &&
        (this.place == null ? userTicketChecks.place == null : this.place.equals(userTicketChecks.place));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.bus == null ? 0: this.bus.hashCode());
    result = 31 * result + (this.site == null ? 0: this.site.hashCode());
    result = 31 * result + (this.qr == null ? 0: this.qr.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.place == null ? 0: this.place.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTicketChecks {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  bus: ").append(bus).append("\n");
    sb.append("  site: ").append(site).append("\n");
    sb.append("  qr: ").append(qr).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  place: ").append(place).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
