import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*".repeat(50));

        System.out.printf("Dados iniciais do cliente:%n%n%n");

        String nome = "Arilson Sousa Filadelfo Filho";
        String tipoConta = "Corrente ";
        double saldoEmConta = 2500;


        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Tipo de conta: %s%n", tipoConta);
        System.out.printf("Saldo: %.2f%n", saldoEmConta);
        System.out.printf("%n%n");
        System.out.println("*".repeat(50));




        while (true) {

            int encerrarPrograma = 0;

            System.out.printf("%n%n");

            System.out.println("Operações:");

            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.printf("%n%n");

            System.out.println("Digite a opção desejada:");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("O saldo atual é: %.2f%n", saldoEmConta);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja receber ou depositar:");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    saldoEmConta += valor;
                    System.out.printf("Seu novo saldo é de %.2f%n", saldoEmConta);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double transferencia = sc.nextDouble();
                    sc.nextLine();
                    if (transferencia > saldoEmConta) {
                        System.out.println("Não foi possivel realizar a transferência pois o valor que deseja transferir é maior que o valor possuido em sua conta.");
                    } else {
                        saldoEmConta -= transferencia;
                        System.out.printf("Transferencia de %.2f realizada com sucesso!%n", transferencia);
                        System.out.printf("Seu novo saldo é de %.2f%n", saldoEmConta);
                    }
                    break;
                case 4:
                    System.out.println("Saindo da conta.");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
                    break;
            }
            if (opcao == 4) {
                break;
            }
        }




        sc.close();
    }
}
