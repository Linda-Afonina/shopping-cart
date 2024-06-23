package pro.sky.shoppingCart;

import java.util.Set;

public class ShoppingCart {

    private final Set<Integer> productId;

    public ShoppingCart(Set<Integer> productId) {
        this.productId = productId;
    }

    public Set<Integer> getProductId() {
        return productId;
    }
}
