package Interface;

public class MainInterface {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandImpl("Indo Copy", 2000, 40);
        HasBrand brand2 = new HasBrandImpl("Tupperware",68000, 120);
        HasBrand brand3 = new HasBrandImpl("Lenovo",38000000, 32);
        String pcs = " Pcs";
        System.out.println("Brand Name\t:"+ brand.getBrand());
        System.out.println("Price\t\t:"+ brand.getPrice());
        System.out.println("Quantity\t:"+ brand.getQuantity() + pcs);
        System.out.println("\nBrand Name\t:"+ brand2.getBrand());
        System.out.println("Price\t\t:"+ brand2.getPrice());
        System.out.println("Quantity\t:"+ brand2.getQuantity() + pcs);
        System.out.println("\nBrand Name\t:"+ brand3.getBrand());
        System.out.println("Price\t\t:"+ brand3.getPrice());
        System.out.println("Quantity\t:"+ brand3.getQuantity() + pcs);
    }
}
