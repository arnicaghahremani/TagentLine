import java.util.Scanner;

public class TangentLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x نقطه تماس را وارد کنید: ");
        int x = sc.nextInt();

        int y = x * x;

        int m = 2 * x;

        System.out.println("نقطه تماس: (" + x + "," + y + ")");
        System.out.println("شیب خط مماس: " + m);
        System.out.println("معادله خط مماس:");
        System.out.println("y - " + y + " = " + m + "(x - " + x + ")");

        sc.close();
    }
}
