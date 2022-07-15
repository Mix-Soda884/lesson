package java;
public class Main {
    public static void main(String[] args) {
        double x,y;
        System.out.println("円の半径を入力してください");
        System.out.print("x=");
        x = new java.util.Scanner(System.in).nextDouble();
        y = circle(x);
        System.out.println("円周率は" + y);

    }
    public static double circle(double x){
        return (x*x)*3.14;
    }
}

public class Main {
    public static void main(String[] args) {
        double A, B, C, s;
        System.out.println("三角形の面積を求めます");
        System.out.print("最も長い辺A=");
        A = new java.util.Scanner(System.in).nextDouble();
        System.out.print("辺B=");
        B = new java.util.Scanner(System.in).nextDouble();
        System.out.print("辺C=");
        C = new java.util.Scanner(System.in).nextDouble();
        if (A < B + C) {
            s = triangle(A, B, C);
            System.out.println("三角形の面積=" + s);
        } else {
            System.out.println("-1");
        }
    }

    public static double triangle(double A, double B, double C) {
        return Math.sqrt(A + B + C) * (-A + B + C) * (A - B + C) * (A + B - C) / 4;
    }
}