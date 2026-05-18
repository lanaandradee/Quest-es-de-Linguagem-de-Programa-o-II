import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro valor númerico: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Valor númerico 2: ");
        double valor2 = teclado.nextDouble();
        double soma = valor1 + valor2;
        if (soma >= 10.0){
            double add = soma + 5;
            System.out.print("O resultado da soma é: " +add);
        }
        else{
            double menor = 7 - soma;
            System.out.print("Menor que 10: " +menor);
        }

        teclado.close();
    }
}