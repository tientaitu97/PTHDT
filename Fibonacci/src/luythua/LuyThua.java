/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luythua;


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LuyThua {
     
    public long Tinh(long n, long k){
        long a = 1000000007;
        if(k == 1) {
            return n;
        }
        else {
            long temp = Tinh(n, k/2);
            if( k % 2 == 0){
                return (temp * temp) % a;
            } else return (((temp * temp) % a) * n) % a;
        }
    }
    public void In(){
        Scanner sc = new Scanner(System.in);
        int m;
         m = sc.nextInt();
         if(m <= 20 & m > 0){
             
         
        int n,k;
        long[] c = new long[m];
        for(int i = 0; i < m; i++){
                n = sc.nextInt();
                k = sc.nextInt(); 
        if(n >= 1 & n <= 1000 & k >= 1 & k <= 1000000000 ){
            c[i] = Tinh(n, k);
        }
             
             
        }
        for(int i = 0; i < m; i++){
            System.out.println(c[i]);
        }
    }
    }
    public static void main(String[] args) {
        LuyThua lt = new LuyThua();
        lt.In();
    }
    
}
