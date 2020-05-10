package com.ecommerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @RequestMapping("/")
    @ResponseBody
    public String listProducts() {
        return "List of all products";
    }

    @RequestMapping(value= "/product")
    @ResponseBody
    public String listProduct() {
        return "This is a product";
    }
}
