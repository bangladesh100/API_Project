package apidemo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

//import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

//import java.util.HashMap;

import org.junit.BeforeClass;




public class ApiPost {

	//public static HashMap map = new HashMap();
/*
	@BeforeClass
	public void postData() {
	map.put("FirstName", RestUtils.getFirstName());	
	map.put("LastName",RestUtils.getLastName());
	map.put("UserName", RestUtils.getUserName());
	map.put("Password", RestUtils.getPassword());
	map.put("Email", RestUtils.getEmail());
	RestAssured.baseURI= "http://restapi.demoqa.com/customer";	
	RestAssured.basePath="/register";	
		
		}
		*/
	/*
	@Test
	public void testData() {
	//given()
	//.contentType("Application/json")
	//.body(map)

	when().get("http://restapi.demoqa.com/customer")
	     .post()
	.then()
	  .statusCode(201)
	  .and()
	  .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
	  .and()
	  .body("Message", equalTo("Operation Completed successfully"));
	  
	 
	}
	*/
	@Test
	public void getWeatherDetails3()		{
		
			    Response driver=given(). 
			    		when().
			     post("http://dummy.restapiexample.com/api/v1/create");
			   //  then().
			    // statusCode(200);
			     
			int strbody =  driver.then().
					extract().path("data.id");
			
			//Assert.assertEquals(strbody, 1344);
			System.out.println("Id number: "+strbody);
			
			    //and()
				  //.body("SuccessCode", equalTo("OPERATION_SUCCESS"));
			     //body("data[0].id", equalTo("1")).
			    // body("data[0].employee_name", equalTo("Tiger Nixon"));
			   //  System.out.println(res.getStatusCode());
	
	}

			
}		



	
	
	


