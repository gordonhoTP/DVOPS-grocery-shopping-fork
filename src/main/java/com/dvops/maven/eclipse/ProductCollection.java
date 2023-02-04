package com.dvops.maven.eclipse;

import java.util.*;

public class ProductCollection {

    private ArrayList<Product> products = new ArrayList<>();
    private int capacity;

    public ProductCollection() {
    	/*products.add(new Product("0001","good 4 u","Olivia Rodrigo",3.59));
    	products.add(new Product("0002","Peaches","Justin Bieber",3.18));
    	products.add(new Product("0003","MONTERO","Lil Nas X",2.3));
    	products.add(new Product("0004","bad guy","Billie Eilish",3.14));*/

        this.capacity = 20;
    }

    public ProductCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
    	if(products.size() != capacity) {
    		products.add(product);
    	}
    }
    
    public ArrayList<Product> sortProductsByTitle() {         
        Collections.sort(products, Product.titleComparator);         
        return products;     
    } 
    
    public ArrayList<Product> sortProductsByPrice() {         
        Collections.sort(products, Product.productPriceComparator);         
        return products;     
    } 
    
    public Product findProductsById(String id) {
    	for (Product p : products) { 		      
            if(p.getId().equals(id)) return p;
       }
    	return null;
    }

    public Product findProductByTitle(String title) {
    	for (Product p : products) { 		      
            if(p.getTitle().equals(title)) return p;
       }
    	return null;
    }
}
