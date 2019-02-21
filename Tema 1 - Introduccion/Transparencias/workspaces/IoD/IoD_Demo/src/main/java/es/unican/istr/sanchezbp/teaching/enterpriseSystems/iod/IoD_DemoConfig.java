package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoD_DemoConfig {
	
	@Bean
	public NotificationSender sender() {
		return new SmsNotificationSender();
	}

}
