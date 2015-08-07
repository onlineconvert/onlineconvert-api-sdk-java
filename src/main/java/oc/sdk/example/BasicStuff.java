/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc.sdk.example;

import io.swagger.client.ApiException;
import io.swagger.client.api.InformationApi;
import io.swagger.client.model.Conversion;
import io.swagger.client.model.Status;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Andres Cevallos
 */
public class BasicStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ApiException {

        InformationApi informationApi = new InformationApi();

        /**
         * Gets the available archive conversions from API
         *
         * GET
         * http://api2.online-convert.com/conversions?category=archive&page=1
         * HTTP/1.1
         */
        BigDecimal page = new BigDecimal(1);
        String category = "archive";
        String target = "";

        List<Conversion> conversions = informationApi.conversionsGet(category, target, page);

        /**
         * Gets the available status codes from API
         *
         * GET http://api2.online-convert.com/status HTTP/1.1
         */
        List<Status> statuses = informationApi.statusesGet();

        System.out.println("**************Conversions list************************");
        for (Conversion conversion : conversions) {
            System.out.println(conversion.toString());
        }
        System.out.println("******************************************************");

        System.out.println("***************Status list****************************");
        for (Status status : statuses) {
            System.out.println(status.toString());
        }
        System.out.println("******************************************************");
    }
}
