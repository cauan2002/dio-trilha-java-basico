import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int NumeroDaConta;
        String Agencia = "067-8";
        String Nome_cliente;
        float Saldo = 254.54f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome");
        Nome_cliente = scanner.next();

        System.out.println("digite o numero da conta ");
        NumeroDaConta = scanner.nextInt();

        System.out.println("digite o numero da agencia");
        Agencia=scanner.next();

        System.out.println("Olá ".concat(Nome_cliente)+ ", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(Agencia)+ ", conta: " + NumeroDaConta + " e seu saldo" + Saldo + " já está disponível para saque");



    }
}