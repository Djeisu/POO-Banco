
public class Operacao {
	private String type;
	private double value;
	private double saldo;
	
	Operacao(){
		
	}
	
	Operacao(String tp, double val, double sld){
		this.type = tp;
		this.value = val;
		this.setSaldo(sld);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
