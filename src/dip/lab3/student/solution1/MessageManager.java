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
public class MessageManager {
    private StringInput input;
    private StringOutput output;

    public MessageManager(StringInput input, StringOutput output) {
        this.input = input;
        this.output = output;
    }

    public final void sendMessage(){
        String line = input.getStringInput();
        output.performOutput(line);
    }

    public StringInput getInput() {
        return input;
    }

    public void setInput(StringInput input) {
        this.input = input;
    }

    public StringOutput getOutput() {
        return output;
    }

    public void setOutput(StringOutput output) {
        this.output = output;
    }
    
    
}
