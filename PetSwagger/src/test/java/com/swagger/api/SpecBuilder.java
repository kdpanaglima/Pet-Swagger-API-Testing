package com.swagger.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {
	
	public static RequestSpecification getRequestSpec() {
		return new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io").
				setBasePath(Route.BASE_PATH + Route.PET).
				setContentType(ContentType.JSON).
				log(LogDetail.ALL).
				build();
	}

	public static ResponseSpecification getResponseSpec() {
		return new ResponseSpecBuilder().
				log(LogDetail.ALL).
				build();
	}
}
