public class Main{
    public static void main(String[] args) {
        int nensuu;
        System.out.println("年数を入力してください");
        nensuu = new java.util.Scanner(System.in).nextInt();
        if(nensuu%4!=0)
            System.out.println("平年です");
        else if(nensuu%100!=0)
            System.out.println("うるう年です");
        else if(nensuu%400!=0)
            System.out.println("うるう年です");
        else
            System.out.println("うるう年です");
    }
}
