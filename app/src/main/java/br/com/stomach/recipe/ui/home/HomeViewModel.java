package br.com.stomach.recipe.ui.home;

import android.content.res.Resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import br.com.stomach.recipe.MainActivity;
import br.com.stomach.recipe.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() throws IOException {
        mText = new MutableLiveData<>();
        String nome = MainActivity.nome;
        //Resources resources = null;
        //InputStream resourceReader = resources.openRawResource(R.raw.arquivo);

        mText.setValue(nome);

    }

    public LiveData<String> getText() {
        return mText;
    }
}