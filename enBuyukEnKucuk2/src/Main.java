import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("Lütfen 10 sayı giriniz:");
        for(int i=1;i<=10;i++){

            System.out.print("sayı "+i+":");
            int number = sc.nextInt();
            numbers.add(number);
        }
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Sayılar büyükten küçüğe sıralandı:");
        for(int num:numbers){
            System.out.println(num);
        }
        sc.close();



    }
}