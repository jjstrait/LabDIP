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
public class CalculatorManager {
    private Calculator cal;
    
    public CalculatorManager(Calculator cal) {
        this.cal = cal;
    }
    
    public void doCalculation(){
        cal.getAmount();
    }
  
    public Calculator getCalculator() {
        return cal;
    }

    public void setCalculator(Calculator cal) {
        this.cal = cal;
    }
    
}
