/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToHop;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhapMang {
    public void InMang(int[] arr){
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
    public int sinhToHop(int[] a, int[] b, int n, int k) {
        
          int i = k;  
          while (i > 0 & a[i - 1] == n - k + i) {
              -- i;
          }
          if (i > 0) {
              a[i - 1]++;
              for (int j = i; j < k; j++) {
                  a[j] = a[j-1] + 1;
              }
          }
        
        int sum = 0;
        int count = 0;
        for (int j = 0; j < k; j++){
            
            for(int m = 0; m < k; m++){
                if(a[j] == b[m]) count++;
            }
            if(count == 0) sum++;
            else count = 0;
        }
        if( i == 0) return k;
        else return sum;
       

    }
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int n,k,x;
        
        do{
            x = sc.nextInt();
        } while(x > 20);
        int[] c = new int[x];
        for(int j = 0; j < x; j++){
            
        
            do{
                n = sc.nextInt();
            }while(n <= 1 & n >= 40);
            do{
                k = sc.nextInt();

            }while (k < 0 & k >= n); 
            int[] a = new int[k];
            int[] b = new int[k];
            for(int i = 0; i < k; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < k; i++){
                b[i] = a[i];
            }
            for(int q = 0; q < x; q++){
                c[q] = sinhToHop(a, b, n, k);
            }
        }
        InMang(c);
    }
    public static void main(String[] args) {
        NhapMang nm = new NhapMang();
        nm.Init();
    }
    
}
