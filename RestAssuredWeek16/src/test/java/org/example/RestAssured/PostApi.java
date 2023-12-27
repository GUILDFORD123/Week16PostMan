package org.example.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostApi {
    Response response;
    @Test
    public void postuser(){

        String data ="{\n" +
                "    \"name\": \"ripti\",\n" +
                "    \"job\": \"leader\",\n" +
                "    \"id\": \"540\",\n" +
                "    \"createdAt\": \"2023-12-27T16:43:48.268Z\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("https://reqres.in/api/540");
                response.then().body("name", equalTo("ripti"));
    }
    @Test
    public void postuser2(){

        String data ="{\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"ripti\",\n" +
                "            \"year\": 1989,\n" +
                "            \"color\": \"#98B2D1\",\n" +
                "            \"pantone_value\": \"15-4020\"\n" +
                "        }";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("https://reqres.in/api/user");
        response.then().body("year", equalTo(1989));
    }
    @Test
    public void postuser3(){

        String data ="{\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"krishna\",\n" +
                "            \"year\": 1989,\n" +
                "            \"color\": \"#98B2D1\",\n" +
                "            \"pantone_value\": \"15-4020\"\n" +
                "        }";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("https://reqres.in/api/user");
        response.then().body("name", equalTo("krishna"));
    }
    @Test
    public void postuser4(){

        String data ="{\n" +
                "    \"name\": \"milan\",\n" +
                "    \"job\": \"QA\"\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("https://reqres.in/api/user");
        response.then().body("name", equalTo("milan"));
        response.then().body("job", equalTo("QA"));
    }
    }

