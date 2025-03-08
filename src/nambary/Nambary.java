/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nambary;

/**
 *
 * @author Amina Kombo <github.com/KomboAmina>
 */
import java.math.BigDecimal;

public class Nambary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NambarySimple namSimple = new NambarySimple();
        
        System.out.println(namSimple.cumulative.toString());
        
        namSimple.cumulate(new BigDecimal(0.0),"add");
        
        namSimple.cumulate(new BigDecimal(1),"add");
        
        namSimple.cumulate(new BigDecimal(15.75),"add");
        
        namSimple.cumulate(new BigDecimal(3.25),"add");
        
        namSimple.cumulate(new BigDecimal(1),"");
        
        System.out.println(namSimple.cumulative.toString());
        
        System.out.println(namSimple.operation);
        
    }
    
}
