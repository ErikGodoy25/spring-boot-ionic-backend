package br.com.erikgodoycursomc.demo.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.erikgodoycursomc.demo.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
