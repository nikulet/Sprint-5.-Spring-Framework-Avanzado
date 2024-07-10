package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02")
@EnableJpaRepositories(basePackages = "cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.repository")
public class S05T01N02CebanNicusorApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N02CebanNicusorApplication.class, args);
	}
}
