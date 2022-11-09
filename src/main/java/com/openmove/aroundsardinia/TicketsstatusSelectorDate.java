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
public class TicketsstatusSelectorDate {
  
  @SerializedName("start")
  private BigDecimal start = null;
  @SerializedName("end")
  private BigDecimal end = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getStart() {
    return start;
  }
  public void setStart(BigDecimal start) {
    this.start = start;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getEnd() {
    return end;
  }
  public void setEnd(BigDecimal end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketsstatusSelectorDate ticketsstatusSelectorDate = (TicketsstatusSelectorDate) o;
    return (this.start == null ? ticketsstatusSelectorDate.start == null : this.start.equals(ticketsstatusSelectorDate.start)) &&
        (this.end == null ? ticketsstatusSelectorDate.end == null : this.end.equals(ticketsstatusSelectorDate.end));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.start == null ? 0: this.start.hashCode());
    result = 31 * result + (this.end == null ? 0: this.end.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketsstatusSelectorDate {\n");
    
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
