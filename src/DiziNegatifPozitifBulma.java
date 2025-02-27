public class DiziNegatifPozitifBulma {
    public static void main(String[] args) {

        int [] sayilar = {5,-3,8,10,-99,22,58,-58,15};
        int pozitifToplam = 0;
        int negatifToplam = 0;

        for (int sayi : sayilar) {
            if(sayi> 0)
            {
               pozitifToplam += sayi;
            }
            else {
                negatifToplam+=sayi;
            }
        }
        System.out.println("Pozitif Sayıların Toplamı : "+pozitifToplam);
        System.out.println("Negatif Sayıların Toplamı : "+negatifToplam);
    }
}
