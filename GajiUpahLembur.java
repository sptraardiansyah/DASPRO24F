import java.util.Scanner;
public class GajiUpahLembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Gaji Bulanan :");
        int GajiBulanan = scanner.nextInt();
        System.out.print("Masukkan Jam Lembur :");
        int JamLembur = scanner.nextInt();
        System.out.print("Masukkan Gaji Perjam :");
        int GajiPerjam = scanner.nextInt();
        if (GajiPerjam > 0) {
            int GajiPerKerja = GajiPerjam * JamLembur + GajiBulanan;
            System.out.println(GajiPerKerja);
        }else {
            System.out.println(" ");
        }

        scanner.close();
    }
}
