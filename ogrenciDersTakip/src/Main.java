import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] notlar =new int[5];
        int toplam =0;
        int enYuksek=0;
        int enDusuk=100;
        Boolean dusukNotVar=false;

        for(int i=0;i<5;i++){
            System.out.print("Lütfen"+(i+1)+" . notu giriniz.");
            notlar[i]=scan.nextInt();
            toplam+=notlar[i];

            if(notlar[i]<30){
                dusukNotVar=true;
            }
            if(notlar[i]<enDusuk){
                enDusuk=notlar[i];
            }
            if(notlar[i]>enYuksek){
                enYuksek=notlar[i];
            }

        }
        double ortalama=(double) toplam/5;
        System.out.println("Ortalamanız: "+ortalama);
        System.out.println("En yüksek notunuz: "+enYuksek);
        System.out.println("En düşük notunuz: "+enDusuk);

        if(ortalama>=50){
            System.out.println("Tebrikler,Geçtiniz!");

        }
        else{
            System.out.println("Kaldınız!");
        }
        if(dusukNotVar){
            System.out.println("Düşük not aldığınız dersler var.");
        }
        scan.close();

    }
}