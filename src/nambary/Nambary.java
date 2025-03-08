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
    
    public String[] modes;
    
    public String defaultMode;
    
    public Nambary(){

        this.modes = this.getModes();
        
        this.defaultMode = this.getDefaultMode();
    
    }
    
    private String[] getModes(){
    
        String[] modes = {
                        "simple","standard","scientific",
                        "converter","simple interest","compound interest"
                        };
        
        return modes;
        
    }
    
    private String getDefaultMode(){
    
        int total = this.modes.length;
        
        String defaultMode = "simple";
        
        if(total > 0){
        
            defaultMode = this.modes[0];
            
        }
        
        return defaultMode;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleGUI simple = new SimpleGUI();
        
        simple.setVisible(true);
        
        /*NambarySimple namSimple = new NambarySimple();
        
        System.out.println(namSimple.cumulative.toString());
        
        namSimple.cumulate(new BigDecimal(0.0),"add");
        
        namSimple.cumulate(new BigDecimal(1),"add");
        
        namSimple.cumulate(new BigDecimal(15.75),"add");
        
        namSimple.cumulate(new BigDecimal(3.25),"add");
        
        namSimple.cumulate(new BigDecimal(1),"");
        
        namSimple.cumulate(new BigDecimal(5),"subtract");
        
        namSimple.cumulate(new BigDecimal(4),"multiply");
        
        namSimple.cumulate(new BigDecimal(16),"divide");
        
        System.out.println(namSimple.cumulative.toString());
        
        System.out.println(namSimple.operation);*/
        
    }
    
}
