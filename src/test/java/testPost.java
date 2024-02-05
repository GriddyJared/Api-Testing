import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class testPost {

    public String getToken;
    @Test
    public void AuthToken(){

        String payload= "{\n" +
                "    \"id\": \"65b91c18c26db0b486b935b8\",\n" +
                "    \"name\": \"ApiTesting\",\n" +
                "    \"desc\": \"\",\n" +
                "    \"descData\": null,\n" +
                "    \"closed\": false,\n" +
                "    \"idOrganization\": \"65b7dba80a67bef7bbe8d748\",\n" +
                "    \"idEnterprise\": null,\n" +
                "    \"pinned\": false,\n" +
                "    \"url\": \"https://trello.com/b/Cfp87i2L/apitesting\",\n" +
                "    \"shortUrl\": \"https://trello.com/b/Cfp87i2L\",\n" +
                "    \"prefs\": {\n" +
                "        \"permissionLevel\": \"private\",\n" +
                "        \"hideVotes\": false,\n" +
                "        \"voting\": \"disabled\",\n" +
                "        \"comments\": \"members\",\n" +
                "        \"invitations\": \"members\",\n" +
                "        \"selfJoin\": true,\n" +
                "        \"cardCovers\": true,\n" +
                "        \"cardCounts\": false,\n" +
                "        \"isTemplate\": false,\n" +
                "        \"cardAging\": \"regular\",\n" +
                "        \"calendarFeedEnabled\": false,\n" +
                "        \"hiddenPluginBoardButtons\": [],\n" +
                "        \"switcherViews\": [\n" +
                "            {\n" +
                "                \"viewType\": \"Board\",\n" +
                "                \"enabled\": true\n" +
                "            },\n" +
                "            {\n" +
                "                \"viewType\": \"Table\",\n" +
                "                \"enabled\": true\n" +
                "            },\n" +
                "            {\n" +
                "                \"viewType\": \"Calendar\",\n" +
                "                \"enabled\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"viewType\": \"Dashboard\",\n" +
                "                \"enabled\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"viewType\": \"Timeline\",\n" +
                "                \"enabled\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"viewType\": \"Map\",\n" +
                "                \"enabled\": false\n" +
                "            }\n" +
                "        ],\n" +
                "        \"background\": \"blue\",\n" +
                "        \"backgroundColor\": \"#0079BF\",\n" +
                "        \"backgroundImage\": null,\n" +
                "        \"backgroundTile\": false,\n" +
                "        \"backgroundBrightness\": \"dark\",\n" +
                "        \"backgroundImageScaled\": null,\n" +
                "        \"backgroundBottomColor\": \"#0079BF\",\n" +
                "        \"backgroundTopColor\": \"#0079BF\",\n" +
                "        \"canBePublic\": true,\n" +
                "        \"canBeEnterprise\": true,\n" +
                "        \"canBeOrg\": true,\n" +
                "        \"canBePrivate\": true,\n" +
                "        \"canInvite\": true\n" +
                "    },\n" +
                "    \"labelNames\": {\n" +
                "        \"green\": \"\",\n" +
                "        \"yellow\": \"\",\n" +
                "        \"orange\": \"\",\n" +
                "        \"red\": \"\",\n" +
                "        \"purple\": \"\",\n" +
                "        \"blue\": \"\",\n" +
                "        \"sky\": \"\",\n" +
                "        \"lime\": \"\",\n" +
                "        \"pink\": \"\",\n" +
                "        \"black\": \"\",\n" +
                "        \"green_dark\": \"\",\n" +
                "        \"yellow_dark\": \"\",\n" +
                "        \"orange_dark\": \"\",\n" +
                "        \"red_dark\": \"\",\n" +
                "        \"purple_dark\": \"\",\n" +
                "        \"blue_dark\": \"\",\n" +
                "        \"sky_dark\": \"\",\n" +
                "        \"lime_dark\": \"\",\n" +
                "        \"pink_dark\": \"\",\n" +
                "        \"black_dark\": \"\",\n" +
                "        \"green_light\": \"\",\n" +
                "        \"yellow_light\": \"\",\n" +
                "        \"orange_light\": \"\",\n" +
                "        \"red_light\": \"\",\n" +
                "        \"purple_light\": \"\",\n" +
                "        \"blue_light\": \"\",\n" +
                "        \"sky_light\": \"\",\n" +
                "        \"lime_light\": \"\",\n" +
                "        \"pink_light\": \"\",\n" +
                "        \"black_light\": \"\"\n" +
                "    },\n" +
                "    \"limits\": {}\n" +
                "}";
        Response response = given().
                    baseUri("u").
                    contentType("application/json").
                    body(payload).
                when().
                    post().
                then().
                    log().all().
                    extract().response();

        getToken = response.jsonPath().getString("token");
        System.out.println(STR."Token \{getToken}");

    }



}

