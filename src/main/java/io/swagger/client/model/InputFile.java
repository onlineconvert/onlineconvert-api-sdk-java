package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class InputFile  {
  
  private String id = null;
  public enum TypeEnum {
     upload,  remote,  output, 
  };
  private TypeEnum type = null;
  private String source = null;
  private String filename = null;
  private Integer size = null;
  private Date createdAt = null;
  private Date modifiedAt = null;

  
  /**
   * Unique identifier for the file.
   **/
  @ApiModelProperty(value = "Unique identifier for the file.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * How the file has been generated.
   **/
  @ApiModelProperty(value = "How the file has been generated.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The source of the file to be used that can be either, an external url. An identifier for an uploaded file to the server or an identifier for another job.
   **/
  @ApiModelProperty(required = true, value = "The source of the file to be used that can be either, an external url. An identifier for an uploaded file to the server or an identifier for another job.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Filename of the file.
   **/
  @ApiModelProperty(value = "Filename of the file.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   * Size of the file in bytes.
   **/
  @ApiModelProperty(value = "Size of the file in bytes.")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
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
    sb.append("class InputFile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
