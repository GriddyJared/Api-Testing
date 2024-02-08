package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredTasks extends RestAssuredApi {


    static final String API_TOKEN = "token";
    static final String API_KEY = "key";
    static final String API_NAME ="name";
    static final String API_ID = "id";

    public static Response Post(String name) {


        return given().spec(requestSpec).
                queryParam("prefs_permissionLevel","public").
                queryParam(API_NAME, name).
                queryParam(API_KEY, ApiConstants.ApiKey).
                queryParam(API_TOKEN, ApiConstants.ApiToken).
                contentType(ContentType.JSON).post();


    }

    public static Response GET(String id) {
        return given().spec(requestSpec).
                pathParam(API_ID, id).
                queryParam(API_KEY, ApiConstants.ApiKey).
                queryParam(API_TOKEN, ApiConstants.ApiToken).
                contentType(ContentType.JSON).get("{id}");

    }

    public static Response PUT(String id,String name) {
        return given().spec(requestSpec).
                pathParam(API_ID, id).
                queryParam(API_NAME, name).
                queryParam(API_KEY, ApiConstants.ApiKey).
                queryParam(API_TOKEN, ApiConstants.ApiToken).
                contentType(ContentType.JSON).put("{id}");

    }



    public static Response DELETE (String id) {
        return given().spec(requestSpec).
                pathParam(API_ID, id).
                queryParam(API_KEY, ApiConstants.ApiKey).
                queryParam(API_TOKEN, ApiConstants.ApiToken).
                contentType(ContentType.JSON).delete("{id}");
    }

}