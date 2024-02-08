package org.example;

import okhttp3.OkHttpClient;
import org.junit.BeforeClass;

public class OkHttpApi {

    protected static OkHttpClient okHttpClient;

    @BeforeClass
    public static void setUp() {

        okHttpClient = new OkHttpClient();
    }
}
