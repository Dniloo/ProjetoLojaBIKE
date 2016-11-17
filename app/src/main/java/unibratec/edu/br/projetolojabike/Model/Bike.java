package unibratec.edu.br.projetolojabike.Model;

import com.google.gson.annotations.SerializedName;

public class Bike {

   @SerializedName("tipo")
   public String tipo;
   @SerializedName("nome")
   public String nome;
   @SerializedName("marca")
   public String marca;
   @SerializedName("valor")
   public String valor;
   @SerializedName("sobre")
   public String sobre;
   @SerializedName("capa")
   public String capa;

}
