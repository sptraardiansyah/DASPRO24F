package Materi;

public class Mahasiswa {
    public static void main(String[] args) {
        String Mahasiswa [] = new String [5];
        Mahasiswa [0] = "Abdullah";
        Mahasiswa [1] = "Muhammad";
        Mahasiswa [2] = "Rizky";
        Mahasiswa [3] = "Budi";
        Mahasiswa [4] = "Joko";
        int Number[] = {1,2,5,9,11,15,20,25,30,35};

        System.out.println(Number.length); //Panjang Array Number
        System.out.println(Mahasiswa[3]); //Budi

        //Menampilkan semua data mahasiswa yang ada di Array
        for (int i=0; i<Mahasiswa.length; i++){
            System.out.println(Mahasiswa[i]);
        }
    }
}