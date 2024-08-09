import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Sistema para registro de conta de banco");
        System.out.println("-------------------------");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("""
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque
                """,nome,agencia,numero,saldo);

    }
}
