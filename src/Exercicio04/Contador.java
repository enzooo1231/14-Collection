package Exercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contador {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        char letra;

        System.out.println("Frase: ");
        String frase = sc.nextLine().toLowerCase();

        for (int i =0; i < frase.length(); i++){
            letra = frase.charAt(i);
            if (Character.isLetter(letra)){

            }
        }




    }

}
