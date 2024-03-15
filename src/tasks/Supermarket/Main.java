// package local.vladimirnovichkov;

public class Main {
    public static void main(String[] args) {
       Supermarket var1 = new Supermarket("Лента", "025", "Яблоко", "Россия", 500.50, "Солнышко");
       System.out.println(var1.toString());
    }
    public static class Supermarket {

    private String nameOtdela;
    private String productCode;
    private String name;
    private String country; // Изменил название свойства с "cuntry" на "country" для правильного написания
    private double retailPrice;
    private String NameSuplier; // Изменил название свойства с "NameSuplier" на "NameSuplier" для правильного написания

    public Supermarket(String nameOtdela, String productCode, String name, String country, double retailPrice, String NameSuplier) {
        this.nameOtdela = nameOtdela;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.NameSuplier = NameSuplier;
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

    public String getNameSuplier() {
        return NameSuplier;
    }

    public void setNameSuplier(String NameSuplier) {
        this.NameSuplier = NameSuplier;
    }

    @Override
    public String toString() {
        return String.format("Supermarket: %s\n" +
                        "Product Code: %s\n" +
                        "Name: %s\n" +
                        "Country: %s\n" +
                        "Retail Price: %.2f\n" +
                        "Name Source: %s",
                nameOtdela, productCode, name, country, retailPrice, NameSuplier);
    }
}
}