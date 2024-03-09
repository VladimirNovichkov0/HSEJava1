/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import static java.lang.Math.tan;
import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        if (a * b > 100.0) {
            System.out.print(3.0 * tan(b) + " " + sin(b));
        } else {
            System.out.print(5.0 * a);
        }
        scanner.close();
    }
}