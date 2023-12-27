package org.example.student;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID() {
        given()
                .pathParam("id", 105)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }

    @Test
    public void verifyStudentInfoDeleted() {
        given()
                .pathParam("id", 105)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }

}
