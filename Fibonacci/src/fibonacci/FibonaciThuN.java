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
public class FibonaciThuN {
    public long F(long f1, long f2, long x){
        long c = 1000000007;
        if( x > 2)
            return F( f2, f1 + f2 , x - 1) % c;
        else return f1 + f2;
    }
    public void Fibo(){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
        if( n <= 1000){
        long [] arr = new long[n];
        for(int i = 0; i < n; i++){
          
               arr[i] = sc.nextLong();  
        }
        for(long a : arr){
            
                if ( a == 1 || a == 0) System.out.println(1);
            else if(a <= 92){
              System.out.println(F(0,1,a));
          }
            
            
        }
    }
    }
    public static void main(String[] args) {
        FibonaciThuN fi = new FibonaciThuN();
        fi.Fibo();
    }
}

