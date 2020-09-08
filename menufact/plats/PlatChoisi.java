package menufact.plats;



import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import menufact.plats.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.Delayed;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private int check_dispo;

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {

        return plat;
    }
    public boolean checkPlat()throws PlatException{
        ArrayList<Ingredient> ing = plat.getingredient();
        for(int i=0;i< ing.size();i++){
            check_dispo=ing.get(i).getDisponible();
            if(plat.checkIngredient_requis(check_dispo)== true){
                ing.get(i).utilise1dispo();
                return true;}
            else
                throw new PlatException("ne peut pas etre ajouter a la facture");

        }
        return false;
    }
}
