package com.ims.InventoryMgmtSystem.Products;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products getProductById(String id) {
    	 return productRepository.getById(id);
    }

    public Products addProduct(Products products) {
        return productRepository.save(products);
    }

    public Products updateProduct(String id, Products products) {
        Products existingProduct = getProductById(id);
        existingProduct.setItem_no(products.getItem_no());
        existingProduct.setModel_no(products.getModel_no());
        existingProduct.setSupplier_name(products.getSupplier_name());
        existingProduct.setQuantity(products.getQuantity());
        // Set other fields as needed
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}

