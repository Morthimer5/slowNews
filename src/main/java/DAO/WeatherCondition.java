package DAO;

import model.Weather;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;


public class WeatherCondition {
    public static long currentTime = 0;



    public void getWeather(){
        if(System.currentTimeMillis() - currentTime > 600000){
            currentTime = System.currentTimeMillis();

        }
    }

    private static void getWeatherFromResurse(){

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9998").path("resource");

        Form form = new Form();
        form.param("x", "foo");
        form.param("y", "bar");

        Weather weather =
                target.request(MediaType.APPLICATION_JSON_TYPE)
                        .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                                Weather.class);
    }

}
