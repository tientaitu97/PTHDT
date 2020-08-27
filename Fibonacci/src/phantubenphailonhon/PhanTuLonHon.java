/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantubenphailonhon;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanTuLonHon {
    public void Right(long[] a, int n){
        int i = n - 1;
        while(i > - 1 & a[i] != 0){
            a[i] = 0;
            i --;
        }
        a[i] = 1;
        for(int j = 0; j < a.length; j++){
            System.out.println(a[j]);
        }
    }
    
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int t, n;
        do{
            t = sc.nextInt();
        }while( t > 20);
        do{
            n = sc.nextInt();
        }while(n < 1 || n > 100000);
        long[] a = new long[n];
        for(int i = 0; i < n; i ++){
            do{
                a[i] = sc.nextInt();
            }while(a[i] < 0 || a[i] > 1000000000);
        }
        Right(a, n);
    }
    public static void main(String[] args) {
        PhanTuLonHon ptlh = new PhanTuLonHon();
        ptlh.Init();
    }
}
