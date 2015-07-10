package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.InputFile;
import io.swagger.client.model.Error;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class InputApi {
  private ApiClient apiClient;

  public InputApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InputApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get list of binary source files for the conversion.hhh
   * Description of the get for the inputs of a specific job.
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List<InputFile>
   */
  public List<InputFile> jobsJobIdInputGet (String token, String key, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    if (key != null)
      headerParams.put("key", apiClient.parameterToString(key));
    

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
        return (List<InputFile>) apiClient.deserialize(response, "array", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cretes a new input for the current job.
   * 
   * @param body 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return InputFile
   */
  public InputFile jobsJobIdInputPost (InputFile body, String token, String key, String jobId) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputPost");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    if (key != null)
      headerParams.put("key", apiClient.parameterToString(key));
    

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
        return (InputFile) apiClient.deserialize(response, "", InputFile.class);
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
   * @param fileId Id of the file to download
   * @return InputFile
   */
  public InputFile jobsJobIdInputFileIdGet (String token, String key, String jobId, String fileId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputFileIdGet");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdInputFileIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    if (key != null)
      headerParams.put("key", apiClient.parameterToString(key));
    

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
        return (InputFile) apiClient.deserialize(response, "", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Removes the input for a job.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return InputFile
   */
  public InputFile jobsJobIdInputFileIdDelete (String token, String key, String jobId, String fileId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputFileIdDelete");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdInputFileIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (token != null)
      headerParams.put("token", apiClient.parameterToString(token));
    if (key != null)
      headerParams.put("key", apiClient.parameterToString(key));
    

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
        return (InputFile) apiClient.deserialize(response, "", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
