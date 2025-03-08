/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nambary;

/**
 *
 * @author Amina Kombo <github.com/KomboAmina>
 */
import java.math.BigDecimal;

public class NambarySimple {
    
    private static final BigDecimal DEFAULTCUMULATIVE = new BigDecimal(0.0);
    
    private static final String DEFAULTOPERATION = "";
    
    private static final int DEFAULTSIGNVALUE = 1;
    
    public BigDecimal cumulative = this.DEFAULTCUMULATIVE;
    
    public String operation = this.DEFAULTOPERATION;
    
    public int signValue = this.DEFAULTSIGNVALUE;
    
    public void clearAll(){
    
        this.clearCumulative();
        
        this.clearOperation();
        
        this.clearSignValue();
        
    }
    
    public void clearCumulative(){
    
        this.cumulative = this.DEFAULTCUMULATIVE;
        
    }
    
    public void clearOperation(){
    
        this.operation = this.DEFAULTOPERATION;
        
    }
    
    public void clearSignValue(){
    
        this.signValue = this.DEFAULTSIGNVALUE;
        
    }
    
    public void cumulate(BigDecimal newValue, String newOperation){
    
        if(!newOperation.equals(this.operation)){
        
            this.operation = newOperation;
            
        }
        
    }
    
}
