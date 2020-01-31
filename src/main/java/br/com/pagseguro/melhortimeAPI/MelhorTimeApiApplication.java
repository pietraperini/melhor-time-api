package br.com.pagseguro.melhortimeAPI;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MelhorTimeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelhorTimeApiApplication.class, args);
	}

}
