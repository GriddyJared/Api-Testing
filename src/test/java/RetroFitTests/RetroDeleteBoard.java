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

public class RetroDeleteBoard {
    @Test
    public void deleteBoardTest(){
        try {
            String boardName = "RetroBoard";
            RetrofitTasks trelloApi = RetrofitApi.createService(RetrofitTasks.class);
            Call<CreatingANewBoard> newBoardCall = trelloApi.createBoard(boardName, ApiConstants.ApiKey, ApiConstants.ApiToken,"public");
            Response<CreatingANewBoard> makeBoard = newBoardCall.execute();
            Assert.assertEquals( true ,makeBoard.isSuccessful());
            String boardID = makeBoard.body().getId();

            Call<CreatingANewBoard> deleteBoardCall = trelloApi.deleteBoard(boardID,ApiConstants.ApiKey,ApiConstants.ApiToken);
            Response<CreatingANewBoard> deleteBoard = deleteBoardCall.execute();
            Assert.assertEquals(true,deleteBoard.isSuccessful());

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
