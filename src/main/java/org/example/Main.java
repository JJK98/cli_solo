package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 앱 ===");
        Scanner sc = new Scanner(System.in);
        String ord ;
        int lastid = 0;
        while (true) {
            System.out.print("명령) ");
            ord = sc.nextLine().trim();
            if (ord.equals("종료")){
                break;
            }
            if (ord.equals("등록")){
                lastid ++;
                System.out.print("제목 : ");
                String sub = sc.nextLine().trim();
                System.out.print("제목 : ");
                String con = sc.nextLine().trim();
                System.out.printf("%d번 게시글이 등록되었습니다.\n",lastid);
            }
        }
    }
}