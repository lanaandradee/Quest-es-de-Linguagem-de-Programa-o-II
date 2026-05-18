import java.util.Scanner;
public class Q3{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a sua idade?");
        int idade = teclado.nextInt();
        if (idade>18){
            System.out.println("Parabéns! Você já pode tirar sua carteira de motorista!");
            }
        else {
            System.out.println("Que pena! Você ainda não pode tirar sua carteira de motorista.");
            teclado.close();
        }
    }
}