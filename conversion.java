package UNIT1;

public class first {

    public static void main(String[] args) {

        // Octal escape
        System.out.println("\153");   // prints 'k'

        // Valid Unicode escape
        System.out.println("\u0041"); // prints 'A'

        // Number systems
        int binary = 0b010101;   // binary
        int octal = 01234;       // octal
        int hexa = 0x22ff44;     // hexadecimal

        System.out.println("binary " + binary);
        System.out.println("octal " + octal);
        System.out.println("hexa " + hexa);

        // Underscore in number
        int i = 1_12_678;
        System.out.println("i " + i);
    }
}
