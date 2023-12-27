package org.example.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteApi {
    Response response;

    @Test
    public void postuser(){

        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .delete("https://reqres.in/api/users/2");
        //
    }
}
