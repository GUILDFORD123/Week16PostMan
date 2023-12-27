package org.example.student;

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
        String data = "{\n" +
                "    \"firstName\": \"ripti\",\n" +
                "    \"lastName\": \"patel\",\n" +
                "    \"email\": \"ripti11@gmail.com\",\n" +
                "    \"programme\": \"Financial Analysis\",\n" +
                "    \"courses\": [\n" +
                "        \"Accounting\",\n" +
                "        \"Statistics\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .patch("http://localhost:8080/student");
        response.then().log().all().statusCode(500)
                .body("msg", equalTo("Updated"));
    }

}

