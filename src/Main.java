
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] CadastroVF = new String[9];
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Mostrar opçoes para o usuario
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar um ninja");
            System.out.println("2 - Listar os ninjas cadastrados");
            System.out.println("3 - Sair.");
            System.out.print("Escolha uma opção: ");

            int escolhaDoUsuario = scanner.nextInt();

            switch (escolhaDoUsuario) {
                case 1:
                    if (contador < CadastroVF.length) {
                        System.out.println("Digite o nome do ninja: ");
                        scanner.nextLine(); // Consumir o enter pendente antes de ler o nome
                        CadastroVF[contador] = scanner.nextLine();
                        contador++; //avança a posição no array
                        System.out.println("Ninja Cadastrado com sucesso");
                        System.out.println("---------------------");
                    }
                    else {System.out.println("=====================");
                        System.out.println("Limite de ninjas atingidos");
                        System.out.println("=====================");
                    }
                    break;

                case 2:
                    System.out.println("Lista de Ninjas cadastrados: ");
                    System.out.println("-----------------------");
                    if (contador == 0) {
                        System.out.println("Nenhum Ninja Cadastrado ainda.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + " - " + CadastroVF[i]);
                        }
                        System.out.println("-----------------------");
                    }
                    System.out.println("=================");
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida! Tente novamente.");

            }

        }
    }
}
