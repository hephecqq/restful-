package com.dagong.webservice.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * jersey实现webservice的restful服务
 * 
 * @author DAGONG
 *
 */
@Path("/dagong/webservice/restful/jersey")
public class MyRestfulJersey {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getIt(){
		return "Got it...";
	}
}
