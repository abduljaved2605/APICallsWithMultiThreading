package com.read.write.api;

import java.util.concurrent.Callable;

public class TestCallable extends GetPostApiRequest implements Callable<String> {
	String tag;
	String sortBy="id";
	String direction="asc";
	public TestCallable(String tag) {
	this.tag = tag;	
	}
	
	
	/*
	 * Method call will execute the api for various tags ,sort by and direction parameters
	 */
	
	@Override
	public String call() throws Exception {
		
		return "fetching resuts for tag "+tag+" "+ GetPostApiRequest.getAPIResponseforQueryParams(tag,sortBy,direction);
	}
	

}
