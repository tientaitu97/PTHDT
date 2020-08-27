/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoTenChuan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class FixName {
    public void Hoten(String str){
        String s = str.toLowerCase();
        s = s.trim().replaceAll("( )+", " ");
        String kq = "";
        String[] arrStr = s.split(" ");
        for(String x : arrStr) {
           for(int i = 0; i < x.length(); i++){
               String y = Character.toString(x.charAt(i));
               if( i == 0){
                   kq+= y.toUpperCase();
               } else kq += y;
           } if(x.equals(arrStr[arrStr.length - 1]) == false){
               kq+= " ";
           }
                   }
        System.out.println(kq);
        }
    public void Show(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        for (String str : arr){
            Hoten(str);
        }
    }
    public static void main(String[] args) {
        FixName fn = new FixName();
        fn.Show();
    }
}

