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

import com.openmove.aroundsardinia.UserTicketFareAttributesMetaTemplate;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserTicketFareAttributesMeta {
  
  @SerializedName("logo")
  private String logo = null;
  @SerializedName("agencyId")
  private String agencyId = null;
  @SerializedName("agencyCode")
  private String agencyCode = null;
  @SerializedName("template")
  private UserTicketFareAttributesMetaTemplate template = null;

  /**
   * agency logo url
   **/
  @ApiModelProperty(value = "agency logo url")
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }

  /**
   * agency identifier
   **/
  @ApiModelProperty(value = "agency identifier")
  public String getAgencyId() {
    return agencyId;
  }
  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  /**
   * agency code
   **/
  @ApiModelProperty(value = "agency code")
  public String getAgencyCode() {
    return agencyCode;
  }
  public void setAgencyCode(String agencyCode) {
    this.agencyCode = agencyCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserTicketFareAttributesMetaTemplate getTemplate() {
    return template;
  }
  public void setTemplate(UserTicketFareAttributesMetaTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTicketFareAttributesMeta userTicketFareAttributesMeta = (UserTicketFareAttributesMeta) o;
    return (this.logo == null ? userTicketFareAttributesMeta.logo == null : this.logo.equals(userTicketFareAttributesMeta.logo)) &&
        (this.agencyId == null ? userTicketFareAttributesMeta.agencyId == null : this.agencyId.equals(userTicketFareAttributesMeta.agencyId)) &&
        (this.agencyCode == null ? userTicketFareAttributesMeta.agencyCode == null : this.agencyCode.equals(userTicketFareAttributesMeta.agencyCode)) &&
        (this.template == null ? userTicketFareAttributesMeta.template == null : this.template.equals(userTicketFareAttributesMeta.template));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.logo == null ? 0: this.logo.hashCode());
    result = 31 * result + (this.agencyId == null ? 0: this.agencyId.hashCode());
    result = 31 * result + (this.agencyCode == null ? 0: this.agencyCode.hashCode());
    result = 31 * result + (this.template == null ? 0: this.template.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTicketFareAttributesMeta {\n");
    
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  agencyId: ").append(agencyId).append("\n");
    sb.append("  agencyCode: ").append(agencyCode).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
