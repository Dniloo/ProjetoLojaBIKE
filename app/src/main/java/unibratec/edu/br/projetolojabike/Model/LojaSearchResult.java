package unibratec.edu.br.projetolojabike.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Daniela on 31/10/2016.
 */
public class LojaSearchResult {
    @SerializedName("Loja")
    public List<Bike> Bikes;
}
