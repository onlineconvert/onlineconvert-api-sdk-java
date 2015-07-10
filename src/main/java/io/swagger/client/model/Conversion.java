package io.swagger.client.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Conversion  {
  
  private String id = null;
  private String target = null;
  private String category = null;
  private Object options = null;

  
  /**
   * Identifier for the job conversion.
   **/
  @ApiModelProperty(value = "Identifier for the job conversion.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Identifier for the job conversion type.
   **/
  @ApiModelProperty(required = true, value = "Identifier for the job conversion type.")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * Category for the conveted file.
   **/
  @ApiModelProperty(value = "Category for the conveted file.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Type of conversion to perform with the file.
   **/
  @ApiModelProperty(value = "Type of conversion to perform with the file.")
  @JsonProperty("options")
  public Object getOptions() {
    return options;
  }
  public void setOptions(Object options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversion {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
