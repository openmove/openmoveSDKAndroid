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

import com.openmove.aroundsardinia.TicketsRequestPSPFares;
import com.openmove.aroundsardinia.TicketsRequestPSPUser;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TicketsRequestPSP {
  
  @SerializedName("user")
  private TicketsRequestPSPUser user = null;
  @SerializedName("fares")
  private List<TicketsRequestPSPFares> fares = null;
  @SerializedName("transactionId")
  private String transactionId = null;
  @SerializedName("force3DSecure")
  private Boolean force3DSecure = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("outcomeURL")
  private String outcomeURL = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TicketsRequestPSPUser getUser() {
    return user;
  }
  public void setUser(TicketsRequestPSPUser user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<TicketsRequestPSPFares> getFares() {
    return fares;
  }
  public void setFares(List<TicketsRequestPSPFares> fares) {
    this.fares = fares;
  }

  /**
   * transaction id has to be unique for a merchant
   **/
  @ApiModelProperty(required = true, value = "transaction id has to be unique for a merchant")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * if true the user have to authorize the payment, even if a previous payment was authorized. If false the user can skip the authorization redirect if a previous payment was authorized
   **/
  @ApiModelProperty(value = "if true the user have to authorize the payment, even if a previous payment was authorized. If false the user can skip the authorization redirect if a previous payment was authorized")
  public Boolean getForce3DSecure() {
    return force3DSecure;
  }
  public void setForce3DSecure(Boolean force3DSecure) {
    this.force3DSecure = force3DSecure;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    TicketsRequestPSP ticketsRequestPSP = (TicketsRequestPSP) o;
    return (this.user == null ? ticketsRequestPSP.user == null : this.user.equals(ticketsRequestPSP.user)) &&
        (this.fares == null ? ticketsRequestPSP.fares == null : this.fares.equals(ticketsRequestPSP.fares)) &&
        (this.transactionId == null ? ticketsRequestPSP.transactionId == null : this.transactionId.equals(ticketsRequestPSP.transactionId)) &&
        (this.force3DSecure == null ? ticketsRequestPSP.force3DSecure == null : this.force3DSecure.equals(ticketsRequestPSP.force3DSecure)) &&
        (this.description == null ? ticketsRequestPSP.description == null : this.description.equals(ticketsRequestPSP.description)) &&
        (this.outcomeURL == null ? ticketsRequestPSP.outcomeURL == null : this.outcomeURL.equals(ticketsRequestPSP.outcomeURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.fares == null ? 0: this.fares.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    result = 31 * result + (this.force3DSecure == null ? 0: this.force3DSecure.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.outcomeURL == null ? 0: this.outcomeURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketsRequestPSP {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  fares: ").append(fares).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  force3DSecure: ").append(force3DSecure).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  outcomeURL: ").append(outcomeURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
