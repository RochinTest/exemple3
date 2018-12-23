import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int l = sc.nextInt();
            int k = sc.nextInt();

            if (m + n == l + k)
                System.out.println("true");
            else System.out.println("false");
        }
    }
}
