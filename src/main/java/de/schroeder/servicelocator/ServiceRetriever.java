package de.schroeder.servicelocator;

import de.schroeder.servicelocator.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author schroeder
 * @date 30. Aug 2016
 */
@Service
public class ServiceRetriever {

    private final ServiceLocator serviceLocator;

    @Autowired
    public ServiceRetriever(ServiceLocator serviceLocator){

        this.serviceLocator = serviceLocator;

        CustomService service1 = serviceLocator.getService( CustomService.EXAMPLE_SERVICE_1 );
        service1.printName();

        CustomService service2 = serviceLocator.getService( CustomService.EXAMPLE_SERVICE_2 );
        service2.printName();
    }

}
