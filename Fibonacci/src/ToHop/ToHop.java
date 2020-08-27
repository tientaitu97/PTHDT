/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToHop;

import java.util.ArrayList;
import java.util.Scanner;


public class ToHop {
    
    private int i, n, k;

    

     public void InMang(int[] a){
         for(int i = 0; i < a.length; i++){
             System.out.print(a[i]);
             if(i != a.length -1) System.out.print(" ");
         }
     }      
    
    //Sinh tổ hợp
    public int sinhToHop(int[] a, int[] b) {
        
            
          this.i = this.k;
          while (this.i > 0 && a[i] == this.n -this.k + this.i) -- this.i;
          if (this.i > 0) {
              a[this.i]++;
              for (int j = this.i + 1; j <= this.k; j++) {
                  a[j] = a[j-1] + 1;
              }
          }
        
        int sum = 0;
        int count = 0;
        for (int j = 1; j <= this.k; j++){
            
            for(int m = 1; m <= this.k; m++){
                if(a[j] == b[m]) count++;
            }
            if(count == 0) sum++;
            else count = 0;
        }
        if( this.i == 0) return this.k;
        else return sum;
       

    }
    public void Init( ) { 
        Scanner input = new Scanner(System.in);
        int x;
        do{ 
            x = input.nextInt();
        }
        while(x > 20);
       // int[] c = new int[x];
       ArrayList<Integer> c = new ArrayList<Integer>();
        for( int q = 0; q < x; q ++){
            
        
       
        do {
            this.n = input.nextInt();
            this.k = input.nextInt();
        } while (this.n < 0 || this.n > 40 || this.k > this.n);

        int[] a = new int[this.n + 1];
        int[] b = new int[this.n + 1];
        for (int j = 1; j <= this.k; j++){
            do{
                a[j] = input.nextInt();
            } while(a[j] <= 0 || a[j] > this.n);
              
           
        };
        for (int m = 1; m <= this.k; m++){
            b[m] = a[m];
            
        };
        c.add(sinhToHop(a, b));
        }
          for(int j = 0; j < c.size(); j ++){
              System.out.println(c.get(j));
          }
        
      
        
}
    public static void main(String[] agrs) { 
        ToHop tohop = new ToHop();
        tohop.Init();
        
               
    }
}
