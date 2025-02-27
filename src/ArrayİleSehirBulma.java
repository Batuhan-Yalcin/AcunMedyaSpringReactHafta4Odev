import java.util.ArrayList;
import java.util.Scanner;

public class ArrayİleSehirBulma {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Sivas");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Manisa");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir şehir giriniz: ");
        String girilenSehir = scanner.nextLine();

        int indeks = sehirler.indexOf(girilenSehir);

        if (indeks != -1) {
            System.out.println(girilenSehir + " şehri listede var İndeks Numarası : " + indeks);
        } else {
            System.out.println(girilenSehir + " şehri listede bulunmamaktadır.");
        }

        scanner.close();

    }
}
