package org.example.RestAssured;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetApi {
    Response response;
    @Test
    public void verifyUser() {

        String baseUrl = "https://reqres.in/api";
        String endPoint = "/users";
        given().log().all()
                .baseUri(baseUrl)
                .queryParam("page", "2")
                .when()
                .get(endPoint)
                .then().log().all()

                //To verify the response body
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("total_pages", equalTo(2))
                .body("data[3].first_name", equalTo("Byron"));

    }
    @Test
    public void verifyUser2() {

        String baseUrl = "https://reqres.in/api";
        String endPoint = "/users";
        given().log().all()
                .baseUri(baseUrl)
                .queryParam("page", "2")
                .when()
                .get(endPoint)
                .then().log().all()
                //To verify the response body
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("total_pages", equalTo(2))
                .body("data[2].last_name", equalTo("Funke"));

    }
    @Test
    public void verifyUser3() {

        String baseUrl = "https://reqres.in/api";
        String endPoint = "/users";
        given().log().all()
                .baseUri(baseUrl)
                .queryParam("page", "2")
                .when()
                .get(endPoint)
                .then().log().all()
                //To verify the response body
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("total_pages", equalTo(2))
                .body("data[2].email", equalTo("tobias.funke@reqres.in"));

    }
    @Test
    public void verifyUser4() {

        String baseUrl = "https://reqres.in/api";
        String endPoint = "/users";
        given().log().all()
                .baseUri(baseUrl)
                .queryParam("page", "2")
                .when()
                .get(endPoint)
                .then().log().all()
                //To verify the response body
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("total_pages", equalTo(2))
                .body("data[4].first_name", equalTo("George"));

    }
    @Test
    public void verifyUser5() {

        String baseUrl = "https://reqres.in/api";
        String endPoint = "/users";
        given().log().all()
                .baseUri(baseUrl)
                .queryParam("page", "2")
                .when()
                .get(endPoint)
                .then().log().all()
                //To verify the response body
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("total_pages", equalTo(2))
                .body("data[4].last_name", equalTo("Edwards"));

    }
}
