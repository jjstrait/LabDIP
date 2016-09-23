/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author jstra
 */
public class KeyboardInput implements StringInput {

    @Override
    public String getInput() {
        

            Scanner input = new Scanner(System.in);
            return input.nextLine();
    }
    
    
}
