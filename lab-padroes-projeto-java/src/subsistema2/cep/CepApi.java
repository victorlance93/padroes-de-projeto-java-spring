package subsistema2.cep;


public class CepApi {
	
		public static CepApi instacia = new CepApi();
		
	private CepApi() {
		super();
	}
	
	public static CepApi getInstacia() {
		return  instacia;
	}
	
	public String recuperarCidade(String cep) {
		return "Jandira";
	}
	
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}
