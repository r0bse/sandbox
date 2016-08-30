package de.schroeder.servicelocator;

import de.schroeder.servicelocator.services.CustomService;

/**
 * @author schroeder
 * @date 30. Aug 2016
 *
 * http://stackoverflow.com/questions/14992796/custom-autowire-candidate-beans-in-spring-3
 */
public interface ServiceLocator {

    CustomService getService(String serviceName);
}
