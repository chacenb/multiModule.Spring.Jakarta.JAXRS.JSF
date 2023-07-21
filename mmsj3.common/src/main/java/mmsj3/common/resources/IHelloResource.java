package mmsj3.common.resources;

import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import mmsj3.common.models.Employee;
import mmsj3.common.models.Response;


@Path("/")
public interface IHelloResource {


			@GET
			@Path("/")
			@Produces({ MediaType.TEXT_PLAIN })
			public Response index();

			@GET
			@Path("/allEmployees")
			@Produces(MediaType.APPLICATION_JSON)
			public Response getAllEmployees();

			@POST
			@Path("/createEmployee")
			@Consumes(MediaType.APPLICATION_JSON)
			@Produces(MediaType.APPLICATION_JSON)
			public Response createEmployee(@Valid Employee employee) throws Exception;
}
