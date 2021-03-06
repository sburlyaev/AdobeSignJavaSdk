/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.widgets;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.widgets.Document;
import io.swagger.client.model.widgets.URLFileInfo;
import java.io.IOException;

/**
 * FileInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:50:01.583+05:30")
public class FileInfo {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("transientDocumentId")
  private String transientDocumentId = null;

  @SerializedName("urlFileInfo")
  private URLFileInfo urlFileInfo = null;

  public FileInfo document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * A document that is associated with the widget. This field cannot be provided in POST call. In case of GET call, this is the only field returned in the response
   * @return document
  **/
  @ApiModelProperty(value = "A document that is associated with the widget. This field cannot be provided in POST call. In case of GET call, this is the only field returned in the response")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public FileInfo transientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
    return this;
  }

   /**
   * ID for a transient document that will be added to the widget
   * @return transientDocumentId
  **/
  @ApiModelProperty(value = "ID for a transient document that will be added to the widget")
  public String getTransientDocumentId() {
    return transientDocumentId;
  }

  public void setTransientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
  }

  public FileInfo urlFileInfo(URLFileInfo urlFileInfo) {
    this.urlFileInfo = urlFileInfo;
    return this;
  }

   /**
   * URL for an external document to add to the agreement
   * @return urlFileInfo
  **/
  @ApiModelProperty(value = "URL for an external document to add to the agreement")
  public URLFileInfo getUrlFileInfo() {
    return urlFileInfo;
  }

  public void setUrlFileInfo(URLFileInfo urlFileInfo) {
    this.urlFileInfo = urlFileInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInfo fileInfo = (FileInfo) o;
    return Objects.equals(this.document, fileInfo.document) &&
        Objects.equals(this.transientDocumentId, fileInfo.transientDocumentId) &&
        Objects.equals(this.urlFileInfo, fileInfo.urlFileInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, transientDocumentId, urlFileInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfo {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    transientDocumentId: ").append(toIndentedString(transientDocumentId)).append("\n");
    sb.append("    urlFileInfo: ").append(toIndentedString(urlFileInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

