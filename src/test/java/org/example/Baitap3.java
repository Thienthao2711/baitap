package org.example;

import java.util.Scanner;

public class Baitap3 {
    int a[];
    public boolean KiemtraNguyento(int n){
        if(n<2)
            return false;
        for(int i=2;i < Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public void nhapMang(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = scan.nextInt();
        a= new int[n];

        for(int i=0; i< a.length;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            a[i]= scan.nextInt();

        }
        System.out.println();
    }
    public void xuatMang(){
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]+"\t");
        }
        System.out.println();
    }

    public void XuatsoNguyento(){
        for (int i=0;i < a.length;i++){
            if(KiemtraNguyento(a[i])){
                System.out.println(a[i]+"\t");

            }
        }

        System.out.println();


    }
    public static void main(String[] args) {
        Baitap3 kt = new Baitap3();
        kt.nhapMang();
        System.out.print("Mang da nhap la : ");
        kt.xuatMang();
        System.out.print(" cac so nguyen to trong mang da nhap la :  ");
        kt.XuatsoNguyento();

    }

}