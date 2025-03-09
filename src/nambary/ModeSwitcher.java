package nambary;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amina Kombo <github.com/KomboAmina>
 */
public class ModeSwitcher {
    
    private String[] validModes;
    
    public ModeSwitcher(){
    
        this.validModes = this.getValidModes();
        
    }
    
    private String[] getValidModes(){
    
        String[] modes = {
                        "simple","standard","scientific",
                        "converter","simple interest","compound interest",
                        "about"
                        };
        
        return modes;
        
    }
    
    public void switchMode(String newMode){
    
        switch(newMode){
        
            default:
                
                SimpleGUI simpleGUI = new SimpleGUI();
                
                simpleGUI.setVisible(true);
                
            break;
            
        }
        
    }
    
}
