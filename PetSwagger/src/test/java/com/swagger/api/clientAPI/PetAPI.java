package com.swagger.api.clientAPI;

import com.swagger.api.RestResource;
import com.swagger.api.Route;

import io.restassured.response.Response;

public class PetAPI {
	
	public static Response findPetByStatus(String statusKey, String statusValue) {
		return RestResource.getWithParam(Route.FIND_BY_STATUS, statusKey, statusValue);
		
	}
}
