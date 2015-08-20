/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc.api.sample;

import java.util.List;
import java.nio.file.Paths;

import io.swagger.client.ApiException;

import io.swagger.client.model.*;
import io.swagger.client.api.*;

/**
 *
 * @author nirav
 */
public class Sample2 {

    public static void init() throws ApiException {

        System.out.println("Sample2: Uploading files");

        Job param = new Job();

        // API Post call to create new job as per parameters
        JobsApi jobsApi  = new JobsApi();
        Job job = jobsApi.jobsPost(OcApiSample.API_KEY, param);

        System.out.println("New created job object:");
        System.out.println(job.toString());

        // API Post call to file upload
        String filepath = Paths.get("").toAbsolutePath().toString() + "/src/main/java/oc/api/assets/logo.png";
        UploadApi uploadApi = new UploadApi();
        InputFile inputFile = uploadApi.filePost(job.getServer(), job.getToken(), job.getId(), filepath);
        System.out.println("New created InputFile object:");
        System.out.println(inputFile.toString());

        job = jobsApi.jobsJobIdGet(null, OcApiSample.API_KEY, job.getId());
        System.out.println("After file upload job object:");
        System.out.println(job.toString());

        // Create conversion object parameter
        Conversion conversionParam = new Conversion();
        conversionParam.setTarget("png");

        // API call to assign conversion object to created job
        ConversionApi conversionApi = new ConversionApi();
        Conversion conversion = conversionApi.jobsJobIdConversionsPost(conversionParam, null, OcApiSample.API_KEY, job.getId());

        System.out.println("New created Conversion object:");
        System.out.println(conversion.toString());

        job = jobsApi.jobsJobIdGet(null, OcApiSample.API_KEY, job.getId());
        System.out.println("After add conversion job object:");
        System.out.println(job.toString());

        loop: while (true) {
            switch (job.getStatus().getCode()) {
                case "queued":
                case "downloading":
                case "pending":
                case "processing":
                    job = jobsApi.jobsJobIdGet(null, OcApiSample.API_KEY, job.getId());
                    System.out.println(job.toString());
                    break;
                case "completed":
                    OutputApi outputApi = new OutputApi();
                    List<OutputFile> output = outputApi.jobsJobIdOutputGet(null, null, null, OcApiSample.API_KEY, job.getId());
                    System.out.println("File converted successfully.");
                    System.out.println("Dowonload File Path: " + output.get(0).getUri());
                    break loop;
                default:
                    System.out.println("Failed: job status " + job.getStatus().getCode());
                    break loop;
            }
        }
    }

}
