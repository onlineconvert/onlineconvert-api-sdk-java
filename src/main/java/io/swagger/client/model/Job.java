package io.swagger.client.model;

import io.swagger.client.model.Status;
import java.util.Date;
import io.swagger.client.model.Conversion;
import io.swagger.client.model.InputFile;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Job  {
  
  private String id = null;
  private String token = null;
  public enum TypeEnum {
     job,  batch, 
  };
  private TypeEnum type = null;
  private Status status = null;
  private Boolean process = null;
  private List<Conversion> conversion = new ArrayList<Conversion>() ;
  private List<InputFile> input = new ArrayList<InputFile>() ;
  private String callback = null;
  private String server = null;
  private Date createdAt = null;
  private Date modifiedAt = null;

  
  /**
   * Unique identifier for the job.
   **/
  @ApiModelProperty(value = "Unique identifier for the job.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Token to identify client allowed to run the job.
   **/
  @ApiModelProperty(value = "Token to identify client allowed to run the job.")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Type of the job created.
   **/
  @ApiModelProperty(required = true, value = "Type of the job created.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Current status for the job
   **/
  @ApiModelProperty(value = "Current status for the job")
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }

  
  /**
   * Determine if the job must be processed as soon as it is ready.
   **/
  @ApiModelProperty(value = "Determine if the job must be processed as soon as it is ready.")
  @JsonProperty("process")
  public Boolean getProcess() {
    return process;
  }
  public void setProcess(Boolean process) {
    this.process = process;
  }

  
  /**
   * Type of conversion or conversions to be carried out.
   **/
  @ApiModelProperty(value = "Type of conversion or conversions to be carried out.")
  @JsonProperty("conversion")
  public List<Conversion> getConversion() {
    return conversion;
  }
  public void setConversion(List<Conversion> conversion) {
    this.conversion = conversion;
  }

  
  /**
   * Source or sources of the files to be converted.
   **/
  @ApiModelProperty(value = "Source or sources of the files to be converted.")
  @JsonProperty("input")
  public List<InputFile> getInput() {
    return input;
  }
  public void setInput(List<InputFile> input) {
    this.input = input;
  }

  
  /**
   * Callback url to the the status updates
   **/
  @ApiModelProperty(value = "Callback url to the the status updates")
  @JsonProperty("callback")
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }

  
  /**
   * Server assigned for file uploads and downloads
   **/
  @ApiModelProperty(value = "Server assigned for file uploads and downloads")
  @JsonProperty("server")
  public String getServer() {
    return server;
  }
  public void setServer(String server) {
    this.server = server;
  }

  
  /**
   * Date and time when the job was created.
   **/
  @ApiModelProperty(value = "Date and time when the job was created.")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Date and time when the job was last modified.
   **/
  @ApiModelProperty(value = "Date and time when the job was last modified.")
  @JsonProperty("modified_at")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  process: ").append(process).append("\n");
    sb.append("  conversion: ").append(conversion).append("\n");
    sb.append("  input: ").append(input).append("\n");
    sb.append("  callback: ").append(callback).append("\n");
    sb.append("  server: ").append(server).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
