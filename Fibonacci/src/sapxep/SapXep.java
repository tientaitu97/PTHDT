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
public class SapXep {
    public void HoanVi(int x, int y){
        int a = x;
        x = y;
        y = a;
        
        System.out.println(x);
        System.out.println(y);
    }
    public void SapXepMang(int[] a){
        
        int d = 0;
        int min = a[d];
        for(int i = d + 1; i < a.length; i++){
            if(min > a[i]){
                HoanVi(min, a[i]);
                a[d] = min;
                
            } d++;
        } for( int i= 0; i < a.length; i++){
            System.out.print(" "+a[i]);
        }
    }
    public void Show(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        int[] a = {3,4,1,2};
        SapXep sx = new SapXep();
        sx.SapXepMang(a);

    }
}
