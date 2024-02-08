package RestAssuredTests;

import io.restassured.response.Response;
import org.example.RestAssuredApi;
import org.example.RestAssuredTasks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestUpdateBoard extends RestAssuredApi {

    private final Map<String, String> ids = new HashMap<>();

    Response createBoard;
    @Before
    public void startUp() {
        String name = "Update Board";
        this.createBoard = RestAssuredTasks.Post(name);
        String boardID =  createBoard.jsonPath().get("id").toString();
        String boardName =  createBoard.jsonPath().get("name").toString();

        Assert.assertEquals(createBoard.statusCode(),200);
        Assert.assertEquals(name,boardName);

        ids.put(boardID,name);
    }
    @Test
    public void updateBoard (){

//        String name = "Update Board";
//        Response createBoard= RestAssuredTasks.Post(name);
//        String boardID =  createBoard.jsonPath().get("id").toString();
//        String boardName =  createBoard.jsonPath().get("name").toString();
//
//        Assert.assertEquals(createBoard.statusCode(),200);
//        Assert.assertEquals(name,boardName);
        String boardID = ids.keySet().stream().findAny().get();
        String name = ids.get(boardID);

        String updateName = " Updated Board Test";
        Response uodateBoard = RestAssuredTasks.PUT(boardID,updateName);
        String updatedName =  createBoard.jsonPath().get("name").toString();

        Assert.assertEquals(uodateBoard.statusCode(),200);
        Assert.assertEquals(name,updatedName);






    }
}
