package pro.sky.shoppingCart.service;

import java.util.Set;

public interface ShoppingCartService {

    String add(Set<Integer> productId);

    Set<Integer> get();
}
