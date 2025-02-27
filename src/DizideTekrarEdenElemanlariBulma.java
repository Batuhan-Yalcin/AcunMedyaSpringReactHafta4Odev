import java.util.HashSet;
import java.util.Set;

public class DizideTekrarEdenElemanlariBulma {
    public static void main(String[] args) {

        int[] dizi = {5, 3, 8, 3, 1, 5, 8};

        Set<Integer> tekrarEdenler = new HashSet<>();
        Set<Integer> kontrolSeti = new HashSet<>();

        for (int sayi : dizi) {
            if (!kontrolSeti.add(sayi)) {
                tekrarEdenler.add(sayi);
            }
        }

        System.out.println("Tekrar eden sayılar: " + tekrarEdenler);
    }

    }

