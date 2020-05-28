package com.read.write.api;

import java.io.IOException;

public class APITesting {

	static GetPostApiRequest testAPI = new GetPostApiRequest();

	static String tag_tech="tech";
	static String tag_science="science";
	static String sortBy_id="id";
	static String sortBy_reads="reads";
	static String sortBy_popularity="popularity";
	static String sortBy_likes="likes";
	static String direction_desc="desc";
	static String direction_asc="asc";
	
	 public static void main(String[] args) throws UnsupportedOperationException, IOException {
		
		 /*
		  * ROUTE 1 :iT DISPLAYS THE STATUS CODE AS 200 AND SUCCESS
		  * 
		  */

		 String statusCode= (testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_id,direction_desc));
		 if(statusCode.equals("200"))
		 {
			 System.out.println("Success");
		 }
		
		 /*
		  * ROUTE 2: TESTING API WITH VARIOUS COMBINATIONS
		  * 
		  */
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_id,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_reads,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_popularity,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_likes,direction_desc);
		 
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_id,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_reads,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_popularity,direction_desc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_likes,direction_desc);
		 
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_id,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_reads,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_popularity,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_tech,sortBy_likes,direction_asc);
		 
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_id,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_reads,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_popularity,direction_asc);
		 testAPI.getAPIResponseforQueryParams(tag_science,sortBy_likes,direction_asc);
	}
}
