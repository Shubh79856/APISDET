package com.api.genericlib;

import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;

public class BaseClass {

	public ApiConfig config = new ApiConfig();
	public RestAssuredCommonUtils rutil = new RestAssuredCommonUtils();
	/*@BeforeSuite
	public void configBS()
	{
		baseURI = "https://restcountries.eu/";
		basePath = "rest/v2/";
		
		// https://restcountries.eu/rest/v2/all
	}*/
}
