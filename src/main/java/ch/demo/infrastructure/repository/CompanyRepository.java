package ch.demo.infrastructure.repository;

import ch.demo.infrastructure.entity.Company;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompanyRepository implements PanacheRepository<Company> {
    public Uni<Company> findByCode(String code) {
        return find("code = ?1", code).singleResult();
    }
}
