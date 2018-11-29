/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.bcp;

import com.edward.models.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.InputStream;
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

        List<Series> myList = new ArrayList<>();

        myList = doAsyncAddress("CUUR0000SA0");

        return 1;
    }

    private List<Series> doAsyncAddress(String cuuR0000SA0) {

        Properties props = new Properties();
        List<Series> myList = new ArrayList<>();

        try {

            props.load(new FileInputStream("src/resources/properties/application.properties"));

            StringBuilder payload = new StringBuilder();

            payload.append("{\"seriesid\":[\"CUUR0000SA0\"],\n");
            payload.append("\"startyear\":\"2011\",\n");
            payload.append("\"endyear\":\"2014\"}\n");

            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost request = new HttpPost(props.getProperty("api.timeseries.url").trim());
            request.addHeader(HttpHeaders.AUTHORIZATION, "Basic");
            StringEntity entity = new StringEntity(payload.toString(), ContentType.APPLICATION_JSON);

            HttpResponse response = httpClient.execute(request);
            
            InputStream var = response.getEntity().getContent();

            String responseJSON = EntityUtils.toString(response.getEntity());
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            Rootobject pojo = mapper.readValue(responseJSON, Rootobject.class);

            myList = pojo.getResults().getSeries();

        }
        catch (Exception e) {

            System.out.println("error" + e.getMessage());

        }
        return myList;
    }

}
