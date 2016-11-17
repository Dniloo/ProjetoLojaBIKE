package unibratec.edu.br.projetolojabike.Http;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import unibratec.edu.br.projetolojabike.Model.Bike;
import unibratec.edu.br.projetolojabike.Model.LojaSearchResult;

public class LojaParser {

   // public static final String URL_SEARCH = "https://dl.dropboxusercontent.com/s/nbclqr6ork496x9/lojabicicleta.json";
    public static final String URL_SEARCH = "http://www.omdbapi.com/?n=%s&r=json";
    public static List<Bike> searchByTitle(String q) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(String.format(URL_SEARCH, q)).build();

        Response response = client.newCall(request).execute();
        if (response.networkResponse().code() == HttpURLConnection.HTTP_OK) {
            String json = response.body().string();

            Gson gson = new Gson();
            LojaSearchResult result =
                    gson.fromJson(json, LojaSearchResult.class);
            if (result != null) {
                return result.Bikes;
            }
        }
    return null;
    }
}
