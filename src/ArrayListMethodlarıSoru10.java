import java.util.Arrays;

public class ArrayListMethodlarıSoru10 {
    public static void main(String[] args) {

        //SORT -> Diziyi küçükten büyüğe, alfabetik sıralar stringse alfabetik int se küçük büyük
        int[] sayilar = {5, 3, 8, 1, 2};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        System.out.println("---------------------------------------------");

        // BİNARYSEARCH -> ARAMA YAPAR VARSA O DEĞER İNDEX NUMARASINI YAZAR.
        int[] sayilar2 = {30,5,58,99,101,44};
        int index = Arrays.binarySearch(sayilar2, 5);
        System.out.println("Bulunan indeks: " + index);

        System.out.println("---------------------------------------------");

        // Arrays.copyofrange -> bir dizide ki 1. indexten 4. indexe kadar kopyaladı
        int[] sayilar3 = {58,34,21,46,6,5};
        int[] yeniDizi = Arrays.copyOfRange(sayilar3, 1, 4);
        System.out.println("Kopyalanan dizi : " + Arrays.toString(yeniDizi));

        System.out.println("---------------------------------------------");

        // .Equals -> Değerleri Karşılaştırır.
        int [] sayilar4 = {58,34,1907};
        int [] sayilar5 = {58,34,1907};

        boolean esitMi = Arrays.equals(sayilar4, sayilar5);
        System.out.println("2 Dizi Birbirine Eşit mi ? : " + esitMi);

        System.out.println("---------------------------------------------");

        // Fill -> Bir Dizinin Tüm öğelerini belirtilen değer ile doldurur.
        int[] sayilar6 = new int[5];
        Arrays.fill(sayilar6, 7);
        System.out.println(Arrays.toString(sayilar6));
    }
}
