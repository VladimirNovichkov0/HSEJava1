public class Supermarket {
    private String nameOfDepartment;
    private int productCode;
    private String name;
    private String country;
    private double retailPrice;
    private String supplier;

    public Supermarket(String nameOfDepartment, int productCode, String name, String country, double retailPrice, String supplier) {
        this.nameOfDepartment = nameOfDepartment;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.supplier = supplier;
    }

    // Геттеры и сеттеры
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Supermarket: \n" +
                "Name of Department: " + nameOfDepartment + "\n" +
                "Product Code: " + productCode + "\n" +
                "Name: " + name + "\n" +
                "Country: " + country + "\n" +
                "Retail Price: " + retailPrice + "\n" +
                "Supplier: " + supplier;
    }

    public static void main(String[] args) {
        Supermarket item = new Supermarket("Grocery", 12345, "Milk", "USA", 2.50, "Farmers Inc.");
        System.out.println(item.toString());
    }
}