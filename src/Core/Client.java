package Core;

public class Client {
	private String name;
	
	Client (String n) {
		this.setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Client c) {
		return (this.getName()).equalsIgnoreCase(c.getName());
	}
	
	public String toString() {
		return this.getName();
	}
}
