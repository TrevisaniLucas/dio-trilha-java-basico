import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Bem-Vindo a criação de conta no banco DIO");
        // Usuario inesere número da conta
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        // Usuario insere agencia
        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        //Usuario insere seu nome
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();
        // saldo
        double saldo = 237.48;

        // mensagem Final
        System.out.println("Olá" + " " + nomeCliente + "," + " " + "obrigado por criar uma conta em nosso banco, sua agência é" + " " + numeroAgencia + "," + " " + "conta" + " " + numeroConta + " " + " e seu saldo" + " " + saldo + " " + "já está disponível para saque.");
        scanner.close();
    }
}
