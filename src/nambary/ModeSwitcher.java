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
    
    private ScreenSizer sizer = new ScreenSizer();
    
    public ModeSwitcher(){
    
        this.validModes = this.getValidModes();
        
    }
    
    private String[] getValidModes(){
    
        String[] modes = {
                        "simple","standard","scientific",
                        "converter","simple interest","compound interest",
                        "about","soon"
                        };
        
        return modes;
        
    }
    
    public void switchMode(String newMode){
        
        double newX, newY = 0.0;
    
        switch(newMode){
        
            case "simple":
                
                SimpleGUI simpleGUI = new SimpleGUI();
                
                newX = this.sizer.getXPosition(simpleGUI.getWidth());
        
                newY = this.sizer.getYPosition(simpleGUI.getHeight());

                simpleGUI.setLocation((int)newX, (int)newY);
                
                simpleGUI.setVisible(true);
                
            break;
            
            default:
                
                SoonFrame soonFrame = new SoonFrame();
                
                newX = this.sizer.getXPosition(soonFrame.getWidth());
        
                newY = this.sizer.getYPosition(soonFrame.getHeight());

                soonFrame.setLocation((int)newX, (int)newY);
                
                soonFrame.setVisible(true);
                
            break;
            
        }
        
    }
    
}
