package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class OutputFile  {
  
  private String id = null;
  private Object source = null;
  private String uri = null;
  private String filename = null;
  private Integer size = null;
  private Date createdAt = null;

  
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
   * Sources for the files including the input files and conversion used.
   **/
  @ApiModelProperty(required = true, value = "Sources for the files including the input files and conversion used.")
  @JsonProperty("source")
  public Object getSource() {
    return source;
  }
  public void setSource(Object source) {
    this.source = source;
  }

  
  /**
   * Url for downloading the file.
   **/
  @ApiModelProperty(value = "Url for downloading the file.")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputFile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
