package teste;

import implementacao.EnviadorSMS;
import implementacao.EnviadorSMSVivoImpl;
import implementacao.SMS;
import implementacao.SMSAdapterVivo;

public class Main {
	
	public static void main(String[] args) {
		
		EnviadorSMS enviador = new SMSAdapterVivo(new EnviadorSMSVivoImpl());
		
		SMS sms = montarMensagem();
		
		enviador.enviarSMS(sms);
		
	}

	private static SMS montarMensagem() {
		SMS sms = new SMS();
		sms.setOrigem("(83)998984455");
		sms.setDestino("(83)998884411");
		sms.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor "
				+ "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		return sms;
	}
	
}
