//package com.citius.utilities;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//
//@Component  
//public class ZuulLoggingFilter extends ZuulFilter {
//
//	private Logger logger=LoggerFactory.getLogger(this.getClass()); 
//	@Override
//	public boolean shouldFilter() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Object run() throws ZuulException {
//		//getting the current HTTP request that is to be handle  
//		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();  
//		//printing the detail of the request  
//		System.out.println("request -> {} request uri-> {}"+ request+ request.getRequestURI());  
//		return null;  
//	}
//
//	@Override
//	public String filterType() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int filterOrder() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
