package org.example;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        System.out.println("nhap vao so n de kiem ra co phai so nguyen to hay khong : ");
        int n=new Scanner(System.in).nextInt();
        if(SNT(n)==true) System.out.println("so nguyen to ");
        else System.out.println("khong phai So nguyen to ");


    }
    public static boolean SNT(int n) {
        if(n==0||n==1)
            return false;


        for (int i=2;i<=n-1;i++){

            if(n%i==0)
                return false;

        }

        return true;
    }
}

