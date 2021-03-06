package dip.lab2.student.solution1;

// An useful import if you need it.


import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    
    
    public static void main(String[] args) {
        TipCalculator person1 = new FoodServiceTipCalculator(ServiceQuality.GOOD,78.95);
        TipCalculator person2 = new BaggageServiceTipCalculator(ServiceQuality.GOOD,40);
    
        TipCalculator[] tips = {person1, person2};
        
        
        
         for(int i=0; i < tips.length; i++) {
              TipCalculatorManager mgr = new TipCalculatorManager(tips[i]);
            System.out.println("Person  "+i+" Made this much in tips:" + mgr.getTip());
            
        }
        
    }

}
