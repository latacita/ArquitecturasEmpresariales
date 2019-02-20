package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoDDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoDDemoApplication.class, args);
		
		OrderHandler oh = new OrderHandler();
		
		System.out.println("Puta bean creada");
		
		oh.processOrder();
		
		System.out.println("Aplicación correctamente arrancada");
	}

}
