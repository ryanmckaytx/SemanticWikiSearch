package edu.ms.pt.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import edu.ms.pt.sparql.access.Company;
import edu.ms.pt.sparql.access.DBPediaSAO;

@Path("search/{company_keyword}")
public class CompanySearchResource extends Resource{
	
	private static final Logger LOGGER = Logger.getLogger(CompanySearchResource.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchCompany(@PathParam("company_keyword") String companyKeyword) {
		LOGGER.info("The control is now CompanySearch Servlet");
		
		List<Company> companyList = new DBPediaSAO().searchCompanyInfo(companyKeyword, uriInfo);
		
		return Response.ok().entity(companyList).build();
	}
}