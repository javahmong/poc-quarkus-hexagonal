package ch.demo.domain.port.spi;

import ch.demo.domain.model.CompanyDTO;

public interface CompanyPersitencePort {
    Object get();
    Object getByCode(String code);
    Object getById(Long id);
    Object save(CompanyDTO companyDTO);

}
