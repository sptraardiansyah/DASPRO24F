package Materi;
import java.util.Scanner;
public class Mahasiswa2 {
    public static void main(String[] args) throws Exception {
        String Mahasiswa[] = new String[100];
        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
        do {
            System.out.print("Masukkan Nama Mahasiswa: ");
            Mahasiswa[i] = sc.nextLine();
            System.out.print("Input Data Lagi?: (y/n)");
            inputData = sc.nextLine();
            i++;
        }while(i<Mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("Daftar Mahasiswa:");
        System.out.println("=================");
        System.out.println("No \t\t Nama Mahasiswa");
        System.out.println("======================");
        i=1;
        for (String mhs:Mahasiswa){
            if(mhs!=null){
                System.out.println((i++) + "\t\t + mhs");
            }
        }
    }
}
