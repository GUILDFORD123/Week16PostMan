package org.example.student3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test

    public void Postuserid(){
        String data = "{\n" +
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
                .post("http://localhost:8080/student");
        response.then().body("msg", equalTo("Student added"));


    }
}

