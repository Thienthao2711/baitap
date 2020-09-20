package org.example;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        int n;

        // biến đếm số phần tử được nhập từ bàn phím có trong mảng
        int dem = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];
        int tong=0;

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
            tong+=A[i];
        }

        // Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int number = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            dem++;
            if (A[i] == number) {
                dem++;
            }
            else System.out.println("Khong xuat hien lan nao :");
        }

        System.out.println("Số phần tử " + number + " có trong mảng = " + dem);
        /*System.out.println("Tong :"+tong);*/
    }
}