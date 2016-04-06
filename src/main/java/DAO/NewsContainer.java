package DAO;

import model.News;

import java.util.HashMap;
import java.util.Map;

public class NewsContainer {
    private static Map<Integer, News> newsMap = new HashMap<>();

    private NewsContainer() {
    }

    public  static void setNews(News news){
        newsMap.put(news.getId(), news);
    }
    public static News getNewsById(int id){
        return newsMap.get(id);
    }
    public static Map<Integer, News> getNews(){
        if(newsMap.isEmpty()) {
            InitNews.initNews();
        }
        return newsMap;
    }


}
