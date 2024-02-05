package RestAssuredTests;

import io.restassured.response.Response;
import org.example.RestAssuredApi;
import org.example.RestAssuredTasks;
import org.junit.Test;
import org.testng.Assert;

public class RestCreateBoard extends RestAssuredApi {

    @Test
    public void  CreateBoardTest () {
        String name = " Create Board Test!!!";
        Response createBoard = RestAssuredTasks.Post(name);
        String boardName = createBoard.jsonPath().get("name").toString();

        Assert.assertEquals(createBoard.getStatusCode(),200);
        Assert.assertEquals(name,boardName);

    }
}
