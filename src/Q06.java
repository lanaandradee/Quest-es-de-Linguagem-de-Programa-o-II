import java.util.Scanner;
public class Q6 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota da primeira prova: ");
        double prova1 = teclado.nextDouble();
        System.out.println("Nota da segunda prova: ");
        double prova2 = teclado.nextDouble();
        System.out.println("Nota do trabalho: ");
        double trabalho = teclado.nextDouble();
        double media = (prova1 + prova2 + trabalho) /3.0;
                System.out.println("A média é: " + media);
        if (media > 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        teclado.close();
    }
}
