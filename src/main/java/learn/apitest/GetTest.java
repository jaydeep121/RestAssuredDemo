package learn.apitest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetTest {
	@Test(priority=1,description="Get the List of user")
	public void GetListUser()
	{
		RestAssured.baseURI="https://reqres.in";

		String Resp=given().
				when().
				get("/api/users?page=2").
				then().
				assertThat().statusCode(200).and().
				contentType(ContentType.JSON).and().
				header("server", "cloudflare").and(). 
				header("x-powered-by","Express").and().
				body("page",equalTo(2)).and().
				body("data[0].first_name",equalTo("Michael")).and().
				extract().
				response().asString();

		System.out.println("Response is\t"+Resp);
	}
	@Test(priority=2,description="Delete the List of user")
	public void DeleteUserRequest()
	{
		RestAssured.baseURI="https://reqres.in";
		String Resp=given().
				when().
				delete("/api/users/2").
				then().assertThat(). 
				statusCode(204).and().
				header("server", "cloudflare").and(). 
				extract().
				response().asString();

		System.out.println("Del. Response is\t"+Resp);
	}
	
	
	
	
}
