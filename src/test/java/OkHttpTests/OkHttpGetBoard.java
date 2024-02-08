package OkHttpTests;

import PojoClasses.CreatingANewBoard;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.Response;
import org.example.OkHttpApi;
import org.example.OkHttpTasks;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class OkHttpGetBoard extends OkHttpApi {

    @Test
    public void getBoardTest() {
        String name = "OkHttp New Board";

        try {
            Request request = OkHttpTasks.POST(name);

            Response response = okHttpClient.newCall(request).execute();
            String body = response.body().toString();
            ObjectMapper mapper = new ObjectMapper();
            CreatingANewBoard board = mapper.readValue(body, CreatingANewBoard.class);

            Assert.assertEquals(200, response.code());

            String boardID = board.getId();

            Request getRequest = OkHttpTasks.GET(boardID);
            Response getResponse = okHttpClient.newCall(getRequest).execute();
            Assert.assertEquals(200, getResponse.code());

            Request deleteRequest = OkHttpTasks.DELETE(boardID);
            Response deleteResponse = okHttpClient.newCall(deleteRequest).execute();

            Assert.assertEquals(200, deleteResponse.code());

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}