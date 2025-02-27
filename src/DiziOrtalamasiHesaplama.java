import java.util.Scanner;

public class DiziOrtalamasiHesaplama {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int [] sayilar = new int[10];
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println((i+1)+".Sayıyı Giriniz : ");
            sayilar[i] = scanner.nextInt();
            toplam += sayilar[i];
        }

        double ortalama = (double) toplam / 10;
        System.out.println("Dizinin Ortalaması : "+ortalama);

        System.out.println("Dizideki 50 den büyük sayılar : ");
        for(int sayi : sayilar){
            if(sayi>50)
            {
                System.out.println(sayi + " ");
            }
        }
        scanner.close();

    }
}
