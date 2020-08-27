/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Fibonacci {
    public long F(long f1, long f2, int x){
          
        if( x > 3)
            return F( f2, f1 + f2 , x - 1);
        else return f1 + f2;
    }
    public void Fibo(){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int a : arr){
            if ( a == 1 || a == 2) System.out.println(1);
            else if(a <= 92){
              System.out.println(F(1,1,a));
          }
        }
    }
    public static void main(String[] args) {
       Fibonacci fi = new Fibonacci();
       fi.Fibo();
    }
    
}
