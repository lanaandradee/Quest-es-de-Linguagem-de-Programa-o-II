import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de horas trabalhadas no mês: ");
        double horas = teclado.nextDouble();
        double salario = horas * 20.0;
        System.out.println("O salário do operário é de: R$ " + salario);
        teclado.close();
    }
}