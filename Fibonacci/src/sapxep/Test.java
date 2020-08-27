/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Test {
    public void InMang(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length -1){
                System.out.print(" ");
            }
        }
    }
    public void InsertionSort(int[] arr){
        
        for(int i = 1; i < arr.length; i ++){ 
            
            int x = arr[i];
            int y = i;
            
            while(y > 0 && arr[y - 1] > x){
                arr[y] = arr[y - 1];
                y --;
            }
            arr[y] = x;
               
        }
           
            InMang(arr);
               
             
            }
           public void Show(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 0 & n <= 100){
            int[] arr = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0) count++;
        }
            if(count == 0){
                InsertionSort(arr);
            }
            
        } 
        
    }
    public static void main(String[] args) {
        Test tes = new Test();
        tes.Show();
    }
}
