package com.swagger.api;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static com.swagger.api.SpecBuilder.*;

public class RestResource {
	
	public static Response getWithParam(String path, String key, String value) {
		return given().spec(getRequestSpec()).
				param(key, value).
				when().get(path).
				then().spec(getResponseSpec()).
				extract().
				response();
				
	}

}
