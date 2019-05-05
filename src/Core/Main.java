package Core;

public class Main {
	
	public static void main(String[] args) {
		Bank bank = new Bank("Banco do Basil");
		Client client = new Client("Djheyson");
		Account account = new Account(client,2372,200);
		
		try {
			System.out.println(account.toString());
			bank.newAccount(account);
			bank.depositar(new Transation(client,account,200));
			bank.depositar(new Transation(client,account,20));
			bank.depositar(new Transation(client,account,310));
			bank.depositar(new Transation(client,account,40));
			System.out.println(account.toString());
			System.out.println(account.extrato());
		}catch (Exception e) {
			System.out.println(e);
		}

	}
}
