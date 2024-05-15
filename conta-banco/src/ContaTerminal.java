
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        
        int conta=0;
        String agencia;
        String nomeCliente;
        double saldo=237.54;

        System.out.println("Por favor digite o numero da conta");
        conta=entrada.nextInt();
        
        System.out.println("Por favor digite a agência");
        agencia=entrada.nextLine();

        System.out.println("Digite o nome");
        nomeCliente=entrada.nextLine();

        System.out.println("Olá"  +nomeCliente+ 
        ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
        ", conta "+conta+ "e seu saldo"+saldo+ "esta disponível para saque");



        entrada.close();
}
}