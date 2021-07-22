/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import util.PriceUpdate;

/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        //EXPRESSÃO LAMBDA INLINE
        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        list.forEach(System.out::println);
        
        
        
        /*EXPRESSÃO LAMDA DECLARADA
        double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        
        list.forEach(cons);
        list.forEach(System.out::println);
        */
        
        /*REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
        list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);
        */
        
        /*REFERENCE METHOD COM MÉTODO ESTÁTICO
        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);
        */
        
        /* IMPLEMENTAÇÃO DA INTERFACE
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
*/
    
}
}

