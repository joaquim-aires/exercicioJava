public class Vendedor extends Funcionario {
    public Vendedor(String nome, double valorPago){
		super(nome, valorPago);
	}

    @Override
    public void getCargo() {
        System.out.println("Vendedor");
    }
    
}
