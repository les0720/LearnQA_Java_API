package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Ex4Hello {
    @Test
    public void testEx4Hello(){
        Response response = RestAssured
                .get( "https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
