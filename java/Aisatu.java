public class Main{
    public static void main(String[] args) {
        int jikan;
        System.out.println("時間を入力してください");
        jikan = new java.util.Scanner(System.in).nextInt();
        if(0<=jikan && jikan<6)
            System.out.println("こんばんは");
        else if (6<=jikan && jikan<12)
            System.out.println("おはよう");
        else if (12<=jikan && jikan<18)
            System.out.println("こんにちは");
        else if(18<=jikan && jikan<25)
            System.out.println("こんばんは");
        else if(25<=jikan)
            System.out.println("間違いです");
    }
}
