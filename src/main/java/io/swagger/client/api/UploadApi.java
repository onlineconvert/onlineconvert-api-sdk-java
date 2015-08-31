package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.util.*;
import java.io.File;

import io.swagger.client.model.*;

public class UploadApi {
  private ApiClient apiClient;

  public UploadApi() {
    //this(Configuration.getDefaultApiClient());
      this.apiClient = new ApiClient();
  }

  public UploadApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * File upload to existing job.
   *
   * @param host Host name for file upload.
   * @param xOcToken Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched.
   * @return InputFile
   */
  public InputFile filePost (String host, String xOcToken, String jobId, String filePath) throws ApiException {

    if (host == null) {
       throw new ApiException(400, "Missing the required parameter 'host' when calling filePost");
    }

    if (xOcToken == null) {
       throw new ApiException(400, "Missing the required parameter 'xOcToken' when calling filePost");
    }

    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling filePost");
    }

    if (filePath == null) {
       throw new ApiException(400, "Missing the required parameter 'filePath' when calling filePost");
    }


    // create path and map variables
    String path = "/upload-file/{job_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    File fileToUpload = new File(filePath);
    FormDataMultiPart body = new FormDataMultiPart();
    FileDataBodyPart fileDataBodyPart=new FileDataBodyPart("file", fileToUpload, MediaType.APPLICATION_OCTET_STREAM_TYPE);
    body.bodyPart(fileDataBodyPart);

    if (xOcToken != null)
      headerParams.put("X-Oc-Token", apiClient.parameterToString(xOcToken));

    final String[] accepts = {
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
        "multipart/form-data"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    try {
      apiClient.setBasePath(host.replaceAll("https", "http"));
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams, formParams, accept, contentType, authNames);
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
