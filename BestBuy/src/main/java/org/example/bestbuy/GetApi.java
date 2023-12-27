package org.example.bestbuy;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetApi {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test

    public void getProduct(){
        RestAssured.baseURI = "http://localhost:3030/products/48530";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
    @Test
    public void storeProduct(){
        RestAssured.baseURI = "http://localhost:3030/stores/7";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
public void serviceProduct(){
        RestAssured.baseURI = "http://localhost:3030/services/7";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void categoriesProduct(){
        RestAssured.baseURI = "http://localhost:3030/categories/abcat0020004";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void getUtilitys(){
        RestAssured.baseURI = "http://localhost:3030/version/";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    }



