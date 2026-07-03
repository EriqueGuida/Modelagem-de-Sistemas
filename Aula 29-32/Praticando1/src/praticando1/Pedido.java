package praticando1;

public class Pedido {
	private int numero;
	private double valorTotal;
	private Cliente cliente;
	
	// Constructor
	public Pedido(int numero, double valorTotal, Cliente cliente) {
		super();
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
	}

	public double calcularTotal() {
		return valorTotal;
	}
	
	public void getDados() {
		System.out.println(
				"\nDados do pedido:\n" +
				"Número: " + numero + "\n" +
				"Valor Total: R$ " + valorTotal + "\n" +
				"Cliente: " + cliente);
	}
	
	// Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
