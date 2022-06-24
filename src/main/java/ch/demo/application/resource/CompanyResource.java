package ch.demo.application.resource;

import ch.demo.application.adapter.CompanyFacade;
import ch.demo.domain.model.CompanyDTO;
import ch.demo.infrastructure.entity.Company;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/company")
public class CompanyResource {
    @Inject
    CompanyFacade companyFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Company>> getCompanies() {
        return companyFacade.get();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Company> getCompany(@PathParam("id") final Long id) {
        return companyFacade.getById(id);
    }

    @GET
    @Path("/code/{code}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Company> getCompanyByCode(@PathParam("code") final String code) {
        return companyFacade.getByCode(code);
    }

    @POST
    public Uni<Company> get(@RequestBody CompanyDTO companyDTO) {
        return companyFacade.save(companyDTO);
    }
}