package entities;

public class Item {
    private Product product;
    public Item(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
