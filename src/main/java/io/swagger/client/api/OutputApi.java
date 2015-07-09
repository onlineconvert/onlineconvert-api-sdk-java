package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.OutputFile;
import io.swagger.client.model.Error;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OutputApi {
  private ApiClient apiClient;

  public OutputApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutputApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get list of converted.
   * 
   * @param conversionId 
   * @param inputId 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List<OutputFile>
   */
  public List<OutputFile> jobsJobIdOutputGet (String conversionId, String inputId, String token, String key, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (conversionId != null)
      queryParams.put("conversion_id", apiClient.parameterToString(conversionId));
    if (inputId != null)
      queryParams.put("input_id", apiClient.parameterToString(inputId));
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
        return (List<OutputFile>) apiClient.deserialize(response, "array", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get information about an output file source.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return List<OutputFile>
   */
  public List<OutputFile> jobsJobIdOutputFileIdGet (String token, String key, String jobId, String fileId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputFileIdGet");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdOutputFileIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
        return (List<OutputFile>) apiClient.deserialize(response, "array", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Deletes a file from the output.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return List<OutputFile>
   */
  public List<OutputFile> jobsJobIdOutputFileIdDelete (String token, String key, String jobId, String fileId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputFileIdDelete");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdOutputFileIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
        return (List<OutputFile>) apiClient.deserialize(response, "array", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
