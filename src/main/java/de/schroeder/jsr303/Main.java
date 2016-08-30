package de.schroeder.jsr303;

import de.schroeder.servicelocator.ServicelocatorApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author schroeder
 * @date 30. Aug 2016
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run( ServicelocatorApplication.class, args );
    }
}
