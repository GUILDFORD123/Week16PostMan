package org.example.bestbuy;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PatchApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void patchCategories() {
        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"id\": \"string\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/categories/abyz103";
        requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonData);
        response = requestSpecification.patch();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.body("name", equalTo("string"));
    }

    //9999681 id(product)
    @Test
    public void patchProduct() {
        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"id\": \"string\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/products/9999681";
        requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonData);
        response = requestSpecification.patch();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.body("name", equalTo("string"));
    }
    @Test
    public void patchStores() {
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
        RestAssured.baseURI = "http://localhost:3030/stores/8922";
        requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonData);
        response = requestSpecification.patch();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.body("name", equalTo("string"));
    }
    @Test
    public void patchServices() {
        String jsonData = "{\n" +
                "  \"name\": \"string\"\n" +
                "}";
        RestAssured.baseURI = "http://localhost:3030/services/22";
        requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonData);
        response = requestSpecification.patch();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.body("name", equalTo("string"));
    }
}
