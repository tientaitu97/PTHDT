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
public class SapXepChen {
    public void InMang(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i));
            if(i < array.size() -1){
                System.out.print(" ");
            }
        }
    }
    public void InsertionSort(int[] arr){
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(arr[0]);
       
        for(int i = 1; i < arr.length; i ++){ 
            
            int x = arr[i];
            int y = i;
            arraylist.add(x);
            while(y > 0 && arraylist.get(y - 1) > x){
                arraylist.set(y, arraylist.get(y - 1));
                y --;
            }
            arraylist.set(y, x);
            System.out.print("Buoc "+i+": "); 
            InMang(arraylist);
            System.out.println("");     
        }
             
             
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
                System.out.println("Buoc 0: "+arr[0]);
                InsertionSort(arr);
            }
            
        } 
        
    }
    public static void main(String[] args) {
        SapXepChen sxc = new SapXepChen();
        sxc.Show();
    }
    
}
