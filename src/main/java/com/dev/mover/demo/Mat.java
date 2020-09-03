/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.mover.demo;

import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author muyin
 */
@SpringBootApplication
public class Mat {
    // so this becomes the main spring boot app

    public void ate() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        
        numbers.forEach((b)->{
              System.out.println(b);
        });
        
        numbers.forEach((n) -> {
            System.out.println(n);
        });

    }

}
