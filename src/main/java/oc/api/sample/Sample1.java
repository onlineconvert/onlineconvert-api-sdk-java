/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc.api.sample;

import java.util.List;
import java.util.ArrayList;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import io.swagger.client.api.*;

/**
 *
 * @author nirav
 */
public class Sample1 {

    public static void init() throws ApiException {

        System.out.println("Sample1: Quick start: Convert one file to another format");

        Job param = new Job();

        // Add input object to parameter.
        List<InputFile> fileList = new ArrayList<InputFile>();
        InputFile file = new InputFile();
        file.setType(InputFile.TypeEnum.remote);
        file.setSource("https://bit.ly/b2dlVA");
        fileList.add(file);
        param.setInput(fileList);

        // Add conversion object to parameter.
        List<Conversion> conversionList = new ArrayList<Conversion>();
        Conversion conversion = new Conversion();
        conversion.setTarget("png");
        conversionList.add(conversion);
        param.setConversion(conversionList);

        // API Post call to create new job as per parameters
        JobsApi jobsApi  = new JobsApi();
        Job job = jobsApi.jobsPost(OcApiSample.API_KEY, param);

        System.out.println("New created job object:");
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
                    System.out.println("Failed: job status" + job.getStatus().getCode());
                    break loop;
            }
        }
    }

}
