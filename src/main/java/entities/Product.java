/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rafae
 */
public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    //REFERENCE METHOD COM MÉTODO ESTÁTICO
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    //REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return  name + ", " + String.format("%.2f", price );
    }
    
    
    
    
    
}
