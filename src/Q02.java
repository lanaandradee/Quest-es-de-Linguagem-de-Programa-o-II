import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Distância a ser percorrida (km): ");
        double distancia = teclado.nextDouble();
        System.out.print("Preço do litro da gasolina: R$ ");
        double precoLitro = teclado.nextDouble();
        double litrosNecessarios = distancia / 12.0;
        double custoTotal = litrosNecessarios * precoLitro;
        System.out.println("Quantidade de gasolina necessária: " + litrosNecessarios + " litros");
        System.out.println("Custo total: R$ " + custoTotal);
        teclado.close();
    }
}