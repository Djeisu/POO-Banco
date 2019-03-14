import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		List<Conta> lc;
		lc = new ArrayList<Conta>();
		Operacao tempOp = new Operacao();
		
		lc.add(new Conta(123456));
		//Inicie a conta com o número da conta
		
		for (Conta c : lc) {
			for(int i = 0; i < 10; i++) {
				tempOp.setValue((int)(Math.random() * 101));
				tempOp.setSaldo(c.getSaldo());
				if( (((int)(Math.random() * 101))%2) == 0) {
					tempOp.setType('d');
					c.deposito(tempOp);
				}
				else {
					tempOp.setType('s');
					c.saque(tempOp);
				}					
			}
			
			c.extrato();
		}
	}
}

//"Saque", val, this.getSaldo()
