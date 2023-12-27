package org.example.bestbuy;

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

    public void getCategort(){
        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"id\": \"abyz103\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/categories";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
        requestSpecification.body(jsonData);
//// Calling POST method
        response = requestSpecification.post();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(201);
        // Check response body - name attribute
        validatableResponse.body("name", equalTo("string"));
    }
    @Test
  public void getProduct(){
        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"price\": 0,\n" +
                "  \"shipping\": 0,\n" +
                "  \"upc\": \"string\",\n" +
                "  \"description\": \"string\",\n" +
                "  \"manufacturer\": \"string\",\n" +
                "  \"model\": \"string\",\n" +
                "  \"url\": \"string\",\n" +
                "  \"image\": \"string\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/products";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
        requestSpecification.body(jsonData);
//// Calling POST method
        response = requestSpecification.post();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(201);
        // Check response body - name attribute
        validatableResponse.body("name", equalTo("string"));

    }
    @Test
    public void getStore(){
        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"address\": \"string\",\n" +
                "  \"address2\": \"string\",\n" +
                "  \"city\": \"string\",\n" +
                "  \"state\": \"string\",\n" +
                "  \"zip\": \"string\",\n" +
                "  \"lat\": 0,\n" +
                "  \"lng\": 0,\n" +
                "  \"hours\": \"string\",\n" +
                "  \"services\": {}\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/stores";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
        requestSpecification.body(jsonData);
//// Calling POST method
        response = requestSpecification.post();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(201);
        // Check response body - name attribute
        validatableResponse.body("name", equalTo("string"));

    }
    @Test
    public void getServices(){
        String jsonData = "{\n" +
                "  \"name\": \"string\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/services";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
        requestSpecification.body(jsonData);
//// Calling POST method
        response = requestSpecification.post();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(201);
        // Check response body - name attribute
        validatableResponse.body("name", equalTo("string"));

    }

}





