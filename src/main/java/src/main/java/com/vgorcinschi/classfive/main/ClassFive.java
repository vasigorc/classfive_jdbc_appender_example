package src.main.java.com.vgorcinschi.classfive.main;

import java.util.Scanner;
import static src.main.java.com.vgorcinschi.classfive.util.NumberFormatter.validateDoubleValue;
import src.main.java.com.vgorcinschi.classfive.util.StringValidator;

public class ClassFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = validateDoubleValue(() -> "integer", 2, sc).intValue();
//        System.out.println(number%5==0?"Hi five":(number%2==0)?"Hi even":"");
//       elemenetaryCalc(sc);
        statesProvinces(sc);
    }

    public static boolean twoConditions(Scanner sc) {
        int input = validateDoubleValue(() -> "integer", 2, sc).intValue();
        return input > 0 && input < 100 && input % 3 == 0;
    }

    public static void elemenetaryCalc(Scanner sc) {
        int a, c, d;
        c = (int) (Math.random() * 10);
        d = (int) (Math.random() * 10);
        System.out.println("How much is " + c + " + " + d + " ?");
        a = validateDoubleValue(() -> "first number", 2, sc).intValue();
        System.out.println(a == (c + d) ? "That's right" : "That's not right");
    }

    public static void statesProvinces(Scanner sc) {
        String input = StringValidator.stringValidator((s) -> {
            return s.length() == 2;
        }, () -> "The acronym has to be"
                + " exactly two letters", "province", sc);
//new String[]{"AB", "BC", "MB", "NB", "NL", "NS", "NT",
            //"NU", "ON", "PE", "QC", "SK", "YT"},
        switch (input) {
            case "AB":
                System.out.println("AB for Alberta");
                break;
            case "BC":
                System.out.println("BC for British Columbia");
                break;
            case "MB":
                System.out.println("BC for Manitoba");
                break;
            case "NB":
                System.out.println("NB for New Brunswick");
                break;
            default:
                System.out.println("Province not found");
        }
    }
}
