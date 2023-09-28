package api;



import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class NovaPoshtaAPITest extends BaseApiTest {

    final private Map<String, Object> requestBody = new HashMap<>();
    @BeforeEach
    public void setRequestBody (){
        String APIKey = "962edf0442d241f291f35b584f92b215";
        requestBody.put("apiKey", APIKey);
        requestBody.put("modelName", "Address");
        requestBody.put("calledMethod", "getSettlements");
        requestBody.put("methodProperties", " {}");
        requestBody.put("system","DevCentre");
    }

    @Test
    public void CheckSuccess (){

given()
        .spec(requestSpecification)
        .contentType(ContentType.JSON)
        .body(requestBody)
        .when()
        .post()
        .then()
        .spec(responseSpecification)
        .statusCode(200)
        .assertThat()
        .body("success", equalTo(true))
        .body("data[0].Description", equalTo("Абазівка"))
        .body("data[0].AreaDescription", equalTo("Полтавська область"))
        .body("data", hasItems("38715","64424","39441"));
    }
}
