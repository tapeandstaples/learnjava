/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genpi;

import java.lang.reflect.Array;

/**
 *
 * @author ben
 * Generates the fractional digits of Pi in hex between at any point
 * without calculating previous digits. 
 * May also find all digits between any two positions calculating each digit
 * Individually. 
 */
public class GenPi {

    /**
     * @param args the command line arguments
     */
    
    public static double modpow(int value, int power, int mod) {
        double e = 1;
        for(int i=1;i<=power;i++){
            e=e*value%mod;
        }
        return e;
    }
    public static double sum2n(int n, int s){
        double sum = 0;
        for(int k=0; k<=n; k++){
            
            sum += modpow(16,n-k,(8*k+s))/(8*k+s);
            
        }
        for(int k=n+1;k<n+100000;k++){
            sum += Math.pow(16,n-k)/(8*k+s);
        }
        return sum;
    }
    public static int hexpi(int n){
        
        double s1 = sum2n(n,1);
        double s2 = sum2n(n,4);
        double s3 = sum2n(n,5);
        double s4 = sum2n(n,6);
        
        double pi = 4*s1-2*s2-s3-s4;
        if(pi<0){
            pi = 16+pi-(int)(16+pi);
        }else{
            pi = pi-(int)(pi);
        }
        
        int hex = (int)(pi*16);
        return hex;
    }
    public static void main(String[] args) {
        if (args.length == 1){
           int i = Integer.parseInt(args[0])-1;
           System.out.printf("The %d hex digit of Pi is: %x%n",i,hexpi(i));
        }else if (args.length == 2){
            int i = Integer.parseInt(args[0])-1;
            int n = Integer.parseInt(args[1]);
            System.out.printf("The hex digits of Pi from pos %d to %d are:%n",i,n);
            while(i<n){
                System.out.printf("%x",hexpi(i));
                i+=1;
            }
            System.out.printf("%n");
        }else{
            System.out.printf("Enter a single posistion or a start and end posistion.%n");
        }   
    }
}
