package de.schroeder.servicelocator.services;

import org.springframework.stereotype.Service;

/**
 * @author schroeder
 * @date 30. Aug 2016
 */
@Service(CustomService.EXAMPLE_SERVICE_2)
public class ExampleService2 implements CustomService {
    @Override
    public void printName() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
