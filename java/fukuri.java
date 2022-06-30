public class fukuri {
    public static void main(String[] args) {
        int nensu;
        double gankin, ganri, riritu;
        System.out.print("元金[円]＝");
        gankin = new java.util.Scanner(System.in).nextDouble();
        System.out.print("利率[%]＝");
        riritu = new java.util.Scanner(System.in).nextDouble();
        System.out.print("年数[年]＝");
        nensu = new java.util.Scanner(System.in).nextInt();
        ganri=gankin;
        for(int i=1; i<=nensu; i++){
            ganri=ganri*(1+riritu*0.01);
            System.out.println(i+"年後の元利合計＝"+ganri);
        }
    }
}
