
package gramer;
import java.util.Scanner;

public class Gramer {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Özne, Nesne ve Yüklem dizileri
        String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
                            "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

        System.out.println("Bir cumle giriniz:");
        String cumle = scanner.nextLine().trim();
        String[] kelimeler = cumle.replaceAll("\\s+", " ").split(" ");

        // Kelimeler dizisindeki ilk kelimenin özne dizisinde olup olmadığının kontrolü
        String ilkKelime = kelimeler[0];
        boolean ozneVarMi = false;
        for (String o : ozne) {
            if (o.equals(ilkKelime)) {
                ozneVarMi = true;
                break;
            }
        }

        // Kelimeler dizisindeki ikinci kelimenin nesne dizisinde olup olmadığının kontrolü
        String ikinciKelime = kelimeler[1];
        boolean nesneVarMi = false;
        for (String n : nesne) {
            if (n.equals(ikinciKelime)) {
                nesneVarMi = true;
                break;
            }
        }

        // Kelimeler dizisindeki üçüncü kelimenin yüklem dizisinde olup olmadığının kontrolü
        String ucuncuKelime = kelimeler[2];
        boolean yuklemVarMi = false;
        for (String y : yuklem) {
            if (y.equals(ucuncuKelime)) {
                yuklemVarMi = true;
                break;
            }
        }

        if (ozneVarMi && nesneVarMi && yuklemVarMi) {
            System.out.println("Evet");
        } else {
            System.out.println("Hayir");
        }
    }
}



    
    
}
