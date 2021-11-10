package esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan("esprit.tn.spring")
@EnableSwagger2
@SpringBootApplication
public class SpringbootDataJpaEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJpaEntityApplication.class, args);
    }

}
