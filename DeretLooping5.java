public class DeretLooping5 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 16; i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}