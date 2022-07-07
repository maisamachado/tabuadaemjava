import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInteiro = 10;

        int i;

        for(i = 0; i < numeroInteiro; i++); {
            System.out.print("Escreva o numero que deseja saber a tabuada: ");
            i = input.nextInt();
            System.out.println("Tabuada do: " + i);
            System.out.println(i + " X 1 = " + i);
            System.out.println(i + " X 2 = " + i * 2);
            System.out.println(i + " X 3 = " + i * 3);
            System.out.println(i + " X 4 = " + i * 4);
            System.out.println(i + " X 5 = " + i * 5);
            System.out.println(i + " X 6 = " + i * 6);
            System.out.println(i + " X 7 = " + i * 7);
            System.out.println(i + " X 8 = " + i * 8);
            System.out.println(i + " X 9 = " + i * 9);
            System.out.println(i + " X 10 = " + i * 10);
        }
    }
}
