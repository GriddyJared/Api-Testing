package RestAssuredTests;

import io.restassured.response.Response;
import org.example.RestAssuredApi;
import org.example.RestAssuredTasks;
import org.junit.Assert;
import org.junit.Test;

public class RestDeleteBoard extends RestAssuredApi {

    @Test
    public void deleteBoard(){
        String name = "Update Board";
        Response createBoard= RestAssuredTasks.Post(name);
        String boardID =  createBoard.jsonPath().get("id").toString();
        String boardName =  createBoard.jsonPath().get("name").toString();

        Assert.assertEquals(createBoard.statusCode(),200);
        Assert.assertEquals(name,boardName);

        Response uodateBoard = RestAssuredTasks.DELETE(boardID);
        Assert.assertEquals(uodateBoard.statusCode(),200);


    }
}
