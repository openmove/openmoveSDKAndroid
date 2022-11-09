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
public class IdmregisterCompany {
  
  @SerializedName("businnes_name")
  private String businnesName = null;
  @SerializedName("businnes_email")
  private String businnesEmail = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("vatcode")
  private String vatcode = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBusinnesName() {
    return businnesName;
  }
  public void setBusinnesName(String businnesName) {
    this.businnesName = businnesName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBusinnesEmail() {
    return businnesEmail;
  }
  public void setBusinnesEmail(String businnesEmail) {
    this.businnesEmail = businnesEmail;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVatcode() {
    return vatcode;
  }
  public void setVatcode(String vatcode) {
    this.vatcode = vatcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmregisterCompany idmregisterCompany = (IdmregisterCompany) o;
    return (this.businnesName == null ? idmregisterCompany.businnesName == null : this.businnesName.equals(idmregisterCompany.businnesName)) &&
        (this.businnesEmail == null ? idmregisterCompany.businnesEmail == null : this.businnesEmail.equals(idmregisterCompany.businnesEmail)) &&
        (this.address == null ? idmregisterCompany.address == null : this.address.equals(idmregisterCompany.address)) &&
        (this.vatcode == null ? idmregisterCompany.vatcode == null : this.vatcode.equals(idmregisterCompany.vatcode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.businnesName == null ? 0: this.businnesName.hashCode());
    result = 31 * result + (this.businnesEmail == null ? 0: this.businnesEmail.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.vatcode == null ? 0: this.vatcode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdmregisterCompany {\n");
    
    sb.append("  businnesName: ").append(businnesName).append("\n");
    sb.append("  businnesEmail: ").append(businnesEmail).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  vatcode: ").append(vatcode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}