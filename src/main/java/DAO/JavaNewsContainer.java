package DAO;

import model.News;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="rss")
public class JavaNewsContainer {
    @XmlElementWrapper(name = "channel")
    @XmlElement(name = "item")
    private static List<News> newsList = new ArrayList<>();

    private static long currentTime = 0;


    private JavaNewsContainer() {
    }

    public  static void addNews(News news){
        newsList.add(news);
    }
    public static News getNewsById(int id){
        return newsList.get(id);
    }

    public static void setNews(List<News> newsList) {
        JavaNewsContainer.newsList = newsList;
    }
    public static List<News> getNews(){

        if(System.currentTimeMillis() - currentTime > 600000){
            currentTime = System.currentTimeMillis();
            updateNewsFromResurs();
        }
        return newsList;
    }

    private static void updateNewsFromResurs(){

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( JavaNewsContainer.class );
            jaxbContext.createUnmarshaller().unmarshal(new URL("http://www.javaworld.com/index.rss"));

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}

