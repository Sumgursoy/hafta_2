import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       int[]arr={5,3,8,3,1,5,8};

        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        for(int num:arr){
            if(seen.contains(num)){
                duplicates.add(num);
            }
            else{
                seen.add(num);
            }
        }
        if(duplicates.isEmpty()){
            System.out.println("Tekrar eden sayı yok!");
        }
        else{
            System.out.println("Tekrar eden sayılar: ");
            for(int num:duplicates){
                System.out.println(num+" ");
            }
        }

    }
}