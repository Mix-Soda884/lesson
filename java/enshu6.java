public class Main {
    public static void main(String[] args) {
        double hankei;
        double menseki;
        System.out.print("半径＝");
        hankei=new java.util.Scanner(System.in).nextDouble();
        menseki = hankei*hankei;
        System.out.print("面積＝"+menseki+"π");
    }
}

public class Main {
    public static void main(String[] args) {
        int ji, fun, byo;
        int fun2, byo2,byo3;
        int byosu;
        System.out.print("時＝");
        ji=new java.util.Scanner(System.in).nextInt();
        System.out.print("分＝");
        fun=new java.util.Scanner(System.in).nextInt();
        System.out.print("秒＝");
        byo=new java.util.Scanner(System.in).nextInt();
        //ここに計算式を入れること
        fun2=ji*60;
        byo2=fun*60;
        byo3=fun2*60;
        byosu=byo+byo2+byo3;
        System.out.println("秒数＝"+byosu);
    }
}

public class Main {
    public static void main(String[] args) {
        int byosu;
        int ji, fun, byo;
        System.out.print("秒数＝");
        byosu=new java.util.Scanner(System.in).nextInt();
        ji=byosu/3600;
        fun=(byosu/60)-(60*ji);
        byo=byosu%60;
        //ここに計算式を入れること
        System.out.println("時＝"+ji);
        System.out.println("分＝"+fun);
        System.out.println("秒＝"+byo);
    }
}

public class Main {
    public static void main(String[] args) {
        int ji, fun, byo, byosu;
        int byo2, byo3, fun2;
        double byosoku, jisoku, kyori;
        kyori = 41.195;
        System.out.print("時＝");
        ji=new java.util.Scanner(System.in).nextInt();
        System.out.print("分＝");
        fun=new java.util.Scanner(System.in).nextInt();
        System.out.print("秒＝");
        byo=new java.util.Scanner(System.in).nextInt();
        //ここに計算式を入れること
        fun2=ji*60;
        byo2=fun*60;
        byo3=fun2*60;
        byosu=byo+byo2+byo3;
        byosoku = (kyori*1000)/byosu;
        jisoku = kyori/ji;
        System.out.println("秒速＝"+byosoku+"m/s");
        System.out.println("時速＝"+jisoku+"km/h");
    }
}
