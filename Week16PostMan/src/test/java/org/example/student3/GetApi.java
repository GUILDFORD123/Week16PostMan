package org.example.student3;

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
    public void GetUserBdd(){
        RestAssured.baseURI = "http://localhost:8080/student/list";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        System.out.println(response.prettyPrint());
        String statusLine = response.getStatusLine();
       //Assert.assertEquals(statusLine, "200 OK");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void PostuserBdd(){

    requestSpecification = RestAssured.given();
    response = requestSpecification.post();
        System.out.println(response.prettyPrint());

    }



    }


