package model;

import java.util.List;
import java.util.Map;

public class User {

    private String name;
    private String login;
    private String mail;
    private String password;
    private List<News> newsArchive;

    public List<News> getNewsArchive() {
        return newsArchive;
    }

    public void setNewsArchive(List<News> newsArchive) {
        this.newsArchive = newsArchive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String name, String login, String mail, String password, List<News> newsArchive) {
        this.name = name;
        this.login = login;
        this.mail = mail;
        this.password = password;
        this.newsArchive = newsArchive;
    }
    public void addNews(News news){
        if(!newsArchive.contains(news)) {
            newsArchive.add(news);
        }
    }

    public void removeNews(News news){
        newsArchive.remove(news);
    }

}