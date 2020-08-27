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
public class SapXepNoiBot {
     public void InMang( int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1) System.out.print(" ");
        }
    }
     public void BubbleSort(int[] arr){
         
         for(int i = 0; i < arr.length - 1; i ++){
             boolean have = false;
             for(int j = 0; j < arr.length-i-1; j ++){
                 int temp = arr[j];
                 if( arr[j] > arr[j + 1]){
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     have = true;
                 } 
             }
             if(have == false){
                 break;
             } else {
                System.out.print("Buoc "+(i + 1)+": ");
                InMang(arr);
                System.out.println("");
                     
             }
             
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
                BubbleSort(arr);
            }
        
    }
    }
    public static void main(String[] args) {
        SapXepNoiBot sxnb = new SapXepNoiBot();
        sxnb.Init();
       
    }
    
}
