package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 앱 ===");
        Scanner sc = new Scanner(System.in);
        String ord ;
        while (true) {
            System.out.print("명령) ");
            ord = sc.nextLine().trim();
            if (ord.equals("종료")){
                break;
            }
        }
    }
}