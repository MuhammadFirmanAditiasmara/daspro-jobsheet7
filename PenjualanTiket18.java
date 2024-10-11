
import java.util.Scanner;

/**
 * PenjualanTiket18
 */
public class PenjualanTiket18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTiket, hargaTiket = 50000;
        double totalBayar = 0;
        float diskon;
        do {
            System.out.print("Jumlah tiket yang dibeli: ");
            totalTiket = input.nextInt();
            if (totalTiket < 0) {
                System.out.println("Masukkan kembali jumlah tiket dengan benar!");
                continue;
            }
            if (totalTiket > 4 && totalTiket <= 10) {
                diskon = 0.1f;
                totalBayar = totalTiket * hargaTiket - (totalTiket * hargaTiket * diskon);
            } else if (totalTiket > 10) {
                diskon = 0.15f;
                totalBayar = totalTiket * hargaTiket - (totalTiket * hargaTiket * diskon);
            } else {
                totalBayar = totalTiket * hargaTiket;
            }
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
            break;

        } while (true);
    }
}
