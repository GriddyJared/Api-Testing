package org.example;

import PojoClasses.CreatingANewBoard;
import retrofit2.Call;
import retrofit2.http.*;

public interface RetrofitTasks {

    static final String API_TOKEN = "token";
    static final String API_KEY = "key";
    static final String API_NAME ="name";
    static final String API_ID = "id";
    @POST(" ")
    Call<CreatingANewBoard> createBoard(@Query(API_NAME) String name,
                                        @Query(API_KEY) String key,
                                        @Query(API_TOKEN) String token,
                                        @Query("prefs_permissionLevel") String permission);

    @GET("{id}")
    Call<CreatingANewBoard> getBoard(@Path(API_ID) String id,
                                        @Query(API_KEY) String key,
                                        @Query(API_TOKEN) String token);

    @DELETE("{id}")
    Call<CreatingANewBoard> deleteBoard(@Path(API_ID) String id,
                                     @Query(API_KEY) String key,
                                     @Query(API_TOKEN) String token);

    @PUT("{id}")
    Call<CreatingANewBoard> updateBoard(@Path(API_ID) String id,
                                        @Query(API_NAME) String name,
                                        @Query(API_KEY) String key,
                                        @Query(API_TOKEN) String token);

}




