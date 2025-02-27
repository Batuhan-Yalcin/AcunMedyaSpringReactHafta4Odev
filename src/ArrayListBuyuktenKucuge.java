import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListBuyuktenKucuge {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("Lütfen 10 adet sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar.add(scanner.nextInt());
        }

        Collections.sort(sayilar, Collections.reverseOrder());


        System.out.println("Büyükten küçüğe sıralanan sayılar:");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

        scanner.close();
    }
}
