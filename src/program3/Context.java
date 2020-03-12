/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author Jagannath
 */
public class Context {
    String string;
    State currentState;
    State startState;

    
    
    public Context(String str){
        this.string = str;
        this.startState = new State1();
        currentState = startState;
    }
    
    public void traverseString(){
        
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a'){
                currentState.inputA(this);
            }
            else if(string.charAt(i) == 'b'){
                currentState.inputB(this);
            }
        }
        if(startState.toString().equals(currentState.toString())){
            System.out.println("String Accepted");
        }
        else{
            System.out.println("String Not Accepted");            
        }
    }
    
    public void setState(State state){
        this.currentState = state;
    }
    
    public void getState(){
        
    }
}
