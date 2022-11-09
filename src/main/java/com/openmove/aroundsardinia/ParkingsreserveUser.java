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

import com.openmove.aroundsardinia.Plate;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ParkingsreserveUser {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("surname")
  private String surname = null;
  @SerializedName("nationality")
  private String nationality = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("plate")
  private Plate plate = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("tnc")
  private Boolean tnc = null;
  @SerializedName("commercial")
  private Boolean commercial = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Plate getPlate() {
    return plate;
  }
  public void setPlate(Plate plate) {
    this.plate = plate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getTnc() {
    return tnc;
  }
  public void setTnc(Boolean tnc) {
    this.tnc = tnc;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getCommercial() {
    return commercial;
  }
  public void setCommercial(Boolean commercial) {
    this.commercial = commercial;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParkingsreserveUser parkingsreserveUser = (ParkingsreserveUser) o;
    return (this.name == null ? parkingsreserveUser.name == null : this.name.equals(parkingsreserveUser.name)) &&
        (this.surname == null ? parkingsreserveUser.surname == null : this.surname.equals(parkingsreserveUser.surname)) &&
        (this.nationality == null ? parkingsreserveUser.nationality == null : this.nationality.equals(parkingsreserveUser.nationality)) &&
        (this.email == null ? parkingsreserveUser.email == null : this.email.equals(parkingsreserveUser.email)) &&
        (this.plate == null ? parkingsreserveUser.plate == null : this.plate.equals(parkingsreserveUser.plate)) &&
        (this.phone == null ? parkingsreserveUser.phone == null : this.phone.equals(parkingsreserveUser.phone)) &&
        (this.tnc == null ? parkingsreserveUser.tnc == null : this.tnc.equals(parkingsreserveUser.tnc)) &&
        (this.commercial == null ? parkingsreserveUser.commercial == null : this.commercial.equals(parkingsreserveUser.commercial));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.surname == null ? 0: this.surname.hashCode());
    result = 31 * result + (this.nationality == null ? 0: this.nationality.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.plate == null ? 0: this.plate.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.tnc == null ? 0: this.tnc.hashCode());
    result = 31 * result + (this.commercial == null ? 0: this.commercial.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParkingsreserveUser {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  nationality: ").append(nationality).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  plate: ").append(plate).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  tnc: ").append(tnc).append("\n");
    sb.append("  commercial: ").append(commercial).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
