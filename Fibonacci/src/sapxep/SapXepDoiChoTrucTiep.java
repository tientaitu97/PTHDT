/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SapXepDoiChoTrucTiep {
    public void InMang( int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1) System.out.print(" ");
        }
    }
    public void SapXep(int[] arr){ int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int temp = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){ count++;
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                    
                 }
             }
            System.out.print("Buoc "+(i + 1)+": ");
                    InMang(arr);
                    System.out.println("");
                     
        }
               
        
    }
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n >= 0 & n <= 100){
            int[] arr = new int[n];
            int count = 0;
            for(int i = 0; i < n; i ++){
                arr[i] = sc.nextInt();
                if( arr[i] < 0) count++;
            }
            if(count == 0){
                SapXep(arr);
            }
        
    }
    }
    public static void main(String[] args) {
        SapXepDoiChoTrucTiep sx = new SapXepDoiChoTrucTiep();
        sx.Init();
    }
}
