public class Cuenta {
	int tipocuenta;
	int moneda;
	String numerocuenta;
	double saldo;
	public Cuenta (int tipocuenta, int moneda, String numerocuenta,double saldo) {
		this.tipocuenta =tipocuenta;
		this.moneda =moneda;
		this.numerocuenta =numerocuenta;
		this.saldo =saldo;
		
	}
	public void ConsultarSaldo() {
		System.out.println("Su saldo actual es: "+saldo);
	}
	public void Retiro(double monto) {
		if (monto>saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			int bx=0;
			int mont=(int)monto;
			bx=mont/100;
			mont=mont%100;
			System.out.println("Retirara "+ bx+ " billetes de 100");
			bx=mont/50;
			mont=mont%50;
			System.out.println("Retirara "+ bx+ " billetes de 50");
			bx=mont/20;
			mont=mont%20;
			System.out.println("Retirara "+ bx+ " billetes de 20");
			bx=mont/10;
			System.out.println("Retirara "+ bx+ " billetes de 10");
			saldo-=monto;
		}
	}
	public void Deposito(double monto) {
		saldo+=monto;
	}
}
