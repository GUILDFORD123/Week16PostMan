package org.example.student3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PatchApi {
    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    @Test
    public void UpdatedUser() {
        // Given
        String data ="{\n" +
                "        \"id\": 3,\n" +
                "        \"firstName\": \"krishna\",\n" +
                "        \"lastName\": \"patel\",\n" +
                "        \"email\": \"krishnapate@yahoo.com\",\n" +
                "        \"programme\": \"Computer Science\",\n" +
                "        \"courses\": [\n" +
                "            \"Calculus\",\n" +
                "            \"Algorithms\",\n" +
                "            \"Software Development\",\n" +
                "            \"Ethics\"\n" +
                "        ]\n" +
                "    }";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .patch("http://localhost:8080/student/3");
        response.then().log().all().statusCode(200)
                .body("msg", equalTo("Updated"));
    }

}



