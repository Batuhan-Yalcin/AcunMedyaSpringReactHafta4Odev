import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistAlfabetikSıralama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();

        System.out.println("Lütfen 10 kelime girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler.add(scanner.nextLine());
        }

        kelimeler.sort((kelime1, kelime2) -> kelime1.toLowerCase().
          compareTo(kelime2.toLowerCase()));


        System.out.println("Alfabetik sıraya göre sıralanan kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

        scanner.close();
    }
}
