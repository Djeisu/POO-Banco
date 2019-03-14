import java.util.ArrayList;

public class Conta {
	private long numConta;
	private double saldo;
	private ArrayList<Operacao> operacoes;
	
	Conta(long nConta){
		this.numConta = nConta;
		this.saldo = 0;
		this.operacoes = new ArrayList<Operacao>();
	}

	public long getNumConta() {
		return numConta;
	}


	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public ArrayList<Operacao> getOperacoes() {
		return operacoes;
	}
	
	public int getNOperacao() {
		return this.operacoes.size();
	}

	public void setOperacoes(ArrayList<Operacao> operacoes) {
		this.operacoes = operacoes;
	}
	
	private void addOperacao(Operacao op) {
		this.operacoes.add(op);
	}
	
	public void deposito(Operacao op) {
		this.setSaldo( op.getValue() + this.getSaldo() );
		this.addOperacao(new Operacao(op.getType(),op.getValue(),this.getSaldo()));
	}
	
	public void saque(Operacao op) {
		if ( this.validSaldo(op) ) {
			this.setSaldo(this.getSaldo() - op.getValue());
			this.addOperacao(new Operacao(op.getType(),op.getValue(),this.getSaldo()));
		}else {
			System.out.println("Operação de Saque inválida, seu saldo não é suficiênte.");
			System.out.println("-------------------------------------------------------------------");
		}
	}
	
	public boolean validSaldo(Operacao op) {
		return (this.getSaldo() - op.getValue()) > 0 && this.getSaldo() > 0;
	}
	
	public void extrato() {
		for (Operacao o : this.operacoes) {
			System.out.println("Você realizou um " + (o.getType() == 's' ? "Saque" : "Deposito" ) + " com valor R$ " + o.getValue());
			System.out.println("Saldo final nessa operação R$ " + o.getSaldo());
			System.out.println("-------------------------------------------------------------------");
		}
		System.out.println("Seu Saldo Atual é R$ " + this.saldo);
	}
	
	public void extrato(int nOperacoes) {
		for (int i = nOperacoes; i < this.getNOperacao() ; i++) {
			System.out.println("Você realizou um " + (this.operacoes.get(i).getType() == 's' ? "Saque" : "Deposito" ) + " com valor R$ " + this.operacoes.get(i).getValue());
			System.out.println("Saldo final nessa operação R$ " + this.operacoes.get(i).getSaldo());
			System.out.println("-------------------------------------------------------------------");
		}
		System.out.println("Seu Saldo Atual é R$ " + this.saldo);
	}	
}
