/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Dhruv Prasad
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(i = 1; i < 101; i++);
        {
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz"); // if the number is divisible by 15, then print FizzBuzz
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz"); // if the number is divisible by 3, then print Fizz
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz"); // if the number is divisible by 5, then print Buzz
            }
            else
            {
                system.out.println(i); // otherwise, print the number 
            }            
        }
    }
    
}
