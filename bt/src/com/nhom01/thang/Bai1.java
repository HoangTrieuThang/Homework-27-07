package com.nhom01.thang;

import java.util.Scanner;

public class Bai1 {

    //Giải phương trình bậc 2: ax^2 + bx + c = 0 với a, b, c nhập vào từ bàn phím
    public static void main(String[] args) { ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Giai phuong trinh bac 2-------");
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap so c: ");
        int c = scanner.nextInt();

        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh vo nghiem");
            }else {
                System.out.println("Phuong trinh co nghiem : " + (-c/b));
            }
        }

        double detal = b*b-4*a*c;
        double x1 = (-b - Math.sqrt(detal))/2*a;
        double x2 = (-b + Math.sqrt(detal))/2*a;
        System.out.println("------Giai phuong trinh bac 2-------");
        if (detal>0){
            System.out.println("Nghiem cua phuong trinh la \nx1= " + x1 + "\nx2= " + x2);
        }else if (detal==0){
            System.out.println("Phuong trinh co 1 nghiem x= " +(-b/2*a));
        }else System.out.println("Phuong trinh vo nghiem");


    }
}

