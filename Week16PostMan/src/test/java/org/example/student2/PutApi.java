package org.example.student2;

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
        String data = "{\n" +
                "        \"id\": 3,\n" +
                "        \"firstName\": \"milan\",\n" +
                "        \"lastName\": \"patel\",\n" +
                "        \"email\": \"milanpatel@yahoo.com\",\n" +
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
                .put("http://localhost:8080/student/2");
        response.then().log().all().statusCode(200)
                .body("msg", equalTo("Student Updated"));

    }
}