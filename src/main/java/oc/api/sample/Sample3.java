/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc.api.sample;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.client.ApiException;

import io.swagger.client.model.*;
import io.swagger.client.api.*;

/**
 *
 * @author nirav
 */
public class Sample3 {

    public static void init() throws ApiException {

        InformationApi informationApi  = new InformationApi();

        System.out.println("Sample3: Conversions get information");

        List<Conversion> conversions = informationApi.conversionsGet(null, null, BigDecimal.ONE);
        for (Conversion conversion : conversions) {
            System.out.println(conversion.toString());
        }

        System.out.println("Sample3: Statuses get information");

        List<Status> statuses = informationApi.statusesGet();
        for (Status status : statuses) {
            System.out.println(status.toString());
        }
    }

}
