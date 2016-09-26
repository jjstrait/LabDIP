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

    public final StringInput getInput() {
        return input;
    }

    public final void setInput(StringInput input) {
        this.input = input;
    }

    public final StringOutput getOutput() {
        return output;
    }

    public final void setOutput(StringOutput output) {
        this.output = output;
    }
    
    
}
