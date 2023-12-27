package org.example.student3;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


    @Test
    public void verifyNewStudentInfoDeletedByID() {
        given()
                .pathParam("id", 108)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }

    @Test
    public void verifyStudentInfoDeleted() {
        given()
                .pathParam("id", 108)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
}
