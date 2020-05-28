package com.read.write.api;

import java.awt.PageAttributes.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.ws.rs.core.UriBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;



public class GetPostApiRequest {

	
	public static String getAPIResponseforQueryParams(String tag,String sortBy,String direction) throws UnsupportedOperationException, IOException
	{
		String URL  = "https://hatchways.io/api/assessment/blog/posts?tag="+tag+"&SortBy="+sortBy+"&direction="+direction;
		System.out.println("*****TEST CASE STARTED:Tag  "+tag+"  "+"Sort by  "+sortBy+"  Direction"+direction);
		HttpClient client =new DefaultHttpClient();;
		HttpGet request = new HttpGet(URL);
		HttpResponse response = client.execute(request);
		String statusCode = Integer.toString(response.getStatusLine().getStatusCode());
		System.out.println("  STATUS CODE  "+statusCode);
		
		if(statusCode.equals("200"))
		{
			BufferedReader readLine = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
			StringBuffer stringBuffer = new StringBuffer(); 
			String line = "";
			  while ((line = readLine.readLine()) != null) {
			    System.out.println(line);
			    stringBuffer.append(line);
			    stringBuffer.append(System.lineSeparator());
			  }
			  System.out.println("Tag  "+tag+"  "+"Sort by  "+sortBy+"  Direction  "+direction+"****Ended");
			 return stringBuffer.toString();
		}
		else
		{
			System.out.println("***SOME THING WENT WRONG***STATUS CODE"+statusCode);
		}
		
		return statusCode=null;
		}
}
