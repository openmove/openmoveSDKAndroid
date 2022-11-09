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

import com.openmove.aroundsardinia.CreateLineZoneTicketRequestLocations;
import com.openmove.aroundsardinia.CreateLineZoneTicketRequestTicket;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateLineZoneTicketRequest {
  
  @SerializedName("locations")
  private List<CreateLineZoneTicketRequestLocations> locations = null;
  @SerializedName("ticket")
  private CreateLineZoneTicketRequestTicket ticket = null;
  public enum ValidationEnum {
     qr,  nfc,  code,  manual, 
  };
  @SerializedName("validation")
  private List<ValidationEnum> validation = null;
  public enum TypeEnum {
     generic,  bus,  train,  cable,  skibus,  parking,  barrierParking,  ship,  plane,  bike,  mountain, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CreateLineZoneTicketRequestLocations> getLocations() {
    return locations;
  }
  public void setLocations(List<CreateLineZoneTicketRequestLocations> locations) {
    this.locations = locations;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateLineZoneTicketRequestTicket getTicket() {
    return ticket;
  }
  public void setTicket(CreateLineZoneTicketRequestTicket ticket) {
    this.ticket = ticket;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ValidationEnum> getValidation() {
    return validation;
  }
  public void setValidation(List<ValidationEnum> validation) {
    this.validation = validation;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLineZoneTicketRequest createLineZoneTicketRequest = (CreateLineZoneTicketRequest) o;
    return (this.locations == null ? createLineZoneTicketRequest.locations == null : this.locations.equals(createLineZoneTicketRequest.locations)) &&
        (this.ticket == null ? createLineZoneTicketRequest.ticket == null : this.ticket.equals(createLineZoneTicketRequest.ticket)) &&
        (this.validation == null ? createLineZoneTicketRequest.validation == null : this.validation.equals(createLineZoneTicketRequest.validation)) &&
        (this.type == null ? createLineZoneTicketRequest.type == null : this.type.equals(createLineZoneTicketRequest.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.locations == null ? 0: this.locations.hashCode());
    result = 31 * result + (this.ticket == null ? 0: this.ticket.hashCode());
    result = 31 * result + (this.validation == null ? 0: this.validation.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLineZoneTicketRequest {\n");
    
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  ticket: ").append(ticket).append("\n");
    sb.append("  validation: ").append(validation).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}