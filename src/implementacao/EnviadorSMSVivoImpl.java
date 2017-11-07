package implementacao;

public class EnviadorSMSVivoImpl implements EnviadorSMSVivo{

	@Override
	public void enviarSMS(String origem, String destino, String[] msgs) throws SMSException {
		for (String msg : msgs) {
			enviarMsg(origem, destino, msg);
		}
	}
	
	private void enviarMsg(String origem, String destino, String msg) {
		System.out.println("VIVO: enviando mensagem de: " +origem +" para: " +destino);
		System.out.println("Mensagem: ");
		System.out.println(msg);
		System.out.println("--------------------------------------------------------------------------");
	}

}
