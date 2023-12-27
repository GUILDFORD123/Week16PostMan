package org.example.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PutApi {
    Response response;

    @Test
    public void postuser() {

        String data = "{\n" +
                "    \"name\": \"ripti\",\n" +
                "    \"job\": \"leader\",\n" +
                "    \"id\": \"540\",\n" +
                "    \"createdAt\": \"2023-12-27T16:43:48.268Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .put("https://reqres.in/api/users/2");
        response.then().body("name", equalTo("ripti"));
    }

    @Test
    public void postuser2() {

        String data = "{\n" +
                "    \"name\": \"jigar\",\n" +
                "    \"job\": \"Software Tester\",\n" +
                "    \"updatedAt\": \"2023-12-27T21:19:44.100Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .put("https://reqres.in/api/users/2");
        response.then().body("job", equalTo("Software Tester"));
    }
    @Test
    public void postuser3() {

        String data = "{\n" +
                "    \"name\": \"jigar\",\n" +
                "    \"job\": \"Software Tester\",\n" +
                "    \"updatedAt\": \"2023-12-27T21:19:44.100Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .put("https://reqres.in/api/users/2");
        response.then().body("name", equalTo("jigar"));
    }
    @Test
    public void postuser4() {

        String data = "{\n" +
                "    \"name\": \"Theo\",\n" +
                "    \"job\": \"Bunny\",\n" +
                "    \"updatedAt\": \"2023-12-27T21:19:44.100Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .put("https://reqres.in/api/users/2");
        response.then().body("name", equalTo("Theo"));
        response.then().body("job", equalTo("Bunny"));
    }
    @Test
    public void postuser5() {

        String data = "{\n" +
                "    \"name\": \"Jeet\",\n" +
                "    \"job\": \"Teacher\",\n" +
                "    \"updatedAt\": \"2023-12-27T21:19:44.100Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .put("https://reqres.in/api/users/2");
        response.then().body("name", equalTo("Jeet"));
        response.then().body("job", equalTo("Teacher"));
    }
}

