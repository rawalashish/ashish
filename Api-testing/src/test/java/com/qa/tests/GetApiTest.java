package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.TestNGUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import client.Restclient;
import util.TestUtil;

public class GetApiTest extends Base{
	Base b;
	String serviceurl;
	String apiurl; 
	String url;
	Restclient restclient;
	CloseableHttpResponse closeablehttpresponse;
	
	
	@BeforeMethod
	public void setup(){
		
		b=new Base();
		serviceurl =pr.getProperty("serviceurl");
		apiurl=pr.getProperty("apiurl");
		url =serviceurl+apiurl;
		
		
		
	}

	@Test(priority=1)
	public void getapiwithoutheader() throws ClientProtocolException, IOException{
		
		restclient=new Restclient();
		
		closeablehttpresponse =restclient.get(url);
		
		//status code
		 int statuscode=closeablehttpresponse.getStatusLine().getStatusCode();
		 System.out.println("status code is---->"+statuscode);
	   	Assert.assertEquals(statuscode, 200,"status code is not 200");
		
		//json string 
		
		String responsestring=EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject responsejson=new JSONObject(responsestring);
		System.out.println("response json from api-------->"+responsejson);
		String perpagevalue=TestUtil.getValueByJpath(responsejson, "/per_page");
		System.out.println("value of per page is----->"+perpagevalue);
		Assert.assertEquals(Integer.parseInt(perpagevalue), 3);
		// total
		String totalvalue =TestUtil.getValueByJpath(responsejson,"/total");
		
		System.out.println("value of the total is ------>"+totalvalue);
		
		Assert.assertEquals(Integer.parseInt(totalvalue), 12);
		
		//get the value from json array
		
		String lastname =TestUtil.getValueByJpath(responsejson,"/data[0]/last_name");
		String id =TestUtil.getValueByJpath(responsejson,"/data[0]/id");
		String avator=TestUtil.getValueByJpath(responsejson,"/data[0]/avator");
		String firstname=TestUtil.getValueByJpath(responsejson,"/data[0]/first_name");
		System.out.println(lastname);
		System.out.println(id);
		System.out.println(avator);
		System.out.println(firstname);
		
		
	
			
			
		}
		
		
		
	}
	
	
	

