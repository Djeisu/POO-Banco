package Core;

public class Transation {
	private double value; 
	private Client client; 
	private Account account;
	
	Transation () {}
	
	Transation (Client c, Account a, double v) {
		this.setClient(c);
		this.setAccount(a);
		this.setValue(v);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String toString() {
		return "Valor: " + this.getValue() + "\n";
	}
}
