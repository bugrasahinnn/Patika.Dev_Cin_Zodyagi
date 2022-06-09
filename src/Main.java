import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz: ");
        int yil = inp.nextInt();
        int kalan = yil % 12;

        switch (kalan) {
            case 0:
                System.out.println("Cin Zodyagi Burcunuz : MAYMUN.");
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz : HOROZ.");
                break;
            case 2:
                System.out.println("Cin Zodyagi Burcunuz : KOPEK.");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz : HOROZ.");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz : FARE.");
                break;
            case 5:
                System.out.println("Cin Zodyagi Burcunuz : OKUZ.");
                break;
            case 6:
                System.out.println("Cin Zodyagi Burcunuz : KAPLAN.");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz : TAVSAN.");
                break;
            case 8:
                System.out.println("Cin Zodyagi Burcunuz : EJDERHA.");
                break;
            case 9:
                System.out.println("Cin Zodyagi Burcunuz : YILAN.");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz : AT.");
                break;
            default:
                System.out.println("Cin Zodyagi Burcunuz : KOYUN.");
                break;
        }
    }
}