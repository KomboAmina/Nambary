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
import java.math.RoundingMode;

public class NambarySimple {
    
    private static final BigDecimal DEFAULTCUMULATIVE = new BigDecimal(0.0);
    
    private static final String DEFAULTOPERATION = "";
    
    private static final int DEFAULTSIGNVALUE = 1;
    
    public NambaryOperations nambaryOperations = new NambaryOperations();
    
    public BigDecimal cumulative = this.DEFAULTCUMULATIVE;
    
    public String operation = this.DEFAULTOPERATION;
    
    public int signValue = this.DEFAULTSIGNVALUE;
    
    public Boolean isInfinity = false;
    
    public void clearAll(){
    
        this.clearCumulative();
        
        this.clearOperation();
        
        this.clearSignValue();
        
        this.clearInfinity();
        
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
    
    public void clearInfinity(){
    
        this.isInfinity = false;
        
    }
    
    public void cumulate(BigDecimal newValue, String newOperation){
        
        if(!newOperation.equals(this.operation) && 
                this.nambaryOperations.isValidOperation(newOperation)){
        
            this.operation = newOperation;
            
        }
        
        this.cumulative = this.performCumulation(newValue);
        
    }
    
    private BigDecimal performCumulation(BigDecimal newValue){
        
        BigDecimal cumulation = new BigDecimal("1");
    
        switch(this.operation){
            
            case "add": case "addition": case "plus":
                
                cumulation = newValue.add(this.cumulative);
                
            break;
            
            case "subtract":
                
                cumulation = this.cumulative.subtract(newValue);
                
            break;
            
            case "multiply": case "multiplication":
                
                cumulation = this.cumulative.multiply(newValue);
                
            break;
            
            case "divide": case "division":
                
                if(this.cumulative.equals(new BigDecimal(0))){
                
                    if(newValue.equals(new BigDecimal(0))){
                    
                        cumulation = new BigDecimal(1);
                        
                    }
                    
                    else{
                    
                        cumulation = new BigDecimal(0);
                        
                    }
                    
                }
                
                else{
                    
                    Long longzero = new Long("0");
                    
                    BigDecimal zero = BigDecimal.valueOf(longzero);
                
                    if(newValue.equals(zero)){
                    
                        cumulation = newValue;
                        
                        this.isInfinity = true;
                        
                    }
                    
                    else{
                    
                        cumulation = this.cumulative.divide(newValue,5, RoundingMode.CEILING);
                        
                    }
                    
                }
                
            break;
        
            default:
                
                cumulation = newValue;
                
            break;
            
        }
        
        return cumulation;
        
    }
    
}
