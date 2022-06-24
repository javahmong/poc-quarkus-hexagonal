package ch.demo.domain.service;

import ch.demo.domain.model.CompanyDTO;
import ch.demo.domain.port.api.CompanyServicePort;
import ch.demo.domain.port.spi.CompanyPersitencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompanyServiceImpl implements CompanyServicePort {

    private final CompanyPersitencePort companyPersitencePort;

    @Override
    public Object getByCode(String code) {
        return companyPersitencePort.getByCode(code);
    }

    @Override
    public Object getById(Long id) {
        return companyPersitencePort.getById(id);
    }

    @Override
    public Object save(CompanyDTO companyDTO) {
        return companyPersitencePort.save(companyDTO);
    }

    @Override
    public Object get() {
        return companyPersitencePort.get();
    }
}
