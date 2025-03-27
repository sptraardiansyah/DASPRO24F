import java.util.Scanner;
public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        String Mahasiswa[] = new String[100];
        int nilai[] = new int[100];

        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
        do{
            System.out.print("'Masukkan nama antrian: ");
            Mahasiswa[i] = sc.nextLine();

            System.out.print("ada antrian lagi gak?: (y/n) ");
            inputData = sc.nextLine();
            i++;
        }while(i<Mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukkan jumlah data: " + i);

        System.out.println(" ");
        int x=1;
        for (int j = 0; j < Mahasiswa.length; j++){
            if(Mahasiswa[j]!=null){
                System.out.println("------------------------------------------------------------");
                System.out.println("Antrian  ke: "+ (x++));
                System.out.println("Nama antrian: "+Mahasiswa[j]);
               
            }
        }

        System.out.println("\nDaftar antrian: ");
        System.out.println("============================================================");
        System.out.println("No antrian \t Nama antrian");
        System.out.println("------------------------------------------------------------");
        x=1;
        for (int k = 0; k < Mahasiswa.length; k++){
            if (Mahasiswa[k] != null){

                System.out.println((x++) + "\t\t" + Mahasiswa[k] );
            }
            
        }}}
