import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredPracticeExample {

		@Test
		public void test1() {
			Response response = RestAssured.get("https://reqres.in/api/users?page=2");
			
			System.out.println(response.statusCode());
			System.out.println(response.body().asString());
			System.out.println(response.getStatusLine());
			System.out.println(response.getHeader("content-type"));
			
		}
	
}
