import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.next();  

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine();  
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agencia e " 
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.";
        
        System.out.println(mensagem);

        scanner.close();
    
    }
}
