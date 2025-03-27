public class NilaiMaksimum {
    public  static int fintMax(int[] arr,int n){
        if (n == 1){
            return arr[0];
        }
        int max0fRest = fintMax(arr, n-1);
        return Math.max(arr[n-1], max0fRest);
    }
    public static void main(String[] args) {
        int[] arr ={7,4,5,2,5,7,9,5};
        int n = arr.length;

        int Max = fintMax(arr, n);

        System.out.println(" Nilai Maksimum Dalam Array " + Max);
    }
}
