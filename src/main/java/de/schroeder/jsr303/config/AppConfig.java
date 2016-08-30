package de.schroeder.jsr303.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @author schroeder
 * @date 30. Aug 2016
 */
@Configuration
public class AppConfig {

    /**
     * Integration of JSR-303 Bean Validation into Spring Framework application
     * http://stackoverflow.com/a/23615478
     * @return
     */
    @Bean
    public Validator localValidatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    /**
     * needed so that @valid (jsr-validation) works on method level
     * @return
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
