package ingredients;

import ingredients.exceptions.IngredientException;
/**
 * Inventaire des ingredients
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */

public class IngredientInventaire  {
    private String ingredientInventaire;
    private int quantite;


    /**
     * @param ingredientInventaire le nom de l'ingredient
     * @param quantite la quantite du type d'ingredient
     */
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

    /**
     *
     * @throws IngredientException en cas que la quantite d'un ingredient soit negative
     */
    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }
}
