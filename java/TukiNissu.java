public class Main {
    public static void main(String[] args) {
        int tuki;
        int uruu;
        System.out.println("月の日数を求めます");
        System.out.print("tuki=");
        tuki = new java.util.Scanner(System.in).nextInt();
        switch(tuki){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                System.out.println("31日です");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30日です");
            break;
            case 2:
                System.out.println("うるう年かどうかを入力してください");
                System.out.println("うるう年なら1を, それ以外は0を入力");
                System.out.print("uruu=");
            uruu = new java.util.Scanner(System.in).nextInt();
            System.out.println(28+uruu+"日です");
            break;
            default:
                System.out.println("月が間違いです");
            break;
            }
        }
    }
