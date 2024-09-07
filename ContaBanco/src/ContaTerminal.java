import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("Seja bem vindo ao nosso Banco! ");

        System.out.println("Para começarmos, Por favor insira o numero da conta: ");
        int numero = teclado.nextInt();

        System.out.println("Por favor insira a agência com o hifem: ");
        String agenciaBancaria = teclado.next();
        
        System.out.println("por favor informe o nome do Titular da conta: ");
        String nomeDoCliente = teclado.next();

        System.out.println("Por favor informe o valor do saldo: ");
        double saldoBancario = teclado.nextDouble();

        System.out.println();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta " + numero + " e seu saldo " + saldoBancario + " já está disponível para saque");

        System.out.println();

    }

}
