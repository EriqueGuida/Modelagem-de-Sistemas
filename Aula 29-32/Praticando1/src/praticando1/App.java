package praticando1;

public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Carlos Silva", "11111111111");
		Pedido p1 = new Pedido(101, 250.9, c1);
		
		c1.getDados();
		p1.getDados();
	}

}
