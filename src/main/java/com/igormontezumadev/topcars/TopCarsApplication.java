package com.igormontezumadev.topcars;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Top Cars API",
                version = "1.0",
                description = "Top Cars API"
        )
)
public class TopCarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopCarsApplication.class, args);
    }

}
