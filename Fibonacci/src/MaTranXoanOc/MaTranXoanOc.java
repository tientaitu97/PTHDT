/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaTranXoanOc;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MaTranXoanOc {
    public void Matran(int n){
        int d = 0;
        int arr[][] = new int[n][n];
        int gt = n*n, hang = n - 1, cot = n - 1;
        while(d <= n/2){  
            for(int i = d; i <= cot; i++) arr[d][i] = gt--;
            for(int i = d+1; i <= hang; i++) arr[i][cot] = gt--;
            for(int i = cot - 1; i >= d; i--) arr[hang][i] = gt--;
            for(int i = hang - 1; i > d; i--) arr[i][d] = gt--;
            d++;
            cot--;
            hang--;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]);
                if(j < n - 1){
                    System.out.print(" ");
                }
            } System.out.println("");
        }
    }
    public void Show(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            System.out.println("Test "+i+":");
            Matran(arr[i-1]);
        }
        
    }

    public static void main(String[] args) {
        MaTranXoanOc mt = new MaTranXoanOc();
        mt.Show();
    }
}
