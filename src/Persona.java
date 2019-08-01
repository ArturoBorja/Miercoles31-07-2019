
public class Persona {
	public String nombre;
	public String dni;
	public Cuenta soles;
	public Cuenta dolares;
	public Persona(String nombre, String dni) {
		this.nombre =nombre;
		this.dni =dni;
		this.soles = new Cuenta(1,1,"215"+dni,0);
		this.dolares = new Cuenta(1,2,"216"+dni,0);
	}
	public void ListarCuentas() {
		soles.ConsultarSaldo();
		dolares.ConsultarSaldo();
	}
	public void HacerTransferencia(Cuenta origen, Cuenta destino, double monto) {
		
		if(monto>0) {	
			if (origen.saldo>=monto) {
				origen.saldo-=monto;
				destino.saldo+=monto*Math.pow(3.33, (origen.moneda-destino.moneda));	
			}else {
				System.out.println("Saldo insuficiente");
			}
	
		}else {
			System.out.println("Ingrese monto positivo");
		}
	}	
		
}
