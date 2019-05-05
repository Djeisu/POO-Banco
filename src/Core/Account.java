package Core;

import java.util.ArrayList;
import java.util.List;

import Core.Exceptions.ValueNotValidException;

public class Account {
	private Client owner;
	private double number;
	private double amount;
	private List<Transation> transations;
	
	Account () {
		this.init();
	}
	
	Account (Client o, double n) {
		this.setOwner(o);
		this.setNumber(n);
		this.setAmount(0);
		this.init();
	}
	
	Account (Client o, double n, double a) {
		this.setOwner(o);
		this.setNumber(n);
		this.setAmount(a);
		this.init();
	}
	
	private void init() {
		this.transations = new ArrayList<Transation>();
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public List<Transation> getTransations() {
		return transations;
	}

	public void setTransations(List<Transation> transations) {
		this.transations = transations;
	}
	
	public void deposito(Transation t) throws ValueNotValidException{
		if(t.getValue() < 0)
			throw new ValueNotValidException();
		
		this.transations.add(t);
		this.setAmount(this.amount+t.getValue());
	}
	
	public void saque(Transation t) throws ValueNotValidException{
		if(t.getValue() < 0)
			throw new ValueNotValidException();
		
		this.transations.add(t);
		this.setAmount(this.amount-t.getValue());
	}
	
	public boolean equals(Client c, Account a) {
		return this.getNumber() == a.getNumber() && (this.getOwner()).equals(c);
	}
	
	public String toString() {
		return this.getOwner().toString() + "  " + this.getNumber() + "  " + this.getAmount();
	}
	
	public String extrato() {
		String temp = "";
		for (Transation transation : transations) {
			temp += transation.toString();
		}
		
		return temp;
	}
}
