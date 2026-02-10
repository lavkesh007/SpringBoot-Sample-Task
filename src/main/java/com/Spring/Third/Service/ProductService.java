package com.Spring.Third.Service;

import com.Spring.Third.Model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private List<Product> list = new ArrayList<>(
            Arrays.asList(
                    new Product(1, "HeadPhone", "Good Quality"),
                    new Product(2, "Phone", "Good Processor")
            )
    );

    
//      Add a new product to the list
   
    public void addProduct(Product prod) {
        list.add(prod);
    }

//    Get product by ID
    public Product getProductByID(int id) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

//    Get all products
    public List<Product> getProduct() {
        return list;
    }
}