package com.api.des;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
public class BigQueryConfig {
    @Bean
    public BigQuery bigQuery() throws IOException {
        GoogleCredentials credentials = GoogleCredentials
                .fromStream(new FileInputStream("D:\\ป โท\\Project immortal\\backend\\des\\src\\main\\resources\\shortpaper-airpollution-412710-4e5277762482.json"));
        return BigQueryOptions.newBuilder().setCredentials(credentials).build().getService();
    }
}
