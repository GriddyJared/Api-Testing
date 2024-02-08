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

public class OkHttpUpdateBoard extends OkHttpApi {

    @Test
    public void updateBoardTest() {
        String name = "OkHttp New Board";

        try {
            Request request = OkHttpTasks.POST(name);

            Response response = okHttpClient.newCall(request).execute();
            String body = response.body().toString();
            ObjectMapper mapper = new ObjectMapper();
            CreatingANewBoard board = mapper.readValue(body, CreatingANewBoard.class);

            Assert.assertEquals(200, response.code());

            String boardID = board.getId();
            String updatedName= " New Name!!!";

            Request updateRequest = OkHttpTasks.PUT(boardID, updatedName);
            Response updateResponse = okHttpClient.newCall(updateRequest).execute();

            Assert.assertEquals(200,updateResponse);
            Assert.assertEquals(updatedName,board.getName());

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
