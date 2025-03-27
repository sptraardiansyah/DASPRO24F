public class DeretLooping3 {
    public static void main(String[] args) {
        int o = 1, p=0;
        while (o<=211){
            System.out.print(o + " ");
            o = o + p;
            p = p + 2;
        }
    }
}