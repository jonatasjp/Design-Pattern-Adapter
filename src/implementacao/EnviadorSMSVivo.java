package implementacao;

public interface EnviadorSMSVivo {

	public void enviarSMS(String destino, String origem, String[] msgs) throws SMSException;
}
