public class Teste {

	public static void main(String[] args) {
		Cliente cliente1= new Cliente();
		Cartao cartao1= new Cartao();

		cliente1.setNome("João Cordeiro");
		cliente1.setCpf("123.456.789-00");
		cliente1.setEndereco("Vila jacu, 53");
		
		System.out.println("Dados do Cliente:");
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Endereço: " + cliente1.getendereco());
		
		cartao1.setNumeroCartao("1111-2222-3333-4444");
		cartao1.setValidade("07/27");
		cartao1.setLimite(6000.00);
		
		System.out.println("");
		System.out.println("Dados do Cartão: ");
		System.out.println("Numero do cartão: " + cartao1.getnumeroCartao());
		System.out.println("Validade do artão: " + cartao1.getvalidade());
		System.out.println("Limite disponivel: " + cartao1.getlimite());
	}

}
