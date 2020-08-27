/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xaunhiphanketiep;

/**
 *
 * @author admin
 */
public class MangKiTu {
    public static void main(String[] args) {
        String str = "01000101";
        String[] a = str.split("");
        for( int i = 0; i < a.length; i ++){
            System.out.println(a[i]);
        }
    }
}
