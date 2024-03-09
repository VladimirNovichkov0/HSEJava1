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
    List<Supermarket> supermarketList = new ArrayList<>();
    supermarketList.add(new Supermarket("Grocery", 12345, "Milk", "USA", 2.50, "Farmers Inc."));
    supermarketList.add(new Supermarket("Grocery", 54321, "Bread", "France", 3.00, "Bakery Co."));
    supermarketList.add(new Supermarket("Electronics", 98765, "TV", "Japan", 500.00, "Tech Corp."));

    // Сортировка по цене
    Collections.sort(supermarketList, Comparator.comparingDouble(Supermarket::getRetailPrice));

    System.out.println("Sorted by Retail Price:");
    for (Supermarket item : supermarketList) {
        System.out.println(item.toString());
    }

    // Сортировка по стране
    Collections.sort(supermarketList, Comparator.comparing(Supermarket::getCountry));

    System.out.println("\nSorted by Country:");
    for (Supermarket item : supermarketList) {
        System.out.println(item.toString());
    }
}
}