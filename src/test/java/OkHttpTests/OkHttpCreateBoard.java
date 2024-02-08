package OkHttpTests;

import PojoClasses.CreatingANewBoard;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.example.OkHttpApi;
import org.example.OkHttpTasks;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class OkHttpCreateBoard extends OkHttpApi {


    @Test
    public void createBoardTest()  {
        String name = "OkHttp New Board";
        try {
            Request request = OkHttpTasks.POST(name);

            Response response = okHttpClient.newCall(request).execute();
            String body = response.body().toString();

            Assert.assertEquals(200, response.code());
        }catch (IOException exception){
            exception.printStackTrace();
        }




    }
}
