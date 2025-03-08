/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nambary;

/**
 *
 * @author Amina Kombo <github.com/KomboAmina>
 */
public class NambaryOperations {
    
    private String[] operations;
    
    public NambaryOperations(){
    
        this.operations = this.getOperations();
        
    }
    
    private String[] getOperations(){
    
        String[] opers = {
            "add","addition","plus",
            "subtract","subtraction","minus",
            "multiply","multiplication","times",
            "divide","division"
            };
        
        return opers;
        
    }
    
    public Boolean isValidOperation(String check){
        
        int total = this.operations.length;
        
        Boolean isValid = false;
        
        if(total > 0){
        
            for(int k = 0; k < total; k++){
            
                if(this.operations[k].equals(check)){
                
                    isValid = true;
                    
                    break;
                    
                }
                
            }
            
        }
     
        return isValid;
        
    }
    
}
