public class Main {
    public static void main(String[] args) {
        int[]arr={1,2,3,-1,-2,-3};
        int positivesum=0;
        int negativesum=0;

        for(int num:arr){
            if(num>0){
                positivesum+=num;
            }
            else if(num<0){
                negativesum+=num;
            }

        }
        System.out.println("Pozitif sayıların toplamı: "+positivesum);
        System.out.println("Negatif sayıların toplamı: "+negativesum);
    }
}