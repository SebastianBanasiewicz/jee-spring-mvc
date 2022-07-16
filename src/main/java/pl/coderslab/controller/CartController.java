package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;
import pl.coderslab.model.ProductDao;

import java.util.Random;

@Controller
public class CartController {

    private Cart cart;
//    private ProductDao productDao;

    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    }

//    @Autowired
//    public CartController(ProductDao productDao) { this.productDao = productDao; }


    @GetMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @GetMapping("cart")
    @ResponseBody
    public String cartList() {
        return cart.getCartItems().toString();
    }

//    @GetMapping("product")
//    @ResponseBody
//    public String

}
