package api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {


    public static void main(String[] args)
    {

        RestAssured.baseURI = "https://api.exchangeratesapi.io";

        RequestSpecification httpReq = RestAssured.given();
        Response response = httpReq.request(Method.GET, "/api");

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is => " +responseBody);

        System.out.println("Exiting main......");


    }
}
