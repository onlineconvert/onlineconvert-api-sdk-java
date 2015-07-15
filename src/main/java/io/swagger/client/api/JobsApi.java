package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Job;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.Thread;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class JobsApi {
  private ApiClient apiClient;

  public JobsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List of jobs active for the current user identified by the key.
   * It will return the list of jobs for the given user. In order to get the jobs a key or token must be provided:\n  - If the user key is provided all jobs for the current will be return.\n  - If one token is provided it will return the job assigned to that token if any.\n  \nThe request is paginated with an amount of 50 elements per page in any case.\n
   * @param status Filter the status of the job.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param page Pagination for list of elements.
   * @return List<Job>
   */
  public List<Job> jobsGet (String status, String xOcToken, String xOcApiKey, BigDecimal page) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/jobs".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (status != null)
      queryParams.put("status", apiClient.parameterToString(status));
    if (page != null)
      queryParams.put("page", apiClient.parameterToString(page));
    

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));
    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
        return (List<Job>) apiClient.deserialize(response, "array", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Creates a new Job with the user key.
   * 
   * @param xOcApiKey Api key for the user to filter.
   * @param body Content of the job.
   * @return Job
   */
  public Job jobsPost (String xOcApiKey, Job body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'xOcApiKey' is set
    if (xOcApiKey == null) {
       throw new ApiException(400, "Missing the required parameter 'xOcApiKey' when calling jobsPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsPost");
    }
    

    // create path and map variables
    String path = "/jobs".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
        return (Job) apiClient.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get information about a Job
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  public Job jobsJobIdGet (String xOcToken, String xOcApiKey, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));
    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
        return (Job) apiClient.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancels a job created that haven&#39;t been started. (Allow to cancel jobs in process.)
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  public Job jobsJobIdDelete (String xOcToken, String xOcApiKey, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));
    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
        return (Job) apiClient.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Modifies the job identified by the id, allows to start a created job.
   * 
   * @param body Content of the job.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  public Job jobsJobIdPatch (Job body, String xOcToken, String xOcApiKey, String jobId) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsJobIdPatch");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdPatch");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));
    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
      String response = apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (Job) apiClient.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get list of threads defined for the current job.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List<Thread>
   */
  public List<Thread> jobsJobIdThreadsGet (String xOcToken, String xOcApiKey, String jobId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdThreadsGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/threads".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));
    if (xOcApiKey != null)
      headerParams.put("X-Oc-Api-Key", apiClient.parameterToString(xOcApiKey));
    

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
        return (List<Thread>) apiClient.deserialize(response, "array", Thread.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
