import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		List<Conta> lc;
		lc = new ArrayList<Conta>();
		
		lc.add(new Conta(123456));
		//Inicie a conta com o número da conta
		
		for (Conta c : lc) {
			for(int i = 0; i < 10; i++) {
				if( (((int)(Math.random() * 101))%2) == 0)
					c.deposito((int)(Math.random() * 101));
				else
					c.saque((int)(Math.random() * 101));
			}
			c.extrato();
		}
	}
}
