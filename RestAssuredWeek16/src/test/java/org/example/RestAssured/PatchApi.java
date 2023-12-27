package org.example.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PatchApi {
    Response response;
    @Test
    public void postuser(){

        String data ="{\n" +
                "    \"name\": \"ripti\",\n" +
                "    \"job\": \"leader\",\n" +
                "    \"id\": \"540\",\n" +
                "    \"createdAt\": \"2023-12-27T16:43:48.268Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .patch("https://reqres.in/api/users/2");
        response.then().body("name", equalTo("ripti"));
    }
}
