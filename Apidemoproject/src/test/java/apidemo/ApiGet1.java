package apidemo;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiGet1 {

	Response apiTestObj;

	@Test
	public void getWeatherDetails1() {
		
	
		// check url
 System.out.println("find out tiger nixon and validate it.");
 apiTestObj = //This like box (where code)
				
				given().
				when().get("http://dummy.restapiexample.com/api/v1/employees");
	
		 System.out.println(apiTestObj.getStatusCode());//value=301
			Assert.assertEquals(apiTestObj.getStatusCode(), 200);
             
			System.out.println(apiTestObj.asString());
                //Tiger Nixon
			String resBody = apiTestObj.
				  then   ().contentType(ContentType.JSON).
				     extract().path("data[0].employee_name");//Tiger Nixon
			
			System.out.println(resBody); //what
                    //actual Tiger Noxon
			Assert.assertEquals(resBody , "Tiger Nixon");
			System.out.println("Passed employee name validation"); 
			
		
		  String habib = apiTestObj.
				  then().contentType(ContentType.JSON).
		  extract().path("data[0].employee_salary");
		  
		  System.out.println(habib); //what
		  
		  Assert.assertEquals(habib, "320800");
		  System.out.println("Passed employee name validation");
		 
	}
			
			@Test
			public void getWeatherDetails2() {
				
			String resbody  = apiTestObj.
					then().contentType(ContentType.JSON).
			      extract().path("data[0].employee_age");
			      
			     System.out.println("employee_age :"+ resbody);
		     Assert.assertEquals(resbody, "61"); 
			}
			
			@Test
			public void getWeatherDetails3() {
				
			String resbody1  = apiTestObj.
					then().contentType(ContentType.JSON).
			      extract().path("data[1].employee_name");
			      
			     System.out.println("Employee Nname is :"+ resbody1);
		     Assert.assertEquals(resbody1, "Garrett Winters"); 
			}
			
			@Test
			public void getWeatherDetails4() {
				
			String resbody2  = apiTestObj.
					then().contentType(ContentType.JSON).
			      extract().path("data[1].employee_salary");
			      
			     System.out.println("Employee Nname is :"+ resbody2);
		     Assert.assertEquals(resbody2, "170750"); 
			}
			
			@Test
			public void getWeatherDetails5() {
				
			String  actual = apiTestObj.
					then().contentType(ContentType.JSON).
			      extract().path("data[10].employee_name");
			      
			     System.out.println("employee name :"+ actual);
			     
		     Assert.assertEquals(actual, "Jena Gaines"); 
			}
	

}
