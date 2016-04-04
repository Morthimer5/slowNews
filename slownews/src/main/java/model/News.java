package model;

public class News {
    private Topic topic;
    private String text;
    private String image;
    private String name;
    private int id;

    public News(String name, String text, String image, Topic topic, int id) {
        this.name = name;
        this.text = text;
        this.image = image;
        this.topic = topic;
        this.id = id;
    }

    public News() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
