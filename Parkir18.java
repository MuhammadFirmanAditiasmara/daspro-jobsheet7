
import java.util.Scanner;

public class Parkir18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.print("Masukkan Jenis Kendaraan (1. mobil, 2. motor, 0.keluar) = ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi = ");
                durasi = input.nextInt();
                if (jenis > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);
        input.close();
        System.out.println("Total yang harus dibayar adalah Rp " + total);
    }
}
