/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 15;

        double max = Math.max(a, b);
        double min = Math.min(a, b);
        double d = max - 2 * Math.sqrt(min) + (4.2 * min) / (1 + (max / min));

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("d: " + d);
    }
}
