package GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());

        Box<String> box = new Box<> ();

        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine ();
            box.addElement (string);
        }
        String element = scanner.nextLine ();
        System.out.println (box.countGrater (element));
    }
}
