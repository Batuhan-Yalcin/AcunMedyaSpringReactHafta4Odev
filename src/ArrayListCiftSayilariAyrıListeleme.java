import java.util.ArrayList;
import java.util.Random;

public class ArrayListCiftSayilariAyrıListeleme {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> ciftSayilar = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            int sayi = random.nextInt(100);
            sayilar.add(sayi);
        }


        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }
        }
        System.out.println("Tüm sayılar: " + sayilar);
        System.out.println("Çift sayılar: " + ciftSayilar);
    }

    }
