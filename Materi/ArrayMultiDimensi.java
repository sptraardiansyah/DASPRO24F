package Materi;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
          String kelompok_0_group_0[] = {"Wirya","Daniel","Agnaya","Bintang"};
          String kelompok_0_group_1[] = {"Rahmat","Luis","Yuventus",null};
          String kelompok_1_group_0[] = {"Naufal","Pandu","Putra","Chandra"};
          String kelompok_1_group_1[] = {"Ariel","Charel","Devi","Desur"};
          String kelompok_2_group_0[] = {"Denaia","Wulan","Azizah","Salsa"};
          String kelompok_2_group_1[] = {"Nazwa","Raisya","Mifta","Fajar"};

          String kelompok_0[][] = {
            {"Wirya","Daniel","Agnaya","Bintang"},
            {"Rahmat","Luis","Yuventus",null}
          };
          String kelompok_1[][] = {
            {"Naufal","Pandu","Putra","Chandra"},
            {"Ariel","Charel","Devi","Desur"}
          };
          String kelompok_2[][] = {
            {"Denaia","Wulan","Azizah","Salsa"},
            {"Nazwa","Raisya","Mifta","Fajar"}
          };

          String kelompok[][][] = {
            {
            {"Wirya","Daniel","Agnaya","Bintang"},
            {"Rahmat","Luis","Yuventus",null}
          },
          {
            {"Naufal","Pandu","Putra","Chandra"},
            {"Ariel","Charel","Devi","Desur"}
          },
          {
            {"Denaia","Wulan","Azizah","Salsa"},
            {"Nazwa","Raisya","Mifta","Fajar"}
          }

        };
        System.out.print(kelompok[1][1][2]); //Devi
    }
}
