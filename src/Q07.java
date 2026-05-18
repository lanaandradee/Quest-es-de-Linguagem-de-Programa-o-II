import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
System.out.print("Altura (em metros): ");
double altura = teclado.nextDouble();
System.out.print("Peso (em kg): ");
double peso = teclado.nextDouble();
double imc = peso / (altura * altura);
System.out.println("Seu IMC é: " +imc);
if (imc > 30.0){
    System.out.println("O usuário está obeso!");
        }
else {
    System.out.println("O usuário não está obeso!");
        }
teclado.close();
    }
}