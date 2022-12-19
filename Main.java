import java.io.*;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu(){

        System.out.println("=========================================");
        System.out.println("| Hitung Luas dan Keliling Bangun Datar |");
        System.out.println("=========================================");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Keluar\n");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("Masukan Pilihan Menu : ");
            String input = bufferedReader.readLine();

            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                mainMenu();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    persegi();
                } else if (numberOfString == 2) {
                    segitiga();
                } else if (numberOfString == 3) {
                    lingkaran();
                } else if (numberOfString == 4) {
                    System.out.println("\nThank You For Using This Application.\n");
                } else {
                    System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
                    mainMenu();
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
            mainMenu();
        }
    }

    private static void persegi() {
        char coba;

        do {
            System.out.println("=========================================");
            System.out.println("||       PERHITUNGAN LUAS PERSEGI      ||");
            System.out.println("=========================================");
            System.out.print("Masukkan panjang persegi: ");
            int sisi = scanner.nextInt();
            BangunDatar myPersegi = new Persegi(sisi);

            try {
                File myObj = new File("D:\\Persegi.txt");
                myObj.createNewFile();

                FileWriter myWriter = new FileWriter("D:\\Persegi.txt", true);
                myWriter.write(myPersegi.waktu());
                myWriter.write(myPersegi.luas());
                myWriter.write(myPersegi.keliling());
                myWriter.close();
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            System.out.println("");
            System.out.print(myPersegi.waktu());
            System.out.print(myPersegi.luas());
            System.out.print(myPersegi.keliling());

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }


    private static void segitiga() {
        char coba;

        do {
            System.out.println("==========================================");
            System.out.println("||       PERHITUNGAN LUAS SEGITIGA      ||");
            System.out.println("==========================================");
            System.out.print("Masukkan alas segitiga: ");
            int alas = scanner.nextInt();
            System.out.print("Masukkan tinggi segitiga: ");
            int tinggi = scanner.nextInt();
            System.out.print("Masukkan sisi pertama segitiga: ");
            int sisi1 = scanner.nextInt();
            System.out.print("Masukkan sisi kedua segitiga: ");
            int sisi2 = scanner.nextInt();
            BangunDatar mySegitiga = new Segitiga(alas, tinggi, sisi1, sisi2);

            try {
                File myObj = new File ("D:\\Segitiga.txt");
                myObj.createNewFile();

                FileWriter myWriter = new FileWriter("D:\\Segitiga.txt", true);
                myWriter.write(mySegitiga.waktu());
                myWriter.write(mySegitiga.luas());
                myWriter.write(mySegitiga.keliling());
                myWriter.close();

            } catch(IOException e) {
                e.printStackTrace();
            }
            System.out.println("");
            System.out.print(mySegitiga.waktu());
            System.out.print(mySegitiga.luas());
            System.out.print(mySegitiga.keliling());

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void lingkaran() {
        char coba;

        do {
            System.out.println("===========================================");
            System.out.println("||       PERHITUNGAN LUAS LINGKARAN      ||");
            System.out.println("===========================================");
            System.out.print("Masukkan nilai untuk jari-jari: ");
            int r = scanner.nextInt();
            BangunDatar myLingkaran = new Lingkaran(r);

            try {
                File myObj = new File ("D:\\Lingkaran.txt");
                myObj.createNewFile();

                FileWriter myWriter = new FileWriter("D:\\Lingkaran.txt", true);
                myWriter.write(myLingkaran.waktu());
                myWriter.write(myLingkaran.luas());
                myWriter.write(myLingkaran.keliling());
                myWriter.close();

            } catch(IOException e) {
                e.printStackTrace();
            }

            System.out.println("");
            System.out.print(myLingkaran.waktu());
            System.out.print(myLingkaran.luas());
            System.out.print(myLingkaran.keliling());

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

}
