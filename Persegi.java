import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Persegi implements BangunDatar {

    private final int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public String waktu() {
        LocalDateTime waktusekarang = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = waktusekarang.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n";
    }
    public String luas() {
        int luas = sisi * sisi;
        return "Luas persegi adalah: " + luas+ "\n";
    }
    public String keliling() {
        int keliling = 4 * sisi;
        return "Keliling persegi adalah: " + keliling + "\n";
    }

}
