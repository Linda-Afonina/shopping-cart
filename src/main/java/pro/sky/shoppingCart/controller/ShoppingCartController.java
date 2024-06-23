package pro.sky.shoppingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingCart.service.ShoppingCartService;

import java.util.Set;

@RestController
@RequestMapping("order")
public class ShoppingCartController {

    public final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("add")
    public String addProduct(@RequestParam("id") Set<Integer> productId) {
        return shoppingCartService.add(productId);
    }

    @GetMapping("get")
    public Set<Integer> getShoppingCart() {
        return shoppingCartService.get();
    }
}
