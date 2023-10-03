import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ControllerFuncionario controller = ControllerFuncionario.getInstancia();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("__________________________");
            System.out.println("Controle de Funcionários");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Remover Funcionários");
            System.out.println("4 - Editar Funcionários");
            System.out.println("__________________________");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("1 - Adicionar Diretor");
                    System.out.println("2 - Adicionar Vendedor");
                    int escolha = sc.nextInt();
                    System.out.println("Digite o nome de Funcionário");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Digite o salário do funcionário");
                    double salario = sc.nextDouble();
                    controller.addFuncionario(escolha, nome, salario);
                    break;

                case 2:
                    controller.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("Escolha o funcionário que deseja remover pelo seu indice");
                    controller.listarFuncionarios();
                    int indice = sc.nextInt();
                    controller.removerFuncionarios(indice);
                    break;

                case 4:
                    System.out.println("Escolha o funcionário que deseja editar pelo seu indice");
                    controller.listarFuncionarios();
                    int index = sc.nextInt();
                    System.out.println("1 - Transformar em Diretor");
                    System.out.println("2 - Transformar em Vendedor");
                    int numCargo = sc.nextInt();
                    System.out.println("Digite o novo nome");
                    sc.nextLine();
                    String newNome = sc.nextLine();
                    System.out.println("Digite o novo salário");
                    double newSalario = sc.nextDouble();
                    controller.editarFuncionario(index, numCargo, newNome, newSalario);
                    break;

               
            }

        }

    }
}
