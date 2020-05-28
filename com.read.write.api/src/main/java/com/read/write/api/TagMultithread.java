package com.read.write.api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TagMultithread {
	
	public static void main(String[] args) throws  Exception {

		//Tag parameters 
		String tagParam = "tech,science,history,howto";
		String[] tagParamArray = tagParam.split(",");
		
		ExecutorService executorService = Executors.newFixedThreadPool(tagParamArray.length);

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		//Calling API which returns the values for tag
		for (String tag : tagParamArray) {
			callables.add(new TestCallable(tag));
		}


		List<Future<String>> futures = executorService.invokeAll(callables);

		for(Future<String> future : futures){
		    System.out.println("future.get = " + future.get());
		}

		executorService.shutdown();

    }


}
