/*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and
how many extra eggs are left over.
A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user
how many gross, how many dozen, and how many left over eggs she has. For example, if
the user says that she has 1342 eggs, then your program would respond with
Your number of eggs is 9 gross, 3 dozen, and 10 since 1342 is equal to 9*144 + 3*12 + 10.
 */
package charpter1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio5 {
    
    public static void main(String[] args){
        
        int n;
        int gross;
        int dozen;
        int lo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many eggs do you have?");
        n = sc.nextInt();
        
        gross = n/144;
        dozen = (n%144)/12;
        lo = (n%144)%12;
        
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen and " + lo);
        
    }
    
}
