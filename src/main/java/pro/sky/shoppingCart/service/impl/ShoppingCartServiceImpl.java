package pro.sky.shoppingCart.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shoppingCart.service.ShoppingCartService;

import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {

    Set<Integer> shoppingCart = new HashSet<>();

    @Override
    public String add(Set<Integer> productId) {
        shoppingCart.addAll(productId);
        return "Товары " + productId + " успешно добавлены. Ваша корзина: " + shoppingCart;
    }

    @Override
    public Set<Integer> get() {
        return new HashSet<>(shoppingCart);
    }
}
