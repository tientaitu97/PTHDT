/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xaunhiphanketiep;

import java.util.ArrayList;
import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author admin
 */
public class XauNhiPhan {
    public void Right(String b){
        String[] a = b.split("");
        int i = a.length - 1;
        while(i > - 1 & a[i].equals("0") == false){
            a[i] = "0";
            i --;
        }
        a[i] = "1";
        int count = 0;
        for(int j = 0; j < a.length; j++){
            if(a[j].equals("0") || a[j].equals("1")){
                count++;
            } else break;
            
        }
        if(count == a.length) {
            for(int j = 0; j< a.length; j ++){
                System.out.print(a[j]);
            } 
        }
    }
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int t;
        String str;
        ArrayList<String> arr = new ArrayList<String>();
        do{
            t = sc.nextInt();
            sc.nextLine();
        }while(t < 0 || t > 100);
        for( int i = 0; i < t; i++){
            do{
                 str = sc.nextLine();
            }while(str.length() < 0 || str.length() > 1000);
            
            arr.add(str);
        }
        for(int i= 0; i < arr.size(); i ++){
            Right(arr.get(i));
            System.out.println("");
        }
        
        
    }
    public static void main(String[] args) {
        XauNhiPhan xn = new XauNhiPhan();
        xn.Init();
    }
    
}
