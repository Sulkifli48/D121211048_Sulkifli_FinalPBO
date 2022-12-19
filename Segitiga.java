import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Segitiga implements BangunDatar {

    private final int alas;
    private final int tinggi;
    private final int sisi1;
    private final int sisi2;

    public Segitiga(int alas, int tinggi, int sisi1, int sisi2){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public String waktu() {
        LocalDateTime waktusekarang = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = waktusekarang.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n";
    }
    public String luas() {
        int luas = (alas * tinggi) / 2;
        return "Luas segitiga adalah: " + luas + "\n";
    }
    public String keliling() {
        int keliling = alas + sisi1 + sisi2;
        return "Keliling segitiga adalah: " + keliling + "\n";
    }

}