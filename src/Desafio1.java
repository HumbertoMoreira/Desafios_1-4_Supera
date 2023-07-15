import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant = scanner.nextInt();
        ArrayList<Integer> listaPares = new ArrayList<Integer>();
        ArrayList<Integer> listaImpares = new ArrayList<Integer>();
        ArrayList<Integer> listaUniao = new ArrayList<Integer>();

        for(int i = 0; i < quant; i++){
            int valores = scanner.nextInt();

            if(valores % 2 == 0){
                listaPares.add(valores);
            }else {
                listaImpares.add(valores);
            }
        }
        Collections.sort(listaPares);
        Collections.sort(listaImpares, Collections.reverseOrder());
        listaUniao.addAll(listaPares);
        listaUniao.addAll(listaImpares);

        listaUniao.forEach(System.out::println);
        scanner.close();
    }
}
