import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Eskişehir");
        cities.add("Kocaeli");
        cities.add("İstanbul");
        cities.add("Antalya");
        cities.add("Ankara");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen şehir giriniz: ");
        String city=scanner.nextLine();

        if(cities.contains(city)){
            int index=cities.indexOf(city);
            System.out.println(city+" şehri mevcuttur.İndeksi: "+index);
        }
        else{
            System.out.println(city+" şehri mevcut değildir!");
        }


    }
}