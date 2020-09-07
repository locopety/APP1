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
    private EtatPlat etat;
    private ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.etat = new EtatCommande();
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
                ", etat=" + etat +
                "}\n";
    }

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

    public EtatPlat getState(){ return etat; }

    public void setState(EtatPlat etat){ this.etat = etat; }

    public void previousState() throws PlatException { etat.prev(this); }

    public void nextState() throws PlatException { etat.next(this); }

    public void printStatus() throws PlatException { etat.printStatus(); }
}
