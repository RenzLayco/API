package www;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class API {

    @Test
    public void testing1post() {
        JSONObject m = new JSONObject();

        m.put("name", "Paps");
        m.put("job", "Driver");

        System.out.println(m.toJSONString());

        given().
                body(m.toJSONString()).
        when().
                post ("https://reqres.in/api/users%22").
        then().
            statusCode(201);
    }

    @Test
    public void testing2patch() {
        JSONObject m = new JSONObject();

        m.put("name", "Kabib");
        m.put("job", "Driver");

        System.out.println(m.toJSONString());

        given().
                body(m.toJSONString()).
        when().
                patch ("https://reqres.in/api/users/2%22").
        then().
            statusCode(200);
    }

    @Test
    public void testing3get() {

        when().
                get ("https://reqres.in/api/users/2%22").
        then().
            statusCode(200).log().all();
    }

    @Test
    public void testing4delete() {

        when().
                delete ("https://reqres.in/api/users/2%22").
        then().
            statusCode(204).log().all();
    }

}