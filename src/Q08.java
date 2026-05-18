import java.util.Scanner;
public class Q8{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor do raio: ");
        double raio = teclado.nextDouble();
        double A = 3.14159 * (raio * raio);
        System.out.println("A área da circunferência é: " + A);
        teclado.close();
}
}