package br.com.thales.springstore.services;


import br.com.thales.springstore.domain.Cliente;
import br.com.thales.springstore.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
