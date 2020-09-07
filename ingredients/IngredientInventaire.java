package ingredients;

import ingredients.exceptions.IngredientException;


public class IngredientInventaire  {
    private String ingredientInventaire;
    private int quantite;

    public IngredientInventaire(String ingredientInventaire, int quantite) {
        this.ingredientInventaire = ingredientInventaire;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }
    public String getNom(){return ingredientInventaire;}

    public void setNom(String nom) {
        this.ingredientInventaire = nom;
    }

    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }
}
