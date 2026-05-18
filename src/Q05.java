import java.util.Scanner;
public class Q5{
    public static void main (String[]args){
Scanner teclado = new Scanner(System.in);
System.out.println("Primeiro número: ");
double numero1 = teclado.nextDouble();
System.out.println("Segundo número: ");
double numero2 = teclado.nextDouble();
if (numero2 > numero1){
    System.out.println("O maior número é ." + numero2);
}
else {
    System.out.println("O maior número é ." + numero1);
}
teclado.close();
    }
}