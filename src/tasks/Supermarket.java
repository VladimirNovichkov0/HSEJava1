/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Supermarket {

    private String nameOtdela;
    private String productCode;
    private String name;
    private String country; // Изменил название свойства с "cuntry" на "country" для правильного написания
    private double retailPrice;
    private String nameSource; // Изменил название свойства с "namesource" на "nameSource" для правильного написания

    public Supermarket(String nameOtdela, String productCode, String name, String country, double retailPrice, String nameSource) {
        this.nameOtdela = nameOtdela;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.nameSource = nameSource;
    }

    public String getNameOtdela() {
        return nameOtdela;
    }

    public void setNameOtdela(String nameOtdela) {
        this.nameOtdela = nameOtdela;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getNameSource() {
        return nameSource;
    }

    public void setNameSource(String nameSource) {
        this.nameSource = nameSource;
    }

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
}