/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package najmdelilac;


/**
 *
 * @author admin
 */
public class NajmDelilac {
    
     /**
      * funkcija printDivisors
     * @param args int
     * return print
     */
    static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("The divisors of 24 are: ");
         printDivisors(24);
    }
    
}
