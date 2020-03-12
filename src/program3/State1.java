/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author Jagannath
 */
public class State1 implements State{
    //String stateName;
    
    @Override
    public void inputA(Context context) {
        System.out.println(this + " received input a");
        context.setState(new State3());
    }

    @Override
    public void inputB(Context context) {
        System.out.println(this + " received input b");
        context.setState(new State2());        
    }
    
    public String toString(){
        return "State1";
    }
}
