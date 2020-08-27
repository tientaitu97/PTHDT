/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoDep;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SoDep {
 
    public void SoThuanNghich(long x){
        long a = 0;
        long b = 0;
        long y = x;
        while (x > 0) {
            a = x % 10;
            if(a % 2 == 0){
               b = b* 10 + a; 
            }
            else break;
            x = x / 10;
        }
         if(y == b) System.out.println("YES");
         else System.out.println("NO");
    }
    public void ListSoDep() {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        for ( long i : arr){
            if(String.valueOf(i).length() < 500){
                SoThuanNghich(i);
            }
            
        }
    }
    public static void main(String[] args) {
        SoDep sd = new SoDep();
        sd.ListSoDep();
    }
}
