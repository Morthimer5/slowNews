package DAO;

import model.News;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UsersContainer {
    static private Map<String, User> users = new HashMap<>();
    static{
        users.put("admin", new User("admin", "admin", "admin", "admin", new HashMap<Integer, News>()));
    }

    public static User getUser(String key){
        if(users.containsKey(key)){
            return users.get(key);
        }else{
            return new User("Guest","none", "none", "none", null);
        }
    }
    public static Map<String, User> getUsers(){
        return users;
    }

    public static void setUser(String login, User user){
        users.put(login, user);
    }

    public static boolean validateUser(String login, String password){
        if(users.containsKey(login)){
            if(users.get(login).getPassword().equals(password)){
                return true;
            }
        }
            return false;
    }

}
