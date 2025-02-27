import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEnBuyukEnKucukBulma {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(23);
        sayilar.add(5);
        sayilar.add(89);
        sayilar.add(12);
        sayilar.add(45);
        sayilar.add(67);
        sayilar.add(18);
        sayilar.add(99);
        sayilar.add(34);
        sayilar.add(78);

        int enBuyuk = Collections.max(sayilar);
        int enKucuk = Collections.min(sayilar);

        System.out.println("Listedeki Sayılar : " + sayilar);
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

    }
}
