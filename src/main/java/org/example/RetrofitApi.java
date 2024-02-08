package org.example;

import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {

    private  RetrofitApi() {throw new IllegalStateException("Utility Class");}

    static Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiConstants.BaseUri).
                                    addConverterFactory(GsonConverterFactory.create()).build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
