package de.schroeder.servicelocator.config;

import de.schroeder.servicelocator.ServiceLocator;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author schroeder
 * @date 30. Aug 2016
 */
@Configuration
public class AppConfig {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface( ServiceLocator.class );
        return bean;
    }

    @Bean
    public ServiceLocator serviceLocator() {
        return ( ServiceLocator ) serviceLocatorFactoryBean().getObject();
    }
}
