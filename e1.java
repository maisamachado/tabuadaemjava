import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number=100;
        for (int i = 0; i <= number; i++) {
            System.out.println(i % 2 == 0);
            if (i%2==0)
            {
                System.out.print(i);
            }
        }
    }
}
