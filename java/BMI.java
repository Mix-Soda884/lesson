public class BMI {
public static void main(String[] args) {
                double shincho;
                double taiju;
                double bmi;
                System.out.print("身長[cm]=");
                shincho = new java.util.Scanner(System.in).nextDouble();
                System.out.print("体重[kg]=");
                taiju = new java.util.Scanner(System.in).nextDouble();
                shincho=shincho/100.0;
                bmi=taiju/(shincho*shincho);
                System.out.print("BMI=");
                System.out.println(bmi);
                if(bmi>=25)
                System.out.println("肥満です");
                else
                System.out.println("肥満ではありません");
        }
}
