import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fakultet fakultet = new Fakultet();
        int izbor;
        do {
            System.out.println("----- MENI -----");
            System.out.println("1. Unos podataka.");
            System.out.println("2. Ispis podataka.");
            System.out.println("0. Izlaz iz programa.");
            System.out.print("Birate opciju: ");
            izbor = sc.nextInt();
            sc.nextLine();

            switch(izbor) {
                case 1:
                    fakultet.unos(sc);
                    break;
                case 2:
                    fakultet.ispis();
                    break;
            }

        } while(izbor!=0);
        sc.close();
    }

}
