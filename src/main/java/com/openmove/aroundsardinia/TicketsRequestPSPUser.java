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
public class TicketsRequestPSPUser {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  public enum LangEnum {
     ITA,  DEU,  FRA,  USA,  POR,  RUS,  SPA, 
  };
  @SerializedName("lang")
  private LangEnum lang = null;

  /**
   * user identifier
   **/
  @ApiModelProperty(required = true, value = "user identifier")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * user language used in payment page.
   **/
  @ApiModelProperty(value = "user language used in payment page.")
  public LangEnum getLang() {
    return lang;
  }
  public void setLang(LangEnum lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketsRequestPSPUser ticketsRequestPSPUser = (TicketsRequestPSPUser) o;
    return (this.id == null ? ticketsRequestPSPUser.id == null : this.id.equals(ticketsRequestPSPUser.id)) &&
        (this.name == null ? ticketsRequestPSPUser.name == null : this.name.equals(ticketsRequestPSPUser.name)) &&
        (this.email == null ? ticketsRequestPSPUser.email == null : this.email.equals(ticketsRequestPSPUser.email)) &&
        (this.lang == null ? ticketsRequestPSPUser.lang == null : this.lang.equals(ticketsRequestPSPUser.lang));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.lang == null ? 0: this.lang.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketsRequestPSPUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}