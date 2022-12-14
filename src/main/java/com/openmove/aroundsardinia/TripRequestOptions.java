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
import com.openmove.aroundsardinia.TripRequestOptionsExtra;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TripRequestOptions {
  
  @SerializedName("from")
  private LatLng from = null;
  @SerializedName("to")
  private LatLng to = null;
  @SerializedName("date")
  private Integer date = null;
  @SerializedName("mode")
  private String mode = null;
  @SerializedName("extra")
  private TripRequestOptionsExtra extra = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public LatLng getFrom() {
    return from;
  }
  public void setFrom(LatLng from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public LatLng getTo() {
    return to;
  }
  public void setTo(LatLng to) {
    this.to = to;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDate() {
    return date;
  }
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMode() {
    return mode;
  }
  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TripRequestOptionsExtra getExtra() {
    return extra;
  }
  public void setExtra(TripRequestOptionsExtra extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripRequestOptions tripRequestOptions = (TripRequestOptions) o;
    return (this.from == null ? tripRequestOptions.from == null : this.from.equals(tripRequestOptions.from)) &&
        (this.to == null ? tripRequestOptions.to == null : this.to.equals(tripRequestOptions.to)) &&
        (this.date == null ? tripRequestOptions.date == null : this.date.equals(tripRequestOptions.date)) &&
        (this.mode == null ? tripRequestOptions.mode == null : this.mode.equals(tripRequestOptions.mode)) &&
        (this.extra == null ? tripRequestOptions.extra == null : this.extra.equals(tripRequestOptions.extra));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.from == null ? 0: this.from.hashCode());
    result = 31 * result + (this.to == null ? 0: this.to.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.mode == null ? 0: this.mode.hashCode());
    result = 31 * result + (this.extra == null ? 0: this.extra.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripRequestOptions {\n");
    
    sb.append("  from: ").append(from).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  mode: ").append(mode).append("\n");
    sb.append("  extra: ").append(extra).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
