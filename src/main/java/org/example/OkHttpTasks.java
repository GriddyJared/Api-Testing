package org.example;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.Objects;

public class OkHttpTasks {

    static RequestBody body = RequestBody.create(null, new byte[0]);

    public static Request POST(String name){
        HttpUrl.Builder builder = Objects.requireNonNull(
                HttpUrl.parse(String.format("%s?name=%s&key=%s&token=%s",
                        ApiConstants.BaseUri, name,ApiConstants.ApiKey,
                        ApiConstants.ApiToken))).newBuilder();

        return new Request.Builder()
                .url(builder.build().toString())
                .post(body)
                .build();

    }

    public static Request GET(String id){
        HttpUrl.Builder builder = Objects.requireNonNull(
                HttpUrl.parse(String.format("%s%s?key=%s&token=%s",
                        ApiConstants.BaseUri, id,ApiConstants.ApiKey,
                        ApiConstants.ApiToken))).newBuilder();

        return new Request.Builder()
                .url(builder.build().toString())
                .get()
                .build();

    }

    public static Request PUT(String id, String name){
        HttpUrl.Builder builder = Objects.requireNonNull(
                HttpUrl.parse(String.format("%s%s?name=%s&key=%s&token=%s",
                        ApiConstants.BaseUri, id, name,ApiConstants.ApiKey,
                        ApiConstants.ApiToken))).newBuilder();

        return new Request.Builder()
                .url(builder.build().toString())
                .put(body)
                .build();

    }

    public static Request DELETE(String id){
        HttpUrl.Builder builder = Objects.requireNonNull(
                HttpUrl.parse(String.format("%s%s?key=%s&token=%s",
                        ApiConstants.BaseUri, id,ApiConstants.ApiKey,
                        ApiConstants.ApiToken))).newBuilder();

        return new Request.Builder()
                .url(builder.build().toString())
                .delete()
                .build();

    }



}
