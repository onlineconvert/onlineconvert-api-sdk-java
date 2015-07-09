package io.swagger.client.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Status  {
  
  private String code = null;
  private String info = null;

  
  /**
   * Status code identifier.
   **/
  @ApiModelProperty(required = true, value = "Status code identifier.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Description of the status code.
   **/
  @ApiModelProperty(required = true, value = "Description of the status code.")
  @JsonProperty("info")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
