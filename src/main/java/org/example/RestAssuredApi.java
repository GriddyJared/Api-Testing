package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

public class RestAssuredApi {

    protected static RequestSpecification requestSpec;
    @BeforeClass
    public static void BaseUri(){
        requestSpec = new RequestSpecBuilder().setBaseUri(ApiConstants.BaseUri).build();
    }
}
