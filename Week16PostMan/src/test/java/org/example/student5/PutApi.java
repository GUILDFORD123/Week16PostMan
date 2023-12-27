package org.example.student5;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PutApi {
    Response response;
    RestAssured restAssured;
    RequestSpecification requestSpecification;
    @Test

    public void Putuser() {
        String data ="{\n" +
                "        \"id\": 7,\n" +
                "        \"firstName\": \"jiya\",\n" +
                "        \"lastName\": \"patel\",\n" +
                "        \"email\": \"jiyapatel02@yahoo.com\",\n" +
                "        \"programme\": \"Software Tester\",\n" +
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
                .put("http://localhost:8080/student/7");
        response.then().log().all().statusCode(200)
                .body("msg", equalTo("Student Updated"));

    }
}