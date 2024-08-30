package org.example.Article;

public class Article {
    private int id ;
    private String sub;
    private String con;
    public Article(int lastid, String sub, String con){
        this.id = lastid;
        this.sub = sub;
        this.con = con;
    }
//    public String toString() {
//        return id + " / " + sub + " / " + con;
//    }
    public int getId(){
        return this.id;
    }
    public String getsub(){
        return this.sub;
    }
    public String getcon(){
        return this.con;
    }
}