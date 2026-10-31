import java.util.ArrayList;
import java.util.Scanner;

public class Fakultet {
    static final int MAX = 60;
    ArrayList<Student> studenti = new ArrayList<>();

    public void unos(Scanner sc) {
        int n;

        do {
            System.out.print("Koliko studenata zelite dodati? ");
            n = sc.nextInt();
            sc.nextLine();

            if (n > MAX) {
                System.out.println("Ne moze toliko, MAX je: " + MAX);
            }

        } while(n > MAX);

        for (int i=0;i<n;i++) {
            Student s = new Student();

            System.out.print("Unesite ime i prezime: ");
            s.ime = sc.nextLine();

            System.out.print("Unesite godine: ");
            s.godine = sc.nextInt();
            sc.nextLine();

            System.out.print("Unesite prosjek: ");
            s.prosjek = sc.nextFloat();
            sc.nextLine();

            studenti.add(s);

        }

    }

    public void ispis() {
        if (studenti.isEmpty()) {
            System.out.println("Nema unesenih  studenata.");
            return;
        }

        for (int i=0;i<studenti.size();i++) {
            Student s = studenti.get(i);
            System.out.println("Ime: " + s.ime +  " | Godine: " + s.godine + " | Prosjek: " + s.prosjek);

        }


    }



}
