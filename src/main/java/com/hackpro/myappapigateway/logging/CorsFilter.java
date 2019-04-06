package com.hackpro.myappapigateway.logging;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CorsFilter implements Filter {

	
	public CorsFilter() {
		System.out.println("Working!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		    HttpServletRequest request = (HttpServletRequest) req;
		    HttpServletResponse response = (HttpServletResponse) res;
		    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//		    response.setHeader("Access-Control-Allow-Methods", "*");
		    response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
		    response.setHeader("Access-Control-Allow-Credentials", "false");
		    response.setHeader("Access-Control-Max-Age", "3600");
		    response.setHeader("Access-Control-Allow-Headers", "*");
		    chain.doFilter(req, res);
	}

}
