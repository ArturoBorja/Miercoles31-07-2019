
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p =new Persona("Santiago","70764185");
		p.soles.Deposito(1000);
		p.dolares.Deposito(500);
		p.ListarCuentas();
		Persona mario =new Persona("Santiago","70764185");
		mario.ListarCuentas();
		p.HacerTransferencia(p.dolares,mario.soles,500);
		p.ListarCuentas();
		mario.ListarCuentas();

	}

}
