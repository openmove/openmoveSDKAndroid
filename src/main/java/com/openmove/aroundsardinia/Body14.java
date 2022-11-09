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
public class Body14 {
  
  @SerializedName("userId")
  private String userId = null;
  @SerializedName("cardId")
  private String cardId = null;
  @SerializedName("outcomeURL")
  private String outcomeURL = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOutcomeURL() {
    return outcomeURL;
  }
  public void setOutcomeURL(String outcomeURL) {
    this.outcomeURL = outcomeURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body14 body14 = (Body14) o;
    return (this.userId == null ? body14.userId == null : this.userId.equals(body14.userId)) &&
        (this.cardId == null ? body14.cardId == null : this.cardId.equals(body14.cardId)) &&
        (this.outcomeURL == null ? body14.outcomeURL == null : this.outcomeURL.equals(body14.outcomeURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.cardId == null ? 0: this.cardId.hashCode());
    result = 31 * result + (this.outcomeURL == null ? 0: this.outcomeURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body14 {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  outcomeURL: ").append(outcomeURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
