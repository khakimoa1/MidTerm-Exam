/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import static arithmetic.Operations1.DIVIDE;
import static arithmetic.Operations1.TIMES;
import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */

enum Operations1 {
  PLUS,
  MINUS,
  TIMES,
  DIVIDE
}
//ran out of time
public class ArithmeticBase 
{
    
 public double x,y;
    double calculate(double x, double y, int z) 
        {
            
        //Scanner sc =new Scanner(System.in);
        
        Operations1 s = Operations1.PLUS;
        if (z ==1) s = Operations1.PLUS;
        if (z ==2) s = Operations1.MINUS;
        if (z ==3) s = Operations1.TIMES;
        if (z ==4) s = Operations1.DIVIDE;
        switch (s) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
