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

import com.openmove.aroundsardinia.UserTicketFareAttributesMetaTemplateIt;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserTicketFareAttributesMetaTemplate {
  
  @SerializedName("it")
  private UserTicketFareAttributesMetaTemplateIt it = null;
  @SerializedName("en")
  private UserTicketFareAttributesMetaTemplateIt en = null;
  @SerializedName("de")
  private UserTicketFareAttributesMetaTemplateIt de = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UserTicketFareAttributesMetaTemplateIt getIt() {
    return it;
  }
  public void setIt(UserTicketFareAttributesMetaTemplateIt it) {
    this.it = it;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserTicketFareAttributesMetaTemplateIt getEn() {
    return en;
  }
  public void setEn(UserTicketFareAttributesMetaTemplateIt en) {
    this.en = en;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserTicketFareAttributesMetaTemplateIt getDe() {
    return de;
  }
  public void setDe(UserTicketFareAttributesMetaTemplateIt de) {
    this.de = de;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTicketFareAttributesMetaTemplate userTicketFareAttributesMetaTemplate = (UserTicketFareAttributesMetaTemplate) o;
    return (this.it == null ? userTicketFareAttributesMetaTemplate.it == null : this.it.equals(userTicketFareAttributesMetaTemplate.it)) &&
        (this.en == null ? userTicketFareAttributesMetaTemplate.en == null : this.en.equals(userTicketFareAttributesMetaTemplate.en)) &&
        (this.de == null ? userTicketFareAttributesMetaTemplate.de == null : this.de.equals(userTicketFareAttributesMetaTemplate.de));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.it == null ? 0: this.it.hashCode());
    result = 31 * result + (this.en == null ? 0: this.en.hashCode());
    result = 31 * result + (this.de == null ? 0: this.de.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTicketFareAttributesMetaTemplate {\n");
    
    sb.append("  it: ").append(it).append("\n");
    sb.append("  en: ").append(en).append("\n");
    sb.append("  de: ").append(de).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}