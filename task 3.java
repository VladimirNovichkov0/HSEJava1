/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[20][20];
        int[] b = new int[400];
        int n, m, i, j, z, k;

        System.out.print("Введите количество строк n=");
        n = input.nextInt();
        System.out.print("Введите количество столбцов m=");
        m = input.nextInt();
        System.out.println("Введите " + n * m + " элементов матрицы:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }
        input.nextLine();
        System.out.println("Матрица:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        System.out.print("Введите заданное значение z=");
        z = input.nextInt();
        System.out.println("Вектор В:");
        k = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i][j] != z) {
                    k++;
                    b[k] = a[i][j];
                    System.out.print(b[k] + " ");
                }
            }
        }
        input.close();
    }
}