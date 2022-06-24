package ch.demo.domain.port.api;

import ch.demo.domain.model.CompanyDTO;

public interface CompanyServicePort {

    Object getByCode(String code);
    Object getById(Long id);
    Object save(CompanyDTO companyDTO);
    Object get();


}
