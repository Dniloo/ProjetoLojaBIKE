package unibratec.edu.br.projetolojabike;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import unibratec.edu.br.projetolojabike.Http.LojaParser;
import unibratec.edu.br.projetolojabike.Model.Bike;

public class LojaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        new LojaSearchTask().execute("karakoram");
    }
    class LojaSearchTask extends AsyncTask<String, Void, List<Bike>>{

        @Override
        protected List<Bike> doInBackground(String... params) {
            try {
                List<Bike> bikes = LojaParser.searchByTitle(params[0]);
                for (Bike bike : bikes){
                    Log.d("NGVL", "bike---->"+ bike.nome);

                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }
    }
}
