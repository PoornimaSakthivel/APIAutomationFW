package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{
	
	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		logrequest(requestSpec);
	Response response=	ctx.next(requestSpec, responseSpec);
	logresponse(response);
	return 	response;
		
	}
	public void logrequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI:"+requestSpec.getBaseUri());
		logger.info("Request Header:"+requestSpec.getHeaders());
		logger.info("Request Payload:"+requestSpec.getBody());
		
	}
	
	public void logresponse(Response response) {
		logger.info("StatusCode:" + response.getStatusCode());
		logger.info("Response header:"+response.headers());
		logger.info("Request Body:" + response.getBody().prettyPrint());
		
		
	}

}
