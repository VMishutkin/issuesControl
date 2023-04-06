package tech.info.issuescontrol;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class IssuesControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(IssuesControlApplication.class, args);
    }

}
