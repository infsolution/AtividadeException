package br.com.infsolution.conta.aplication;

import br.com.infsolution.conta.modelo.Conta;
import br.com.infsolution.conta.modelo.SaldoInsuficienteException;

public class Testcont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.depositar(100);
		try {
			conta.sacar(150);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta);
	}

}
