package br.com.erikgodoycursomc.demo.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.erikgodoycursomc.demo.services.DBService;
import br.com.erikgodoycursomc.demo.services.EmailService;
import br.com.erikgodoycursomc.demo.services.MockEmailService;
import br.com.erikgodoycursomc.demo.services.SmtpEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	
	@Bean
	public SmtpEmailService emailServiceSmtp() {
		return new SmtpEmailService();
	}	
}
