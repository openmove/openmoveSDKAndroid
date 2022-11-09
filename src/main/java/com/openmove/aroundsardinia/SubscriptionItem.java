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

import com.openmove.aroundsardinia.SubscriptionItemNotification;
import com.openmove.aroundsardinia.SubscriptionItemSubject;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SubscriptionItem {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("subject")
  private SubscriptionItemSubject subject = null;
  @SerializedName("notification")
  private SubscriptionItemNotification notification = null;
  @SerializedName("expires")
  private Date expires = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SubscriptionItemSubject getSubject() {
    return subject;
  }
  public void setSubject(SubscriptionItemSubject subject) {
    this.subject = subject;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SubscriptionItemNotification getNotification() {
    return notification;
  }
  public void setNotification(SubscriptionItemNotification notification) {
    this.notification = notification;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionItem subscriptionItem = (SubscriptionItem) o;
    return (this.description == null ? subscriptionItem.description == null : this.description.equals(subscriptionItem.description)) &&
        (this.subject == null ? subscriptionItem.subject == null : this.subject.equals(subscriptionItem.subject)) &&
        (this.notification == null ? subscriptionItem.notification == null : this.notification.equals(subscriptionItem.notification)) &&
        (this.expires == null ? subscriptionItem.expires == null : this.expires.equals(subscriptionItem.expires));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.subject == null ? 0: this.subject.hashCode());
    result = 31 * result + (this.notification == null ? 0: this.notification.hashCode());
    result = 31 * result + (this.expires == null ? 0: this.expires.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionItem {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  notification: ").append(notification).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}