import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Valor da hora de aula: R$");
    double hora = teclado.nextDouble();
    System.out.print("Horas trabalhadas no mês: ");
    double trabalho = teclado.nextDouble();
    System.out.print("Pescentual de desconto do INSS: ");
    double inss = teclado.nextDouble();
    double salario = hora * trabalho;
    double desconto = salario * (inss / 100.0);
    double liquido = salario - desconto;
    System.out.println("Salário Bruto: R$ " +salario);
    System.out.println ("Desconto INSS: R$ " + desconto);
    System.out.println("Salário Líquido: R$ " + liquido);
    teclado.close();
    }
}