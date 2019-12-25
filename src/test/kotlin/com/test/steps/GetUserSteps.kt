package com.test.steps

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import com.test.config.ApplicationConfig
import net.serenitybdd.rest.SerenityRest.restAssuredThat;
import org.assertj.core.api.Assertions.assertThat;
import org.hamcrest.Matchers.equalTo;
import com.test.model.UserRequest
import com.test.model.UserResponse
import org.hamcrest.Matchers.notNullValue

class GetUserSteps {

	@When("user perform post operation to create new user")
	fun createNewUser(entry: Map<String, String>) {
		val user = UserRequest(entry.get("name"), entry.get("job"))
		SerenityRest.given()
			.contentType("application/json")
			.header("Content-Type", "application/json")
			.body(user)
			.post(ApplicationConfig.BASEURL.url)
	}

	@Then("the post API should contain expected value in response")
	fun verifyPostResponse(entry: Map<String, String>) {
		restAssuredThat({ response ->
			response
				.body("name", equalTo(entry.get("name")))
				.body("job", equalTo(entry.get("job")))
		})
	}
	
	@Then("the API should return success status code {int}")
	fun verifyStatusCode(statusCode: Int) {
		restAssuredThat({ response ->
			response
				.statusCode(statusCode)
		});
	}

	@When("user fetch the details based on the user id like:{int}")
	fun getUser(userId: Int) {
		SerenityRest.get(ApplicationConfig.BASEURL.url + "/${userId}");
	}

}
