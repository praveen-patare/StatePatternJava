/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

import java.util.Scanner;

/**
 *
 * @author Jagannath
 */
public class Program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to CECS 575 FSA Program.");
        String string;
        do{
            System.out.print("Enter String : ");
            Scanner s = new Scanner(System.in);
            string = s.next();
            if(!string.equals("q")){
                Context c = new Context(string);
                c.traverseString();
            }
                        
        }while(!string.equals("q"));
/*
        while(!string.equals("q")){
            string = s.next();    

        }
*/    }
}
