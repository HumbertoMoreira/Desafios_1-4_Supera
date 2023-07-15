import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int notas100 = (int) (valor / 100);
        valor %= 100;
        int notas50 = (int) (valor / 50);
        valor %= 50;
        int notas20 = (int) (valor / 20);
        valor %= 20;
        int notas10 = (int) (valor / 10);
        valor %= 10;
        int notas5 = (int) (valor / 5);
        valor %= 5;
        int notas2 = (int) (valor / 2);
        valor %= 2;

        double moedas1 =  Math.floor(valor /1);
        valor %= 1;
        double moedas50 = Math.floor(valor /0.5);
        valor %= 0.5;
        double moedas25 = Math.floor(valor /0.25);
        valor %= 0.25;
        double moedas10 = Math.floor(valor /0.10);
        valor %= 0.10;
        double moedas5 = Math.floor(valor /0.05);
        valor %= 0.05;
        double moedas1cent = Math.floor(valor /0.01);

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moedas1 + " moeda(s) de R$ 1.00");
        System.out.println((int)moedas50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moedas25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moedas10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moedas5 + " moeda(s) de R$ 0.05");
        System.out.println((int)moedas1cent + " moeda(s) de R$ 0.01");

        scanner.close();




    }
}
