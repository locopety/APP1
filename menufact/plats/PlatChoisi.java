package menufact.plats;



import ingredients.Ingredient;
import menufact.plats.exceptions.PlatException;

import java.util.ArrayList;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private int check_dispo;
    private EtatPlat etat;

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        this.etat = new EtatCommande();
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                ", etat=" + etat.getStatus() +
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

    public EtatPlat getState(){ return etat; }

    public void setState(EtatPlat etat){ this.etat = etat; }

    public void previousState() throws PlatException { etat.prev(this); }

    public void nextState() throws PlatException { etat.next(this); }

    public void printStatus() { etat.getStatus(); }
}
