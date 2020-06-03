package solekia.GroupA.Systems.Urban_eats;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("solekia.GroupA.Systems.Urban_eats.repository")
public class UrbanEatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbanEatsApplication.class, args);
	}

}
