/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author jstra
 */
public class TipCalculatorManager {
    private TipCalculator cal;
    
   
    
    public double doCalculation(TipCalculator cal){
       return cal.getAmount();
    }
  
    public TipCalculator getCalculator() {
        return cal;
    }

    public void setCalculator(TipCalculator cal) {
        this.cal = cal;
    }
    
}
