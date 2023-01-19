package alura.curso.poo.bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		
		conta1.saldo = 200;
		System.out.println(conta1.saldo);
		
		conta1.saldo += 100;
		System.out.println(conta1.saldo);
		
		Conta conta2 = conta1;
		
		conta2.saldo += 50;
		System.out.println("primeira conta tem: " + conta1.saldo);
		System.out.println("segunda conta tem: " + conta2.saldo);
	}

}
