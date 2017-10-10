package com.karson.webmagic.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.Order;
@Order(1)
//重点
@WebFilter(filterName = "Filter1", urlPatterns = "/*")
public class Filter implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		     HttpServletRequest req = (HttpServletRequest)request;
		 
		     chain.doFilter(request,response); 
		    
		   

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
