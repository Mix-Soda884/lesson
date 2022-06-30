public class Main {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i = i * 5) {
            System.out.print(i);
            System.out.println();
            if (i % 20 == 5) {
                i = i * 2;
                System.out.print(i);
                System.out.println();
            } else if (i % 50 == 0) {
                i = i * 2;
                System.out.print(i);
                System.out.println();
            }
        }
    }
}

public class Main{
    public static void main(string[] args){
        int kingaku,siharai,oturi;
        int ans;
        int X_10000;
        int X_5000;
        int X_1000;
        int X_500;
        int X_100;
        int X_50;
        int X_10;
        int X_1;
        System.out.println("金額を入れてください");
        kingaku = new java.util.Scanner(System.in).nextInt();
        System.out.println("支払い金額を入れてください");
        siharai = new java.util.Scanner(System.in).nextInt();
        oturi=kingaku-siharai;
        if(10000/oturi==)
        System.out.println("おつりは"+oturi);
    }
}