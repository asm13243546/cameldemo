package com.appressorium.reference.camel.client;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonParse {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("./ing-pprint.json")) {

            ATM atm  = gson.fromJson(reader, ATM.class);
            System.out.println(atm);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    class ATM {
    
      private String ADDRESS;
      private String CITY;
      private String GEOLOCATION;
      private Long LAT;
      private Long LNG;
      private Integer HOUSENUMBER;
      private String POSTALCODE;
      private String STREET;
      private Integer DISTANCE;
      private String TYPE;

      @Override
      public String toString() {
      
          return STREET+ " - " + POSTALCODE + " - " + CITY;
      
        }
      }

}

