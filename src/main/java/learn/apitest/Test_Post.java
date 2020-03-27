package learn.apitest;

import static io.restassured.RestAssured.*;    
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Post {
	
	@Test(enabled=false)
	public void postTest() {
//		Map<String, Object> map=new HashMap<String, Object>();
//	//	map.put("\"name\"", "jaydeep");
//		map.put("name", "jaydeep");
//		map.put("work", "QA");
//		System.out.println(map);
//		JSONObject req=new JSONObject(map);
		JSONObject req=new JSONObject();
		req.put("name", "jaydeep");
		req.put("work", "QA");
		System.out.println(req);
		System.out.println(req.toJSONString());
		given().
		header("Content-Type","application/jspn")
		.contentType(ContentType.JSON).
		accept(ContentType.JSON)
		.body(req.toJSONString())
		.when().post("https://reqres.in/api/users").
		then().statusCode(201);
	} 
	@Test
	public void putTest() {
//		Map<String, Object> map=new HashMap<String, Object>();
//	//	map.put("\"name\"", "jaydeep");
//		map.put("name", "jaydeep");
//		map.put("work", "QA");
//		System.out.println(map);
//		JSONObject req=new JSONObject(map);
		JSONObject req=new JSONObject();
		req.put("name", "jaydeep");
		req.put("work", "QA");
		System.out.println(req);
		System.out.println(req.toJSONString());
		given().
		header("Content-Type","application/jspn")
		.contentType(ContentType.JSON).
		accept(ContentType.JSON)
		.body(req.toJSONString())
		.when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	} 
	@Test(enabled=false)
	public void patchTest() {
//		Map<String, Object> map=new HashMap<String, Object>();
//	//	map.put("\"name\"", "jaydeep");
//		map.put("name", "jaydeep");
//		map.put("work", "QA");
//		System.out.println(map);
//		JSONObject req=new JSONObject(map);
		JSONObject req=new JSONObject();
		req.put("name", "jaydeep");
		req.put("work", "QA");
		System.out.println(req);
		System.out.println(req.toJSONString());
		given().
		header("Content-Type","application/jspn")
		.contentType(ContentType.JSON).
		accept(ContentType.JSON)
		.body(req.toJSONString())
		.when().patch("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	} 
	@Test
	public void deleteTest() {

		
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	} 

}
