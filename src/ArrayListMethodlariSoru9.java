import java.util.ArrayList;

public class ArrayListMethodlariSoru9 {
    public static void main(String[] args) {
        // GET-> BELİRLİ BİR İNDEXTE Kİ ÖĞEYİ DÖNMEYE YARAR.
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Muz");

        String meyve = meyveler.get(1);
        System.out.println("İndeks 1'deki meyve: " + meyve);
        System.out.println("---------------------------------------");
        // SET -> SET BİR ÖĞEYİ YENİ BİR DEĞER İLE DEĞİŞTİRİR 0 . İNDEXTEKİ İSMİ AHMET YAPTIM.
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Batuhan");
        isimler.add("Şevval");

        isimler.set(0, "Ahmet");
        System.out.println("Güncel isimler : " + isimler);

        System.out.println("---------------------------------------");

        // REMOVE -> Remove methodu belli index değerine sahip bir öğeyi siler A harfi silindi.
        ArrayList<Character> harfler = new ArrayList<>();
        harfler.add('B');
        harfler.add('A');
        harfler.add('C');
        harfler.add('D');

        harfler.remove(1);
        System.out.println("Silme Sonrası Güncel Liste: " + harfler);

        System.out.println("---------------------------------------");

        // Clear -> TÜM LİSTEYİ SİLER.
                ArrayList<Integer> sayilar = new ArrayList<>();
                sayilar.add(58);
               sayilar.add(34);

                sayilar.clear();
                System.out.println("Güncel Liste: " + sayilar);

        System.out.println("---------------------------------------");





            }
        }

