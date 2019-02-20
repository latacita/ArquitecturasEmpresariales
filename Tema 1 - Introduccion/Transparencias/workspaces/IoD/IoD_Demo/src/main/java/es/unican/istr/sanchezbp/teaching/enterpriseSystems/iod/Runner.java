package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner implements CommandLineRunner{
 
    // @Autowired
    // OrderHandler oh;
     
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
 
    @Override
    public void run(String... arg0) throws Exception {
    	
        
		System.out.println("Puta bean creada");
		
		oh.processOrder();
		
		System.out.println("Aplicación correctamente arrancada");
         
    }
}