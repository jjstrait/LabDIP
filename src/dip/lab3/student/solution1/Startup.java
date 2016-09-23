/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author jstra
 */
public class Startup {
    
    public static void main(String[] args) {
        StringInput in = new GUIInput();
        StringOutput out = new ConsoleOutput();
        
        
        MessageManager mgr = new MessageManager(in,out);
        mgr.sendMessage();
    }
    
}
