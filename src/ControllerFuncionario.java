import java.util.ArrayList;

public class ControllerFuncionario {
    private static ControllerFuncionario instancia;
    private ArrayList<Funcionario> funcList;
    private FactoryFuncionario factory;

    private ControllerFuncionario() {
        funcList = new ArrayList<Funcionario>();
        factory = new FactoryFuncionario();
    }
    public static synchronized ControllerFuncionario getInstancia() {
        if (instancia == null) {
            instancia = new ControllerFuncionario();
        }
        return instancia;
    }

    public void addFuncionario(int num, String nome, double salario) {

        Funcionario funcionario = factory.retornaFuncionario(num, nome, salario);
        funcList.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");

    }

    public void listarFuncionarios() {
        if (funcList.isEmpty()) {
            System.out.println("Não existem funcionários cadastrados");
        } else {
            for (int i = 0; i < funcList.size(); i++) {
                System.out.println("__________________________");
                System.out.println("Indice: " + i);
                funcList.get(i).getCargo();
                System.out.println("Nome: " + funcList.get(i).getNome());
                System.out.println("Salário: R$" + funcList.get(i).getSalario());
                System.out.println("__________________________");
            }
        }
    }

    public void removerFuncionarios(int indice) {
        if (funcList.isEmpty()) {
            System.out.println("Não existem funcionários cadastrados");
        } else {
            funcList.remove(indice);
            System.out.println("Funcionário removido com sucesso!");
        }

    }

    public void editarFuncionario(int index, int num, String nome, double salario) {

        Funcionario funcionario = factory.retornaFuncionario(num, nome, salario);
        funcList.set(index, funcionario);
        System.out.println("Funcionário atualizado com sucesso!");

    }

}
