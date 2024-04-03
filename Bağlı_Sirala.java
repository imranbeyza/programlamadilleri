package bağlı_sirala;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Node {
    int veri;
    int adres;

    Node(int veri, int adres) {
        this.veri = veri;
        this.adres = adres;
    }
}
public class Bağlı_Sirala{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolunu giriniz: ");
        String dosyaAdi = scanner.nextLine();

        try {
            File file = new File(dosyaAdi);
            List<Node> nodes = okuVeNodeListesiOlustur(file);

            List<Node> kopyaListe = new ArrayList<>(nodes);
            bubbleSort(kopyaListe);

            yazdir(nodes, kopyaListe);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
            e.printStackTrace();
        }
    }

    private static List<Node> okuVeNodeListesiOlustur(File file) throws FileNotFoundException {
        List<Node> nodes = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            int index = 0;
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                nodes.add(new Node(x, index++));
            }
        }
        return nodes;
    }

    private static void bubbleSort(List<Node> list) {
        list.sort(Comparator.comparingInt(node -> node.veri));
    }

    private static void yazdir(List<Node> orijinalListe, List<Node> kopyaListe) {
        System.out.println("Orijinal Veri\t\tOrijinal Adres\t\tSirali Veri\t\tSirali Adres");
        for (int i = 0; i < orijinalListe.size(); i++) {
            System.out.println(orijinalListe.get(i).veri + "\t\t\t" + orijinalListe.get(i).adres +
                    "\t\t\t" + kopyaListe.get(i).veri + "\t\t\t" + kopyaListe.get(i).adres);
        }
    }
}
