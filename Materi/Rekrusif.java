package Materi;

public class Rekrusif {
    public static void main(String[] args) {
        int result = sum(11, 12);
        System.err.println(result);
    }
    public static int sum(int start, int end){
        if (end > start){
            return end + sum(start, end - 1);
        }else{
            return end;
        }
    }
}
