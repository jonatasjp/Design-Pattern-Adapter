package implementacao;

public class SMSAdapterVivo implements EnviadorSMS {

	private EnviadorSMSVivo enviadorSMSVivo;

	public SMSAdapterVivo(EnviadorSMSVivo enviadorSMSVivo) {
		this.enviadorSMSVivo = enviadorSMSVivo;
	}

	@Override
	public boolean enviarSMS(SMS sms) {
		String[] txts = quebrarMsgs(sms.getTexto());
		try {
			enviadorSMSVivo.enviarSMS(sms.getOrigem(), sms.getDestino(), txts);
		} catch (SMSException e) {
			return false;
		}
		return true;
	}

	private String[] quebrarMsgs(String text) {
		int size = text.length();
		int qtd = (size % 160 == 0) ? size / 160 : size / 160 + 1;
		String[] msgs = new String[qtd];
		for (int i = 0; i < qtd; i++) {
			int min = i * 160;
			int max = (i == qtd - 1) ? size : (i + 1) * 160;
			msgs[i] = text.substring(min, max);
		}
		return msgs;
	}

}
