import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities =new ArrayList<>();
        cities.add("Eskişehir");
        cities.add("Kocaeli");
        cities.add("Düzce");
        cities.add("Ankara");
        cities.add("Antalya");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir şehir giriniz.");
        String city = scanner.nextLine();
        if(cities.contains(city)){
            int index = cities.indexOf(city);
            System.out.println(city+" Şehri listede mevcuttur.İndexi: "+index);
        }
        else{
            System.out.println(city+" Şehri listede mevcut değildir!");
        }
        scanner.close();

    }
}