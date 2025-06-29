import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        ContaBanco conta = new ContaBanco(numero, agencia, titular);
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f%n já está disponível para saque.%n", 
                          conta.getTitular(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());        

        while (true) {
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver dados da conta");
            System.out.println("4 - Ver saldo");
            System.out.println("5 - Sair");
            System.out.println("===================================");
            System.out.println("===================================");            

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
            case 1:
                System.out.println("Digite o valor do depósito:");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 2:
                System.out.println("Digite o valor do saque:");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 3:
                System.out.println("Número da Conta: " + conta.getNumero());
                System.out.println("Agência: " + conta.getAgencia());
                System.out.println("Titular: " + conta.getTitular());
                break;
            case 4:
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 5:
                System.out.println("Saindo...");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

