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
        
        namSimple.cumulate(new BigDecimal(5.4),"add");
        
        System.out.println(namSimple.cumulative.toString());
        
        System.out.println(namSimple.operation);
        
    }
    
}
