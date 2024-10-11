import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTiket = 0,jumlahTiketPelanggan = 0;
        double totalHarga = 0, hargaTiket = 50000, diskon = 0,totalHargaTiket, totalDiskon, hargaAkhir;
        int jumlahPelanggan = 0;
        String pilihan;

        while (true) {
            jumlahPelanggan++;
            System.out.println("Pelanggan ke : " + jumlahPelanggan );
            System.out.println("================================");
            System.out.print ("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiketPelanggan = scanner.nextInt();
            
            if (jumlahTiketPelanggan <= 0) {
                System.out.println("Jumlah tiket tidak valid, silahkan masukkan ulang!");
                jumlahPelanggan--;
                continue;
            }

            if (jumlahTiketPelanggan > 10) {
                diskon = 0.15;
            } else if (jumlahTiketPelanggan > 4) {
                diskon = 0.10;
            }
            
            totalHargaTiket = jumlahTiketPelanggan * hargaTiket;
            totalDiskon = totalHargaTiket * diskon;
            hargaAkhir = totalHargaTiket - totalDiskon;
            
            totalTiket += jumlahTiketPelanggan;
            totalHarga += hargaAkhir;

            System.out.println("Jumlah tiket:" + jumlahTiketPelanggan);
            totalDiskon = totalTiket * hargaTiket - (totalTiket * hargaTiket * diskon);
            
            System.out.print("Apakah ada pelanggan lain? (y/n) : ");
            pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.println("Total pelanggan hari ini: "+ jumlahPelanggan);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total hasil penjualan tiket: Rp " + totalHarga);
        System.out.println("====================================");
        System.out.println("Transaksi selesai");
    }
}
