import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        //declaração de variaveis
        // NumeroDaConta, Agencia e Nome_cliente serão definidos pelo metodo "scanner.next()" e "scanner.nextInt()" da classe Scanner.

        int NumeroDaConta;
        String Agencia ;
        String Nome_cliente;
        float Saldo = 254.54f;

        //objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        //exibição de mensagem de inserção de dados e atribuição de variaveis pelo metodo scanner
        System.out.println("digite seu nome");
        Nome_cliente = scanner.next();

        System.out.println("digite o numero da conta ");
        NumeroDaConta = scanner.nextInt();

        System.out.println("digite o numero da agencia");
        Agencia=scanner.next();


        // exibição de mensagem final
        System.out.println("Olá ".concat(Nome_cliente)+ ", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(Agencia)+ ", conta: " + NumeroDaConta + " e seu saldo" + Saldo + " já está disponível para saque");



    }
}