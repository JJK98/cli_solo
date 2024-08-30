package org.example.Article;

public class Article {
    private int lastid ;
    private String sub;
    private String con;
    public Article(int lastid, String sub, String con){
        this.lastid = lastid;
        this.sub = sub;
        this.con = con;
    }
    public String toString() {
        return lastid + " / " + sub + " / " + con;
    }
}
