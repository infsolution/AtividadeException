package br.com.infsolution.conta.modelo;

public class Conta {
protected double saldo;

public void depositar(double valor){
	if(valor<0){
		throw new IllegalArgumentException("Valor inválido");
	}else{
	this.saldo+= valor-0.10;}
}
public void depositar1(double valor){
	if(valor<0){
		throw new ValorInvalidoException(valor);
	}else{
	this.saldo+= valor-0.10;}
}
public void sacar(double valor)throws SaldoInsuficienteException{
	if(valor<=saldo){
	this.saldo-= valor;
	}else{
		throw new SaldoInsuficienteException("Saldo insuficiente.");
	}
}

public double getSaldo(){
	return this.saldo;
}
public void atualiza(double taxa){
	this.saldo+=this.saldo * taxa;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Saldo da conta"+this.saldo;
	}
}
