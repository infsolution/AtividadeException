package br.com.infsolution.conta.modelo;

public class ValorInvalidoException extends RuntimeException{
 public ValorInvalidoException(double valor){
	 super("Valor invalido: "+valor);
 }
}
