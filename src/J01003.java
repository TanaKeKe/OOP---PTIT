import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if(a == 0) {
            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else {
            System.out.printf("%.2f",(-b/a));
        }
    }
}
