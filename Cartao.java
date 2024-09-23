public class Cartao {

	private String numeroCartao;
	private String validade;
	private double limite;
	
	//Gets
	public String getnumeroCartao() {
		return numeroCartao;
	}
	public String getvalidade() {
		return validade;
	}
	public double getlimite() {
		return limite;
	}
	
	//Sets
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
