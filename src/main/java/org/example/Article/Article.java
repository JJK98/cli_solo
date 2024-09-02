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

    public int getId(){
        return this.id;
    }
    public String getSub(){
        return this.sub;
    }
    public String getCon(){
        return this.con;
    }
    public void setSub(String modifiedsub){
        this.sub = modifiedsub;
    }
    public void setCon(String modifiedcon){
        this.con = modifiedcon;
    }

}