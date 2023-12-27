package org.example.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetBooking {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void getAllBooking() {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        //create a request specification
        requestSpecification = RestAssured.given();
        //calling method
        response = requestSpecification.get();
        //print response
        System.out.println(response.prettyPrint());
        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        int bookingId=response.then().extract().body().path("[0].bookingid");
        System.out.println(bookingId);
    }
}
