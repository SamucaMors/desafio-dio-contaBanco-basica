import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Banco Triton");
        ContaTerminal conta1 = new ContaTerminal();
        conta1.solicitaDados();
        conta1.mostraDados();
        System.out.println(conta1.getSaldo());


    }
}