/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.bcp;

import com.edward.models.Datum;
import com.edward.models.Rootobject;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author ext_ealinares
 */
public class controller {

    private String _url;

    public controller() {
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String _url) {
        this._url = _url;
    }

    public int main() {

        List<Datum> myList = new ArrayList<>();

        myList = doAsyncAddress("CUUR0000SA0");

        return 1;
    }

    private List<Datum> doAsyncAddress(String cuuR0000SA0) {

        Properties props = new Properties();
        List<Datum> myList = new ArrayList<>();

        try {

            props.load(new FileInputStream("src/resources/properties/application.properties"));
          
            String payload
                    = "{\"seriesid\":[\"CUUR0000SA0\"],\n"
                    + "\"startyear\":\"2011\",\n"
                    + "\"endyear\":\"2014\"}\n";

            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost request = new HttpPost(props.getProperty("api.timeseries.url").trim());
            request.addHeader(HttpHeaders.AUTHORIZATION, "Basic");
            StringEntity entity = new StringEntity(payload, ContentType.APPLICATION_JSON);

            request.setEntity(entity);

            HttpResponse response = httpClient.execute(request);

            String responseJSON = EntityUtils.toString(response.getEntity());
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            Rootobject pojo = mapper.readValue(responseJSON, Rootobject.class);

            int x = 0; x = x + 1;
            

        }
        catch (Exception e) {

            System.out.println("error" + e.getMessage());

        }
        return myList;
    }

}
