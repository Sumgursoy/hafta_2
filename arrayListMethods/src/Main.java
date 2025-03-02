import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Phyton");
        list.add("C#");
//listeye erişmek için get kullanılır.
        String language = list.get(0);
        System.out.println(language);
//belirtilen indixteki elemanı değiştirir.
        list.set(1, "Javacsript");
        System.out.println(list);
//beliritlen indixteki elemanı siler.
        list.remove(2);
        System.out.println(list);
//listeyi siler.
        list.clear();
//listedeki eleman sayısını gösterir.
        int size=list.size();
        System.out.println("Liste boyutu: "+size);
    }
}