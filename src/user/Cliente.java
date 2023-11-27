package user;

public class Cliente {
		
	private Long accountNumber;
	private String name;
	private double initialDeposit;
	private double saldo;	
	private double deposito;
	private double saque;
	public static final double TAX = 5;
	
	public Cliente (Long accountNumber, String name, double initialDeposit, double saldo) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.initialDeposit = initialDeposit;
		this.saldo = saldo;	

		
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
	public void accountNumber(final double accountNumber) {
		this.setAccountNumber(getAccountNumber());
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getInitialDeposit() {
		return initialDeposit;
	}
	
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double Saldo() {
		return initialDeposit + deposito;
	}
	
	

}
