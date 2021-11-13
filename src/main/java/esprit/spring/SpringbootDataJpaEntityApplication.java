package esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan("esprit.tn.spring")
@EnableSwagger2
@SpringBootApplication
@EnableScheduling
public class SpringbootDataJpaEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJpaEntityApplication.class, args);
    }

}
