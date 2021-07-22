/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Product;
import java.util.function.Consumer;

/**
 *
 * @author rafae
 */
public class PriceUpdate implements Consumer<Product> {
//IMPLEMENTAÇÃO DA INTERFACE
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
}
