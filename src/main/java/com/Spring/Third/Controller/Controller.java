package com.Spring.Third.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Spring.Third.Model.Product;
import com.Spring.Third.Service.ProductService;


//  REST Controller for handling Product-related operations.

@RestController
@RequestMapping("/item")
public class Controller {

    // Service layer dependency
    // Constructor injection is used (best practice)
    private final ProductService ser;

    public Controller(ProductService ser) {
        this.ser = ser;
    }


//      GET API to fetch all products
//      URL: /item/products
//      Method: GET
//      return List of all products
     
    @GetMapping("/products")
    public List<Product> getProducts() {
        return ser.getProduct();
    }

    
//      POST API to add a new product
//      URL: /item/addProduct
//      Method: POST
     
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product) {
        ser.addProduct(product);
    }

    
//     GET API to fetch a single product by ID
//     URL: /item/product/{pID}
//     Method: GET
//     pID Product ID
//     return Product if found, otherwise null
     
    @GetMapping("/product/{pID}")
    public Product getProduct(@PathVariable int pID) {
        return ser.getProductByID(pID);
    }
}
