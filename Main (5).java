/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Comparator;

public class Supermarket {

    private String nameOtdela;
    private String productCode;
    private String name;
    private String country;
    private double retailPrice;
    private String nameSource;

    public Supermarket(String nameOtdela, String productCode, String name, String country, double retailPrice, String nameSource) {
        this.nameOtdela = nameOtdela;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.nameSource = nameSource;
    }

    // Геттеры и сеттеры опущены для краткости

    @Override
    public String toString() {
        return String.format("Supermarket: %s\n" +
                        "Product Code: %s\n" +
                        "Name: %s\n" +
                        "Country: %s\n" +
                        "Retail Price: %.2f\n" +
                        "Name Source: %s",
                nameOtdela, productCode, name, country, retailPrice, nameSource);
    }

    public static void main(String[] args) {
        // Создаем массив объектов Supermarket
        Supermarket[] supermarkets = {
                new Supermarket("Отдел 1", "P1234", "Товар 1", "Россия", 100.0, "Поставщик 1"),
                new Supermarket("Отдел 2", "P5678", "Товар 2", "США", 200.0, "Поставщик 2"),
                new Supermarket("Отдел 3", "P9012", "Товар 3", "Китай", 150.0, "Поставщик 3"),
                new Supermarket("Отдел 4", "P3456", "Товар 4", "Италия", 250.0, "Поставщик 4"),
                new Supermarket("Отдел 5", "P7890", "Товар 5", "Япония", 300.0, "Поставщик 5")
        };

        // Сортировка по цене
        Arrays.sort(supermarkets, Comparator.comparingDouble(Supermarket::getRetailPrice));

        // Печать отсортированного по цене списка
        System.out.println("Отсортировано по цене:");
        for (Supermarket supermarket : supermarkets) {
            System.out.println(supermarket);
        }

        // Сортировка по стране
        Arrays.sort(supermarkets, Comparator.comparing(Supermarket::getCountry));

        // Печать отсортированного по стране списка
        System.out.println("\nОтсортировано по стране:");
        for (Supermarket supermarket : supermarkets) {
            System.out.println(supermarket);
        }
    }
}