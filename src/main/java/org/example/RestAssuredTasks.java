package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredTasks extends RestAssuredApi {

    public static Response Post(String name) {
        return given().spec(requestSpec).
                queryParam("name", name).
                queryParam("key", ApiConstants.ApiKey).
                queryParam("token", ApiConstants.ApiToken).
                contentType(ContentType.JSON).post();


    }

    public static Response GET(String id) {
        return given().spec(requestSpec).
                pathParam("ID", id).
                queryParam("ApiKEY", ApiConstants.ApiKey).
                queryParam("ApiToken", ApiConstants.ApiToken).
                contentType(ContentType.JSON).get("{id}");

    }

    public static Response PUT(String id) {
        return given().spec(requestSpec).
                pathParam("ID", id).
                queryParam("ApiKEY", ApiConstants.ApiKey).
                queryParam("ApiToken", ApiConstants.ApiToken).
                contentType(ContentType.JSON).put("{id}");

    }



    public static Response DELETE (String id) {
        return given().spec(requestSpec).
                pathParam("ID", id).
                queryParam("ApiKEY", ApiConstants.ApiKey).
                queryParam("ApiToken", ApiConstants.ApiToken).
                contentType(ContentType.JSON).delete("{id}");
    }

}