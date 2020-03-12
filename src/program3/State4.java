/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author Jagannath
 */
public class State4 implements State{
    //String stateName;
    
    public String toString(){
        return "State4";
    }
    public void inputA(Context context) {
        System.out.println(this + " received input a");
        context.setState(new State2());
    }

    @Override
    public void inputB(Context context) {
        System.out.println(this + " received input a");
        context.setState(new State3());        
    }
    
}
