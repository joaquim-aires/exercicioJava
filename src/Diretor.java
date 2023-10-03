public class Diretor extends Funcionario{
    public Diretor(String nome, double valorPago){
		super(nome, valorPago);
	}

    @Override
    public void getCargo() {
        System.out.println("Diretor");
    }
    
}
