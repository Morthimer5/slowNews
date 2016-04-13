package DAO;

import model.Weather;
import org.json.JSONObject;

import javax.ws.rs.client.*;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;


public class WeatherCondition {
    private static long currentTime = 0;
    private static Weather weather = new Weather();



    public static Weather getWeather(){
        if(System.currentTimeMillis() - currentTime > 600000){
            currentTime = System.currentTimeMillis();
            updateWeatherFromResurse();
        }
        return weather;
    }

    private static void updateWeatherFromResurse(){

        JSONObject jsonWeather = new JSONObject(ClientBuilder.newClient()
                .target("https://api.forecast.io/forecast/de27fd446527ecc37f5301d3a073279e/50.43,30.52?units=si")
                .request(MediaType.APPLICATION_JSON).get(String.class)).getJSONObject("currently");

        weather.setSky(jsonWeather.getString("icon"));
        weather.setTemperature(jsonWeather.getInt("temperature"));
    }

}
