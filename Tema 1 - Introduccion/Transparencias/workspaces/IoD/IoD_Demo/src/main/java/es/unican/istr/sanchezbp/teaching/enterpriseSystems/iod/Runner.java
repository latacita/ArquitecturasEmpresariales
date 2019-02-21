package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ApplicationContext.xml")
public class Runner implements CommandLineRunner {
 
    @Autowired
    private OrderHandler oh;

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
 
    @Override
    public void run(String... arg0) throws Exception {
    	
		System.out.println("Application started.");
		System.out.println("");
		
		User u = new User();
		Order o = new Order(u); 
		
		oh.processOrder(o);
		
		System.out.println("");
		System.out.println("Application finished.");
         
    }
}