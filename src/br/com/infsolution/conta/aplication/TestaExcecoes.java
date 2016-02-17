package br.com.infsolution.conta.aplication;

import br.com.infsolution.conta.modelo.Conta;
import br.com.infsolution.conta.modelo.ContaCorrente;
import br.com.infsolution.conta.modelo.ContaPoupanca;
import br.com.infsolution.conta.modelo.ValorInvalidoException;

public class TestaExcecoes {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		
		try{
			conta.depositar(-123);
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());	
			}
		
		try{
		conta.depositar1(-123);
		}catch(ValorInvalidoException e){
			System.out.println(e.getMessage());	
		}
	}
}
