package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int s = 0;
        while (n != 0) {
            s = s + (n % 10);
            n = n / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        int n = unos.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}

