import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words= new ArrayList<>();
        System.out.println("Lütfen 10 kelime giriniz.");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " .kelime: ");
            words.add(scanner.nextLine());
        }
        Collections.sort(words);
        System.out.println("/nAlfabetik sıraya göre kelimeler: ");
        for(String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}