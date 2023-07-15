import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        ArrayList<String> frases = new ArrayList<>();


        for(int i = 0; i< num; i++){
            frases.add(leitorDeLinha(scanner).toUpperCase());
        }

        for (String frase: frases){
            StringBuilder primeiraMetade = new StringBuilder(frase.substring(0, frase.length()/2));
            StringBuilder segundaMetade = new StringBuilder(frase.substring(frase.length()/2, frase.length()));
            primeiraMetade.reverse();
            segundaMetade.reverse();
            System.out.println(primeiraMetade.toString() + segundaMetade.toString());
        }
        scanner.close();
    }
    public static String leitorDeLinha(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
}
