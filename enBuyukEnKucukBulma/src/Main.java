import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(250);
        numbers.add(371);
        numbers.add(40);
        numbers.add(58);
        numbers.add(6);
        numbers.add(754);
        numbers.add(8);
        numbers.add(98);
        numbers.add(10);

        int min= Collections.min(numbers);
        int max= Collections.max(numbers);

        System.out.println("Listede en büyük eleman: "+max);
        System.out.println("Listede en küçük eleman: "+min);

    }
}