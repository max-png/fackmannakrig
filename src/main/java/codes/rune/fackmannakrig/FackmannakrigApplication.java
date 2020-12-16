package codes.rune.fackmannakrig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "codes.rune.fackmannakrig.repositories")
public class FackmannakrigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FackmannakrigApplication.class, args);
    }


}
