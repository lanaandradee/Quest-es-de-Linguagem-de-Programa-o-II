import java.util.Scanner;
public class Q4 {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a temperatura? ");
        double temperatura = teclado.nextDouble();
        if (temperatura > 37){
            System.out.println("O paciente está com febre.");
        }
        else{
            System.out.println("Temperatura normal");
        }
        teclado.close();
    }
}