package Core;

import java.util.ArrayList;
import java.util.List;

import Core.Exceptions.ValueNotValidException;

public class Bank {
	private String name;
	private List<Account> accounts;

	Bank(){
		this.init();
	}
	
	Bank(String n){
		this.init();
		this.setName(n);
	}
	
	Bank(String n, List<Account> l){
		this.setName(n);
		this.setAccounts(l);
	}
	
	private void init() {
		this.accounts = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void newAccount(Account a) throws Exception{
		if(a.getNumber() == 0)
			throw new Exception("Informe uma conta para ser adicionada");
		
		this.getAccounts().add(a);
	}
	
	public void depositar(Transation t) throws ValueNotValidException{
		if(t.getValue() < 0)
			throw new ValueNotValidException();
		
		for (Account account : accounts)
			if(account.equals(t.getClient(), t.getAccount()))
				account.deposito(t);
	}
	
	public void sacar(Transation t) throws Exception{
		if(t.getValue() < 0)
			throw new ValueNotValidException();
		
		for (Account account : accounts)
			if(account.equals(t.getClient(), t.getAccount()))
				account.deposito(t);
	}
	
}
