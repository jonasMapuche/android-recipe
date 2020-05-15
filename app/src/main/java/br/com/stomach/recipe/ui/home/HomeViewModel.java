package br.com.stomach.recipe.ui.home;

import android.content.res.Resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import br.com.stomach.recipe.MainActivity;
import br.com.stomach.recipe.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() throws IOException, JSONException {
        mText = new MutableLiveData<>();
        String arquivo = MainActivity.nome;
        //Resources resources = null;
        //InputStream resourceReader = resources.openRawResource(R.raw.arquivo);

        JSONObject recipe = new JSONObject(arquivo);
        JSONArray listRecipe = recipe.getJSONArray("recipe");

        String nomes = "";
        for (int i = 0; i < listRecipe.length(); i++) {
            JSONObject itemRecipe = listRecipe.getJSONObject(0);
            nomes = nomes + " - " + itemRecipe.getString("name");
        }

        mText.setValue(nomes);

    }

    public LiveData<String> getText() {
        return mText;
    }
}