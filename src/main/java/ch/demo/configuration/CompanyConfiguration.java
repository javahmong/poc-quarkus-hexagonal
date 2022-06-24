package ch.demo.configuration;

import ch.demo.domain.port.api.CompanyServicePort;
import ch.demo.domain.port.spi.CompanyPersitencePort;
import ch.demo.domain.service.CompanyServiceImpl;
import ch.demo.infrastructure.repository.CompanyRepository;
import ch.demo.infrastructure.adapter.CompanyPanacheReactiveAdapter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;

@ApplicationScoped
public class CompanyConfiguration {

    @Singleton
    CompanyPersitencePort companyPersitencePort(){
        return new CompanyPanacheReactiveAdapter(new CompanyRepository());
    }

    @Singleton
    CompanyServicePort companyServicePort(){
        return new CompanyServiceImpl(companyPersitencePort());
    }
}
