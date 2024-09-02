package org.example;//package org.example;

import org.example.Article.Article;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Article> articleList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("=== 게시판 앱 ===");
        Scanner sc = new Scanner(System.in);
        String order;
        int lastid = 0;

        while (true) {
            System.out.print("명령) ");
            order = sc.nextLine().trim();
            if (order.equals("종료")) {
                break;
            }
            if (order.equals("등록")) {
                lastid++;
                System.out.print("제목 : ");
                String sub = sc.nextLine().trim();
                System.out.print("내용 : ");
                String con = sc.nextLine().trim();
                System.out.printf("%d번 게시글이 등록되었습니다.\n", lastid);
                Article article = new Article(lastid, sub, con);
                articleList.add(article);
            }
            if (order.equals("목록")) {
                System.out.println("번호 / 제목 / 내용\n ---------------------");
                for (int i = articleList.size() - 1; i >= 0; i--) {
                    Article article = articleList.get(i);
                    System.out.printf("%d / %s / %s \n", article.getId(), article.getSub(), article.getCon());
                }
            } else if (order.contains("삭제")) {
                String[] delete = order.split("\\?");
                if (delete.length == 1) continue;

                String[] deleteSet = delete[1].split("=");
                String key = deleteSet[0];
                String value = deleteSet[1];
                String[] indexs = value.split(",");
                Article article;
                for (String i : indexs) {

                    article = _getFindById(Integer.parseInt(i));
                    if (article == null) {
                        System.out.printf("%d번 게시물은 존재하지 않습니다.\n", Integer.parseInt(i));
                    } else {
                        articleList.remove(article);
                        System.out.printf("%d번 게시물이 삭제되었습니다.\n", Integer.parseInt(i));
                    }

                }
            } else if (order.contains("수정")) {
                String[] update = order.split("\\?");
                if (update.length == 1) continue;

                String[] updateSet = update[1].split("=");
                String key = updateSet[0];
                String value = updateSet[1];
                String[] indexs = value.split(",");
                Article article;
                for (String i : indexs) {
                    article = _getFindById(Integer.parseInt(i));
                    if (article == null) {
                        System.out.printf("%d번 게시물은 존재하지 않습니다.\n", Integer.parseInt(i));
                    } else {
                        System.out.printf("제목(기존) : %s\n", article.getSub());
                        System.out.print("제목 : ");
                        String modifiedsub = sc.nextLine().trim();
                        article.setSub(modifiedsub);
                        System.out.printf("내용(기존) : %s\n", article.getCon());
                        System.out.print("내용 : ");
                        String modifiedcon = sc.nextLine().trim();
                        article.setCon(modifiedcon);
                        System.out.printf("%d번 게시물이 수정되었습니다.\n", article.getId());
                    }
                }
            }
        }
        sc.close();
    }
    private static Article _getFindById(int id) {
        for (Article item : articleList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}


