package alura.curso.poo.bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		// A CONTA 1 É UMA REFERENCIA AO OBJETO CONTA. REFERENCIA É COMO SE FOSSE UM CAMINHO Á SER PERCORRIDO.
		Conta conta1 = new Conta();
		
		conta1.saldo = 200;
		System.out.println(conta1.saldo);
		
		conta1.saldo += 100;
		System.out.println(conta1.saldo);
		
		// NÃO COPIA O VALOR, APENAS COPIA A "R E F E R Ê N C I A" AO OBJETO DA CONTA 1, ENTAO AS DUAS ESTÃO REFERENCIANDO UM MESMO OBJETO, COMO SE OS CAMINHOS DE CADA UMA SE ENCONTRASSEM.
		Conta conta2 = conta1;
		
		conta2.saldo += 50;
		System.out.println("primeira conta tem: " + conta1.saldo);
		System.out.println("segunda conta tem: " + conta2.saldo);
		
		// A SAÍDA DAS DUAS CONTAS DEU O MESMO VALOR POIS A CONTA 2 ESTÁ REFERENCIANDO O MESMO OBJETO DA CONTA 1.
	}

}
