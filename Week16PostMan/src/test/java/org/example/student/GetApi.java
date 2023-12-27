package org.example.student;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void studentApp() {

        given()
                .when()
                .get("http://localhost:8080/student/list")
                .then()
                .statusCode(200)
               .body("[3].programme", equalTo("Computer Science"));

    }
}


