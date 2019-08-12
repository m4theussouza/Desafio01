package test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class testAPI {
	
	@Test
	public void getListUser() {
		String url = "https://reqres.in";
		String request = "/api/users?page=2";
		given()
			.param(request)
		.when()
			.get(url)
		.then()
			.statusCode(200);
	}
	
	@Test
	public void getSingleUser() {
		String url = "https://reqres.in";
		String request = "/api/users/2";
		given()
			.param(request)
		.when()
			.get(url)
		.then()
			.statusCode(200);
	}
}
