import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lingkaran implements BangunDatar {
    private final double PI = 3.14;
    private final int r;

    public Lingkaran(int r){
        this.r = r;
    }
    public String waktu() {
        LocalDateTime waktusekarang = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = waktusekarang.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n";
    }
    public String luas() {
        double luas = PI * r * r;
        return "Luas lingkaran adalah: " + luas + "\n";
    }
    public String keliling() {
        double keliling = 2 * PI * r;
        return "Keliling lingkaran adalah: " + keliling + "\n";
    }
}