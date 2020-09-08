package menufact.plats;

import menufact.plats.exceptions.PlatException;
import ingredients.Viande;
import ingredients.Ingredient;
import ingredients.TypeIngredient;
import java.util.ArrayList;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
    private int ingredient_requis;

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
    }
    public void ajoute (Ingredient i)
    {
        ingredient.add(i);
    }

    public PlatAuMenu() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", ingredients="+ingredient+
                "}\n";
    }
    public ArrayList<Ingredient> getingredient(){return ingredient; }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setIngredient_requis(int ingredient_requis){this.ingredient_requis =ingredient_requis;}

    public int getIngredient_requis(){return ingredient_requis;}

    public boolean checkIngredient_requis(int m) throws PlatException{
        if (m<ingredient_requis)
            throw new PlatException("il n'a pas assez d'ingredient");

        else
            return true;}

}
