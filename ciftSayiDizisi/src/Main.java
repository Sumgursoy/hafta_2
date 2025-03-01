import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer>numbers=new ArrayList<>();

        for(int i=0;i<20;i++){
            numbers.add(random.nextInt(100));
        }
        ArrayList<Integer>evenNumbers=new ArrayList<>();
        for(int number:numbers){
            if(number%2==0){
                evenNumbers.add(number);
            }
        }
        System.out.println("Rastgele sayılar: ");
        System.out.println(numbers);

        System.out.println("Çift sayılar: ");
        System.out.println(evenNumbers);


    }
}