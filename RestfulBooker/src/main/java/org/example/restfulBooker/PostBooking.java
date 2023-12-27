package org.example.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostBooking {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void getAllBooking() {
        String data = "{\n" +
                "    \"firstname\": \"ripti\",\n" +
                "    \"lastname\": \"patel\",\n" +
                "    \"totalprice\": 200,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"super bowls\"\n" +
                "}";
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        //create a request specification
        requestSpecification = RestAssured.given();
        //calling method
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(data);
        response = requestSpecification.post();
        //print response
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.body("depositpaid",equalTo("true"));
    }

}