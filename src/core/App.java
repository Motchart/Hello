package core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {
@GET
@Path("/get")
public String qa(){
	return "Hello";
}
}
