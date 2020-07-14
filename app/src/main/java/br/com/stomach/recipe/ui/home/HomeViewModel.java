package br.com.stomach.recipe.ui.home;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.JsonReader;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import br.com.stomach.recipe.MainActivity;
import br.com.stomach.recipe.R;
import br.com.stomach.recipe.ui.Magic;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() throws IOException, JSONException {
        mText = new MutableLiveData<>();
        String arquivo = MainActivity.nome;
        String magic = Magic.nome;
        //Resources resources = null;
        //InputStream resourceReader = resources.openRawResource(R.raw.arquivo);

        JSONObject recipe = new JSONObject(arquivo);
        JSONArray listRecipe = recipe.getJSONArray("recipe");

        String nomes = "";
        for (int i = 0; i < listRecipe.length(); i++) {
            JSONObject itemRecipe = listRecipe.getJSONObject(0);
            nomes = nomes + " - " + itemRecipe.getString("name");
        }

        /*
        URL githubEndpoint = new URL("http://192.168.15.4:4000/api/tasks/");
        HttpURLConnection myConnection = (HttpURLConnection) githubEndpoint.openConnection();
        myConnection.setRequestProperty("User-Agent", "my-rest-app-v0.1");
        */
        
        final String[] variavel = {""};
        new Thread (new Runnable() {
            @Override
            public void run() {
                URL githubEndpoint = null;
                try {
                    githubEndpoint = new URL("http://192.168.15.4:4000/api/tasks/");
                    HttpURLConnection myConnection = (HttpURLConnection) githubEndpoint.openConnection();
                    myConnection.setRequestProperty("User-Agent", "my-rest-app-v0.1");
                    if (myConnection.getResponseCode() == 200) {
                        // Success
                        InputStream responseBody = myConnection.getInputStream();
                        InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
                        JsonReader jsonReader = new JsonReader(responseBodyReader);
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String key = jsonReader.nextName();
                            if (key.equals("android")) {
                                String value = jsonReader.nextString();
                                variavel[0] = value;
                                break;
                            } else {
                                jsonReader.skipValue();
                            }
                        }

                    } else {
                        // Error handling code goes here
                        variavel[0] = "ola!0";
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        String postman = variavel[0];
        //Magic.execute();
        /*
        if (myConnection.getResponseCode() == 200) {
            // Success
            InputStream responseBody = myConnection.getInputStream();
            InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
            JsonReader jsonReader = new JsonReader(responseBodyReader);
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String key = jsonReader.nextName();
                if (key.equals("express")) {
                    String value = jsonReader.nextString();
                    postman = value;
                    break;
                } else {
                    jsonReader.skipValue();
                }
            }
        } else {
            postman = "erro";
        }
        */

        mText.setValue(postman);

    }


    public LiveData<String> getText() {
        return mText;
    }
}



