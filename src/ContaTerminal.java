import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    Scanner leitura = new Scanner(System.in);

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void solicitaDados(){
        System.out.print("Digite seu nome: ");
        this.setNomeCliente(leitura.nextLine());
        System.out.print("Digite sua agência:");
        this.setAgencia(leitura.nextLine());
        System.out.print("Digite seu número da conta: ");
        this.setNumero(leitura.nextInt());
        System.out.print("Nos informe seu saldo atual: ");
        this.setSaldo(leitura.nextDouble());
        leitura.close();
    }

    public void mostraDados(){
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu salto é %.2f já está disponível para saque.", getNomeCliente(), getAgencia(), getNumero(), getSaldo()));
    }
}
