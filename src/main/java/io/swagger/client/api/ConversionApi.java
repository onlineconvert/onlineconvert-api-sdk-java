package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Error;
import io.swagger.client.model.Conversion;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class ConversionApi {
  private ApiClient apiClient;

  public ConversionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get list of conversions defined for the current job.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List<Conversion>
   */
  public List<Conversion> jobsJobIdConversionsGet (String token, String key, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", apiClient.parameterToString(key));
    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Conversion>) apiClient.deserialize(response, "array", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Adds a new conversion to the given job.
   * 
   * @param body information for the conversion.
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Conversion
   */
  public Conversion jobsJobIdConversionsPost (Conversion body, String token, String key, String jobId) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsJobIdConversionsPost");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsPost");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", apiClient.parameterToString(key));
    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (Conversion) apiClient.deserialize(response, "", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get list of conversions defined for the current job.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param conversionId Identifier for the job conversion.
   * @return Conversion
   */
  public Conversion jobsJobIdConversionsConversionIdGet (String token, String key, String jobId, String conversionId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsConversionIdGet");
    }
    
    // verify the required parameter 'conversionId' is set
    if (conversionId == null) {
       throw new ApiException(400, "Missing the required parameter 'conversionId' when calling jobsJobIdConversionsConversionIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "conversionId" + "\\}", apiClient.escapeString(conversionId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", apiClient.parameterToString(key));
    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (Conversion) apiClient.deserialize(response, "", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Removes the conversion for a job.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param conversionId Identifier for the job conversion.
   * @return Conversion
   */
  public Conversion jobsJobIdConversionsConversionIdDelete (String token, String key, String jobId, String conversionId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsConversionIdDelete");
    }
    
    // verify the required parameter 'conversionId' is set
    if (conversionId == null) {
       throw new ApiException(400, "Missing the required parameter 'conversionId' when calling jobsJobIdConversionsConversionIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "conversionId" + "\\}", apiClient.escapeString(conversionId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", apiClient.parameterToString(key));
    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (Conversion) apiClient.deserialize(response, "", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
