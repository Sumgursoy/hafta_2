import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numbers=new int[10];
        int sum=0;
        System.out.print("Lütfen on adet sayı giriniz!");
        for(int i=0;i<numbers.length;i++){
            System.out.print("sayı"+(i+1)+": ");
            numbers[i]=scanner.nextInt();
            sum+=numbers[i];
        }
        double average=sum/(double)numbers.length;
        System.out.println("Dizinin ortalaması: "+average);

        System.out.println("50'den büyük olan elemanlar:");
        for(int num : numbers){
            if(num>50){
                System.out.println(num);
            }
        }
    }
}