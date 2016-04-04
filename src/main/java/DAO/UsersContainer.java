package DAO;

import model.News;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UsersContainer {
    static private Map<String, User> users = new HashMap<>();
    static{
        users.put("Admin", new User("Admin", "admin", "admin", "1", null));
    }

    public static User getUser(String key){
        if(users.containsKey(key)){
            return users.get(key);
        }else{
            return new User("Guest","none", "none", "none", new HashMap<String, News>());
        }
    }
    public static Map<String, User> getUsers(){
        return users;
    }
    public static void setUser(String login, User user){
        users.put(login, user);
    }
}
