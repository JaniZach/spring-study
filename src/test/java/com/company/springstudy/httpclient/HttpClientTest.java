package com.company.springstudy.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 洙水河边
 * @date 2018/4/27 0027 22:07
 */
public class HttpClientTest {

    private CloseableHttpClient client;

    @Before
    public void init() {
        client = HttpClients.custom().build();
    }

    @Test
    public void execute() {
        String url = "http://localhost:9090/study/httpclient";
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = client.execute(httpGet);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                System.out.println(EntityUtils.toString(entity, "utf-8"));
                EntityUtils.consume(entity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @After
    public void destory() {
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
