package ch.demo.infrastructure.adapter;

import ch.demo.domain.model.CompanyDTO;
import ch.demo.domain.port.spi.CompanyPersitencePort;
import ch.demo.infrastructure.entity.Company;
import ch.demo.infrastructure.repository.CompanyRepository;
import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.smallrye.mutiny.Uni;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CompanyPanacheReactiveAdapter implements CompanyPersitencePort {

    CompanyRepository companyRepository;

    @Override
    public Uni<Company> getByCode(String code) {
        return companyRepository.findByCode(code);
    }

    @Override
    public Uni<List<Company>> get() {
        return companyRepository.listAll();
    }

    @Override
    public Uni<Company> getById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    @ReactiveTransactional
    public Uni<Company> save(CompanyDTO companyDTO) {
        Company company = new Company(companyDTO.getId(), companyDTO.getCode(), companyDTO.getName());
        return companyRepository.persist(company);
    }

}
