package RetroFitTests;

import PojoClasses.CreatingANewBoard;
import org.example.ApiConstants;
import org.example.RetrofitApi;
import org.example.RetrofitTasks;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class RetroUpdateBoard {

    @Test
    public void updateBoardTest(){
        try {
            String boardName = "RetroBoard";
            RetrofitTasks trelloApi = RetrofitApi.createService(RetrofitTasks.class);
            Call<CreatingANewBoard> newBoardCall = trelloApi.createBoard(boardName, ApiConstants.ApiKey, ApiConstants.ApiToken,"public");
            Response<CreatingANewBoard> makeBoard = newBoardCall.execute();
            Assert.assertEquals( true ,makeBoard.isSuccessful());
            String boardID = makeBoard.body().getId();

            Call<CreatingANewBoard>  updateBoardCall = trelloApi.updateBoard(boardID,"Retro new Board Name!!!",ApiConstants.ApiKey, ApiConstants.ApiToken);
            Response<CreatingANewBoard> updateBoard = updateBoardCall.execute();
            Assert.assertEquals(true,updateBoard.isSuccessful());



        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
