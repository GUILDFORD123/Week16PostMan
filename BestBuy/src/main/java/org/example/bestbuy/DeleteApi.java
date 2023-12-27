package org.example.bestbuy;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void deleteProduct(){

        RestAssured.baseURI = "http://localhost:3030/products/9999681";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
//// Calling POST method
        response = requestSpecification.delete();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(200);
    }
    @Test
    public void deleteStores() {

        RestAssured.baseURI = "http://localhost:3030/stores/8922";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
//// Calling POST method
        response = requestSpecification.delete();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(200);

    }
    @Test
    public void deleteServices() {

        RestAssured.baseURI = "http://localhost:3030/stores/22";
        //create request specification
        requestSpecification = RestAssured.given();
        // // Setting content type to specify format in which request payload will be sent.
        requestSpecification.contentType(ContentType.JSON);
        //// Adding body as string
//// Calling POST method
        response = requestSpecification.delete();
        // // Let's print response body.
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        // Check status code
        validatableResponse.statusCode(200);

    }
   @Test
        public void deleteCategories() {

            RestAssured.baseURI = "http://localhost:3030/categories/abyz103";
            //create request specification
            requestSpecification = RestAssured.given();
            // // Setting content type to specify format in which request payload will be sent.
            requestSpecification.contentType(ContentType.JSON);
            //// Adding body as string
    //// Calling POST method
            response = requestSpecification.delete();
            // // Let's print response body.
            System.out.println(response.prettyPrint());
            validatableResponse = response.then();
            // Check status code
            validatableResponse.statusCode(200);

        }

}
