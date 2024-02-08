package RestAssuredTests;

import io.restassured.response.Response;
import org.example.RestAssuredApi;
import org.example.RestAssuredTasks;
import org.junit.Assert;
import org.junit.Test;

public class RestGetByID extends RestAssuredApi {

    @Test
    public void GetBoardTest (){
        String name = "Rest Get Board";
        Response getBoard = RestAssuredTasks.Post(name);
        String boardID =  getBoard.jsonPath().get("id").toString();

        Response getBoardResponse = RestAssuredTasks.GET(boardID);
        Assert.assertEquals(200,getBoardResponse.getStatusCode());

    }
}
