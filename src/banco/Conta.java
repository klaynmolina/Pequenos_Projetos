package banco;

import java.util.ArrayList;

public class Conta {
	
	ArrayList<Conta> cadastro = new ArrayList<>();
	
	
	private long numeroConta;
	private String nome;
	private double depositoInicial;
	private double saldoConta;
	
	public Conta (long numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.depositoInicial = depositoInicial;
		this.saldoConta = depositoInicial;
	}
	
	public void adicionarCadastro (Conta conta) {
		this.cadastro.add(conta);
	}
	
	public double deposito(double valorDeposito) {
		return this.saldoConta += valorDeposito; 
	}

	public double saque(double valorSaque) {
		return this.saldoConta -= (valorSaque + 5.0); 
	}
	
	@Override
	public String toString() {
		return "Numero da Conta: " + numeroConta + 
				"\nNome: " + nome + 
				"\nSaldo da Conta: R$" + saldoConta;
	}

}
