package Core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {
	
	Bank bank = new Bank("Banco do Basil");
	Client client = new Client("Djheyson");
	Account account = new Account(client,2372,200);
	Transation transation = new Transation(client, account, -40);

	@Test
	void testNewAccount() {
		assertThrows(Exception.class, () -> { bank.newAccount(account); });
	}

	@Test
	void testDepositar() {
		assertThrows(Exception.class, () -> { account.deposito(transation); } );
	}

	@Test
	void testSacar() {
		assertThrows(Exception.class, () -> { account.saque(transation); } );
	}

}
