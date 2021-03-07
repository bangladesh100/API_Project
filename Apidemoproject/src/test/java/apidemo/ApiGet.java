package apidemo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiGet {

	Response resobj;

	@Test
	public void getWeatherDetails2() {

		
//System.out.println("find out tiger nixon and validate it.");
      
				
 resobj = given().when().get("http://dummy.restapiexample.com/api/v1/employees");

	
   

		// print out stauts code in console and check status code validation
      Assert.assertEquals(resobj.getStatusCode(), 200);
      System.out.println(resobj.getStatusCode());
		
		
		//System.out.println("Status code: "+resobj.getStatusCode());

		// display responsein console output in text mode of all result
		//System.out.println(resobj.asString());

		// body validation for tiger nixon
		String resBody = resobj.
					     then().contentType(ContentType.JSON).
					    extract().path("data[0].employee_name");//json path viewer....

		System.out.println(resBody);//.............

		Assert.assertEquals(resBody, "Tiger Nixon");
		System.out.println("Passed employee name validation");

		//assertEquals(res.Body(("data[0].employee_name"), "Tiger Nixon"));
	
	
	


	//@Test
	//public void getWeatherDetails3() {

		// check url
 //System.out.println("find out tiger nixon and validate it.");
		// resobj = 
				
				//given().when().get("http://dummy.restapiexample.com/api/v1/employees");

		// then().assertThat().statusCode(200);

		// print out stauts code in console and check status code validation
		//System.out.println(resobj.getStatusCode());
		//Assert.assertEquals(resobj.getStatusCode(), 200);

		// display response output in text mode
	//	System.out.println(resobj.asString());

		// body validation for tiger nixon
		//String resBody = resobj.
					     //then().contentType(ContentType.JSON).
					    // extract().path("data[15].employee_age");

	//	System.out.println("employee age : "+resBody);

		
		
		//String resName = resobj.
			   //  then().contentType(ContentType.JSON).
			   //  extract().path("data[15].employee_name");
		//System.out.println("Passed employee name validation");//what
	//	System.out.println("employee name : "+resName);

		//Assert.assertEquals(resName, "Michael Silva"); 


		// assertEquals(res.body(("data[0].employee_name"), "Tiger Nixon"));

		
	}
	
		
	
	}

