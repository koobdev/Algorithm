package com.company;

public class Chapter2 {
    /*
    Baekjoon 1330
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    if(a>=-10000 && b<=10000){
        if(a>b){
            System.out.println(">");
        }
        else if(a<b){
            System.out.println("<");
        }
        else if(a==b){
            System.out.println("==");
        }
    }
    */

    /*
    Baekjoon 9498
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();

    if(90<=score && score<=100){
        System.out.println("A");
    }
    else if(80<=score && score<=89){
        System.out.println("B");
    }
    else if(70<=score && score<=79){
        System.out.println("C");
    }
    else if(60<=score && score<=69){
        System.out.println("D");
    }
    else {
        System.out.println("F");
    }
    */

    /*
    Baekjoon 2753
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();

    if(1<=year && year<=4000){
        if(year%4==0 && year%100!=0){
            System.out.println("1");
        }else if(year%4==0 && year%400==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
    */

    /*
    Baekjoon 14681
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if((-1000<=x && x<=1000 && x!=0) && (-1000<=y && y<=1000 && y!=0)){
        if(x>=0 && y>=0){
            System.out.println("1");
        }
        else if(x<=0 && y>=0){
            System.out.println("2");
        }
        else if(x<=0 && y<=0){
            System.out.println("3");
        }
        else if(x>=0 && y<=0){
            System.out.println("4");
        }
    }
    */

    /*
    Baekjoon 2884
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int M = scanner.nextInt();

    if((0<=H && H<=23) && (0<=M && M<=59)){
        if(M-45<0){
            if(H-1>=0){
                System.out.print((H-1)+" "+(60-(45-M)));
            }else {
                System.out.print("23"+" "+(60-(45-M)));
            }
        }else {
            System.out.print(H+" "+(M-45));
        }
    }
    */
}
