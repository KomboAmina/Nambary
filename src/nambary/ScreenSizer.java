/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nambary;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Amina Kombo <github.com/KomboAmina>
 */
public class ScreenSizer {
    
    public double screenWidth;
    
    public double screenHeight;
    
    public ScreenSizer(){
    
        this.setScreenDimensions();
        
    }
    
    private void setScreenDimensions(){
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        this.screenHeight = screenSize.getHeight();
        
        this.screenWidth = screenSize.getWidth();
        
    }
    
    public double getXPosition(double horizontalWidth){
    
        return (this.screenWidth - horizontalWidth) / 2;
        
    }
    
    public double getYPosition(double verticalHeight){
    
        return (this.screenHeight - verticalHeight) /2;
        
    }
    
    
}
