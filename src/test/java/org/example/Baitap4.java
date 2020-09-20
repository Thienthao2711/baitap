package org.example;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) throws IOException {
        System.out.println("nhap vao so phan tu cua mang A :");
        int n=new Scanner(System.in).nextInt();
       /* System.out.println("Nhap vao so phan tu cua mang B :");
        int m=new Scanner(System.in).nextInt();*/
        /*Tính tổng của mảng A */
        int a[] =new int[n];
        int tongA=0;
        Random random = new Random();

        for(int i=0;i<n;i++){
            System.out.println("nhap vao so a["+i+"]");
            a[i]=new Scanner(System.in).nextInt();
            tongA = tongA + a[i];
        }
        System.out.println("Nhap vao so phan tu cua mang B ");
        int m=new Scanner(System.in).nextInt();
        int b[]=new int [m];
        int tongB=0;
        for(int j=0;j<m;j++){
            System.out.println("nhap vao phan tư thư b["+j+"]");
            b[j]=new Scanner(System.in).nextInt();
            tongB+=b[j];
        }
        System.out.println("tong cua A la :"+tongA);
        System.out.println("Tong cua B la :"+tongB);
        int tong =tongA+tongB;
        System.out.println("Tong cua 2 mang A + B la : "+tong);
          }

}
