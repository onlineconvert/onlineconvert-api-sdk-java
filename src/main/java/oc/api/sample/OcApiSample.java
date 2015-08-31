/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc.api.sample;

import io.swagger.client.ApiException;

/**
 *
 * @author nirav
 */
public class OcApiSample {

    public static final String API_KEY = "< Your online-convert.com API Key Here >";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Sample1.init();
            Sample2.init();
            Sample3.init();
        } catch (ApiException e) {
            System.out.println(e.getMessage());
        }
    }

}
