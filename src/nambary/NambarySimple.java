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
    
    public NambaryOperations nambaryOperations = new NambaryOperations();
    
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
        
        if(!newOperation.equals(this.operation) && 
                this.nambaryOperations.isValidOperation(newOperation)){
        
            this.operation = newOperation;
            
        }
        
        this.cumulative = this.performCumulation(newValue);
        
    }
    
    private BigDecimal performCumulation(BigDecimal newValue){
        
        BigDecimal cumulation;
    
        switch(this.operation){
            
            case "add": case "addition": case "plus":
                
                cumulation = newValue.add(this.cumulative);
                
            break;
            
            case "subtract":
                
                cumulation = this.cumulative.subtract(newValue);
                
            break;
            
            case "multiply":
                
                cumulation = this.cumulative.multiply(newValue);
                
            break;
            
            case "divide":
                
                if(!newValue.equals(0)){
                
                    cumulation = this.cumulative.divide(newValue);
                    
                }
                
                else{
                
                    cumulation = this.cumulative;
                    
                }
                
            break;
        
            default:
                
                cumulation = newValue;
                
            break;
            
        }
        
        return cumulation;
        
    }
    
}
