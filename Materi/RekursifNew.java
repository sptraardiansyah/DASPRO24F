package Materi;

public class RekursifNew {
    public static int sum(int n) {
        if (n == 1) {
            System.out.println("1 ");
            return 1;
        }else {
            System.out.println(n+" x ");
            return n * sum(n-1);
        }
    }


public static void main(String[] args){
    int n = 10;
    int result = sum(n);
    System.out.println("= "+result);
}
}