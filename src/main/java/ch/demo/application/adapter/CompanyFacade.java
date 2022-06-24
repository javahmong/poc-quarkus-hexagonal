package ch.demo.application.adapter;

import ch.demo.domain.model.CompanyDTO;
import ch.demo.domain.port.api.CompanyServicePort;
import ch.demo.infrastructure.entity.Company;
import io.smallrye.mutiny.Uni;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@AllArgsConstructor
@NoArgsConstructor
public class CompanyFacade {

    @Inject
    CompanyServicePort companyServicePort;

    public Uni<Company> getById(Long id){
        return (Uni<Company>) companyServicePort.getById(id);
    }

    public Uni<Company> save(CompanyDTO companyDTO) {
        return (Uni<Company>) companyServicePort.save(companyDTO);
    }

    public Uni<Company> getByCode(String code){
        return (Uni<Company>) companyServicePort.getByCode(code);
    }

    public Uni<List<Company>> get() {
        return (Uni<List<Company>>) companyServicePort.get();
    }
}
