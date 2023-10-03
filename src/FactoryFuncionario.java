public class FactoryFuncionario {
    public Funcionario retornaFuncionario (int num, String nome, double salario){
        Funcionario funcionario;
        if (num == 1){
            funcionario = new Diretor(nome, salario);
        } else {
            funcionario = new Vendedor(nome, salario);
        }
        return funcionario;
    }
}
