import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "José Soares de Mendonça";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n======= Operações =======");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: R$ ");
                    double valorReceber = scanner.nextDouble();
                    saldo += valorReceber;
                    System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                    break;
                case 3:
                    System.out.print("Informe o valor para transferir: R$ ");
                    double valorTransferir = scanner.nextDouble();
                    if (valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        System.out.printf("Transferência realizada. Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para essa transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
