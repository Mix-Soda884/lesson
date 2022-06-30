public class Main{
    public static void main(String[] args){
        int n, wa, mokuhyo;
        System.out.println("1からnまでの整数の和");
        System.out.print("目標値＝");
        mokuhyo = new java.util.Scanner(System.in).nextInt();
        n=0;
        wa=0;
        while(mokuhyo>=wa){
            n++;
            wa+=n;
        }
        System.out.println(n+"までの和＝"+wa);
    }
}
