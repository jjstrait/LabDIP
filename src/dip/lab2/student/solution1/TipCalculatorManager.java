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
    private TipCalculator calc;
    
   public TipCalculatorManager(TipCalculator calc){
       this.calc = calc;
   }
    
    public double getTip(){
       return calc.getTip();
    }
  
    public final TipCalculator getCalculator() {
        return calc;
    }

    public final void setCalculator(TipCalculator cal) {
        this.calc = cal;
    }
    
}
