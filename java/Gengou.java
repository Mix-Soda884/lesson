public class Main{
    public static void main(String[] args) {
        int nensuu;
        System.out.println("年数を入れてください");
        nensuu = new java.util.Scanner(System.in).nextInt();
        if(1926<=nensuu && nensuu<1989)
        System.out.println("昭和です");
        else if(1989<=nensuu && nensuu<2019)
        System.out.println("平成です");
        else if(2019<=nensuu)
        System.out.println("令和です");
        else
        System.out.println("大正以前です");
    }
}
