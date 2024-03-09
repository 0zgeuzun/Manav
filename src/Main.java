import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyve isimleri ve kilogram fiyatları
        String[] meyveIsimleri = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        double[] kilogramFiyatlari = {2.14, 3.67, 1.11, 0.95, 5.00};

        // Kullanıcının girdiği kilo miktarları
        double[] kiloMiktarlari = new double[meyveIsimleri.length];

        // Kullanıcıdan meyve miktarlarını al
        for (int i = 0; i < meyveIsimleri.length; i++) {
            System.out.print(meyveIsimleri[i] + " Kaç Kilo ? :");
            kiloMiktarlari[i] = scanner.nextDouble();
        }

        // Toplam tutarı hesapla
        double toplamTutar = 0;
        for (int i = 0; i < meyveIsimleri.length; i++) {
            toplamTutar += kiloMiktarlari[i] * kilogramFiyatlari[i];
        }

        // Sonucu ekrana yazdır
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");

        // Scanner'ı kapat
        scanner.close();
    }
}