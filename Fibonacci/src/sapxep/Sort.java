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
public class Sort {
    public void InMang(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length -1){
                System.out.print(" ");
            }
        }
    }
    public void  selectSort ( int [] array) {    
    int  position =  0 ; 
    int count = 0;
    for  ( int  i =  0 ; i <array.length - 1; i ++) {  
          
        position = i;  
        int  temp = array [i];  
        for  (int  j = i +  1; j <array.length; j ++) {  
            if  (array [j] <temp) {  
                temp = array [j];  
                position = j; 
               
            }  
        }  
        array [position] = array [i];  
        array [i] = temp;
       
        System.out.print("Buoc "+(i+1)+": "); 
        InMang(array);
        System.out.println("");
        
        
        
    } 
//    if( count == 0) {
//        System.out.print("Buoc 1: ");
//        InMang(array);
//    } 
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
                selectSort(arr);
            }
            
        } 
        
    }
    public static void main(String[] args) {
        Sort st = new Sort();
        st.Show();
    }
}
