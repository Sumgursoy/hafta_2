import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays.sort():sıralama sağlar.
        int[]numbers={9,2,3,4,5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //Arrays.binarySearch():sıralı dizilerde ikili arama yapar.
        int[]numbers2={9,2,3,4,5};
        int index = Arrays.binarySearch(numbers2,9);
        System.out.println("Eleman 9un index numarası: "+index);

        //Arrays.copyOfRange():alt dizi oluşturur.
        int[]numbers3={9,2,3,4,5};
        int[]subArray=Arrays.copyOfRange(numbers3,0,3);
        System.out.println(Arrays.toString(subArray));

        //Arrays.equals():karşılaştırma yapar.(2 diziyi)
        int[]array1={1,2,3};
        int[]array2={1,2,3};
        int[]array3={3,2,1};

        boolean result1=Arrays.equals(array1,array2);
        boolean result2=Arrays.equals(array1,array3);

        System.out.println(result1);
        System.out.println(result2);

        //Arrays.fill():dizinin tüm elemanlarını doldurur.
        int[] numbers4=new int[5];
        Arrays.fill(numbers4,9);
        System.out.println(Arrays.toString(numbers4));
        Arrays.fill(numbers4,1,4,20);
        System.out.println(Arrays.toString(numbers4));
    }
}