package Interface;

public class HasBrandImpl implements HasBrand {
    private String brandName;
    private Integer price;
    private Integer quantity;

    public HasBrandImpl(String brandName, Integer price, Integer quantity) {
        this.brandName = brandName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }
}
