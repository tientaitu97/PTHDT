/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoDep;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SoThuanNgich {
    public boolean Number(String str){
        String s = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            s = s + str.charAt(i);
          
        } if(str.equals(s)) return true;
            else    
        return false;
    }
    public void Show(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] check = {"0", "2", "4", "6", "8"};
        
        for( int i= 0; i < n; i++){
            arr[i] = sc.next();
        }
        for( String str : arr){
            if(str.length() < 500){
            boolean count = true;
            for(int j = 0; j < str.length(); j ++){
               String s = Character.toString(str.charAt(j));
                if(s.equals("0")|| s.equals("2") || s.equals("4")|| s.equals("6") || s.equals("8")){
                    count = true;
                
                    
                
                
            }
                else  
            {
                count = false;
                System.out.println("NO");
                break;
            
            } 
            } 
            if(count == true) {
                System.out.println("YES");
            }
            
        }
        }
    }
    public static void main(String[] args) {
        SoThuanNgich stn = new SoThuanNgich();
        stn.Show();
    }
}
