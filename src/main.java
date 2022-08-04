
public class main {
	public static void main(String[] args) {
		Cliente eliane = new Cliente();
		eliane.setNome("Eliane");
		
		Conta cc = new ContaCorrente(eliane);		
		Conta cp = new ContaPoupanca(eliane);
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();  
		cp.imprimirExtrato();
	}

}
