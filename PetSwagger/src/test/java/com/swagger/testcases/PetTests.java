package com.swagger.testcases;

import org.testng.annotations.Test;

import com.swagger.api.clientAPI.PetAPI;

import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class PetTests {
	@Test
	public void shouldBeAbleToFindPetStatus() {
		Response response = PetAPI.findPetByStatus("status", "pending");
		assertThat(response.statusCode(), equalTo(200));
	}

}
