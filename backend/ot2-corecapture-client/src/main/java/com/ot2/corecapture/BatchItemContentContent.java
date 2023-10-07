/*
 * Core Capture Services
 * OpenText Core Capture Services are a set of RESTful web service interfaces that provides capture functionality. Being developed in a purely RESTful style, Core Capture Services are easier to consume for the purposes of writing custom clients.  Core Capture Services identifies resources by Uniform Resource Identifiers (URIs). It defines specific media types to represent resources and drives application state transfers by using link relations. It uses a limited number of HTTP standard methods (GET, POST, and DELETE) to manipulate these resources over the HTTP protocol.  Core Capture Services (hereafter simply called, \"service\") supports only the JSON format for resource representation. JavaScript Object Notation (JSON) is a lightweight data interchange format based on a subset of the JavaScript Programming Language standard.
 *
 * The version of the OpenAPI document: 23.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ot2.corecapture;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ot2.JSON;

/**
 * JSON object representing the content for this entry.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-08T02:36:37.231944200+05:30[Asia/Calcutta]")
public class BatchItemContentContent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BATCH_NAME = "batchName";
  @SerializedName(SERIALIZED_NAME_BATCH_NAME)
  private String batchName;

  /**
   * C - Batch created. Caller may add values. P - Pending Dispatch. No more changes may be made. S - Batch was sent to the server successfully. E - Final attempt failed. Batch will not be sent anymore
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    C("C"),
    
    P("P"),
    
    S("S"),
    
    E("E");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SERVER_BATCH_ID = "serverBatchId";
  @SerializedName(SERIALIZED_NAME_SERVER_BATCH_ID)
  private String serverBatchId;

  public static final String SERIALIZED_NAME_CAPTURE_FLOW = "captureFlow";
  @SerializedName(SERIALIZED_NAME_CAPTURE_FLOW)
  private String captureFlow;

  public static final String SERIALIZED_NAME_BATCH_ROOT_LEVEL = "batchRootLevel";
  @SerializedName(SERIALIZED_NAME_BATCH_ROOT_LEVEL)
  private Integer batchRootLevel;

  public static final String SERIALIZED_NAME_BATCH_PRIORITY = "batchPriority";
  @SerializedName(SERIALIZED_NAME_BATCH_PRIORITY)
  private Integer batchPriority;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_LAST_ERROR = "lastError";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  private String lastError;

  public static final String SERIALIZED_NAME_LOCAL_EXPORT_FILE_ID = "localExportFileId";
  @SerializedName(SERIALIZED_NAME_LOCAL_EXPORT_FILE_ID)
  private String localExportFileId;

  public BatchItemContentContent() {
  }

  public BatchItemContentContent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Batch handle ID only for the current session.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BatchItemContentContent batchName(String batchName) {
    
    this.batchName = batchName;
    return this;
  }

   /**
   * Not localized. Name of batch given by the creator.
   * @return batchName
  **/
  @javax.annotation.Nullable
  public String getBatchName() {
    return batchName;
  }


  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  public BatchItemContentContent status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * C - Batch created. Caller may add values. P - Pending Dispatch. No more changes may be made. S - Batch was sent to the server successfully. E - Final attempt failed. Batch will not be sent anymore
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BatchItemContentContent serverBatchId(String serverBatchId) {
    
    this.serverBatchId = serverBatchId;
    return this;
  }

   /**
   * ID created in InputAccel server. Empty if not sent to InputAccel server.
   * @return serverBatchId
  **/
  @javax.annotation.Nullable
  public String getServerBatchId() {
    return serverBatchId;
  }


  public void setServerBatchId(String serverBatchId) {
    this.serverBatchId = serverBatchId;
  }


  public BatchItemContentContent captureFlow(String captureFlow) {
    
    this.captureFlow = captureFlow;
    return this;
  }

   /**
   * Name of the InputAccel CaptureFlow associated with the batch
   * @return captureFlow
  **/
  @javax.annotation.Nullable
  public String getCaptureFlow() {
    return captureFlow;
  }


  public void setCaptureFlow(String captureFlow) {
    this.captureFlow = captureFlow;
  }


  public BatchItemContentContent batchRootLevel(Integer batchRootLevel) {
    
    this.batchRootLevel = batchRootLevel;
    return this;
  }

   /**
   * Batch root level
   * @return batchRootLevel
  **/
  @javax.annotation.Nullable
  public Integer getBatchRootLevel() {
    return batchRootLevel;
  }


  public void setBatchRootLevel(Integer batchRootLevel) {
    this.batchRootLevel = batchRootLevel;
  }


  public BatchItemContentContent batchPriority(Integer batchPriority) {
    
    this.batchPriority = batchPriority;
    return this;
  }

   /**
   * batch priority between 1 and 100. default 50.
   * @return batchPriority
  **/
  @javax.annotation.Nullable
  public Integer getBatchPriority() {
    return batchPriority;
  }


  public void setBatchPriority(Integer batchPriority) {
    this.batchPriority = batchPriority;
  }


  public BatchItemContentContent lastUpdate(OffsetDateTime lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * ISO 8601 date-time string of the last update.
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public BatchItemContentContent lastError(String lastError) {
    
    this.lastError = lastError;
    return this;
  }

   /**
   * Last error message.
   * @return lastError
  **/
  @javax.annotation.Nullable
  public String getLastError() {
    return lastError;
  }


  public void setLastError(String lastError) {
    this.lastError = lastError;
  }


  public BatchItemContentContent localExportFileId(String localExportFileId) {
    
    this.localExportFileId = localExportFileId;
    return this;
  }

   /**
   * Local export (download to local machine) zip file Url.
   * @return localExportFileId
  **/
  @javax.annotation.Nullable
  public String getLocalExportFileId() {
    return localExportFileId;
  }


  public void setLocalExportFileId(String localExportFileId) {
    this.localExportFileId = localExportFileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchItemContentContent batchItemContentContent = (BatchItemContentContent) o;
    return Objects.equals(this.id, batchItemContentContent.id) &&
        Objects.equals(this.batchName, batchItemContentContent.batchName) &&
        Objects.equals(this.status, batchItemContentContent.status) &&
        Objects.equals(this.serverBatchId, batchItemContentContent.serverBatchId) &&
        Objects.equals(this.captureFlow, batchItemContentContent.captureFlow) &&
        Objects.equals(this.batchRootLevel, batchItemContentContent.batchRootLevel) &&
        Objects.equals(this.batchPriority, batchItemContentContent.batchPriority) &&
        Objects.equals(this.lastUpdate, batchItemContentContent.lastUpdate) &&
        Objects.equals(this.lastError, batchItemContentContent.lastError) &&
        Objects.equals(this.localExportFileId, batchItemContentContent.localExportFileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, batchName, status, serverBatchId, captureFlow, batchRootLevel, batchPriority, lastUpdate, lastError, localExportFileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchItemContentContent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serverBatchId: ").append(toIndentedString(serverBatchId)).append("\n");
    sb.append("    captureFlow: ").append(toIndentedString(captureFlow)).append("\n");
    sb.append("    batchRootLevel: ").append(toIndentedString(batchRootLevel)).append("\n");
    sb.append("    batchPriority: ").append(toIndentedString(batchPriority)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    localExportFileId: ").append(toIndentedString(localExportFileId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("batchName");
    openapiFields.add("status");
    openapiFields.add("serverBatchId");
    openapiFields.add("captureFlow");
    openapiFields.add("batchRootLevel");
    openapiFields.add("batchPriority");
    openapiFields.add("lastUpdate");
    openapiFields.add("lastError");
    openapiFields.add("localExportFileId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BatchItemContentContent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchItemContentContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchItemContentContent is not found in the empty JSON string", BatchItemContentContent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchItemContentContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchItemContentContent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("batchName") != null && !jsonObj.get("batchName").isJsonNull()) && !jsonObj.get("batchName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("serverBatchId") != null && !jsonObj.get("serverBatchId").isJsonNull()) && !jsonObj.get("serverBatchId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverBatchId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverBatchId").toString()));
      }
      if ((jsonObj.get("captureFlow") != null && !jsonObj.get("captureFlow").isJsonNull()) && !jsonObj.get("captureFlow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `captureFlow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("captureFlow").toString()));
      }
      if ((jsonObj.get("lastError") != null && !jsonObj.get("lastError").isJsonNull()) && !jsonObj.get("lastError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastError").toString()));
      }
      if ((jsonObj.get("localExportFileId") != null && !jsonObj.get("localExportFileId").isJsonNull()) && !jsonObj.get("localExportFileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localExportFileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localExportFileId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchItemContentContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchItemContentContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchItemContentContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchItemContentContent.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchItemContentContent>() {
           @Override
           public void write(JsonWriter out, BatchItemContentContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchItemContentContent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchItemContentContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchItemContentContent
  * @throws IOException if the JSON string is invalid with respect to BatchItemContentContent
  */
  public static BatchItemContentContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchItemContentContent.class);
  }

 /**
  * Convert an instance of BatchItemContentContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

