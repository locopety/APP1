package ingredients;
/**
 * Ingredients
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;
    private int disponible;

    /**
     * retourne le nom de l'ingredient
     */
    public String getNom() {
        return nom;
    }

    /**
     * change le nom de l'ingredient
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * retourne la description de l'ingredient
     */
    public String getDescription() {
        return description;
    }

    /**
     * change la description de l'ingredient
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * retourne le type de l'ingredient
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    /**
     * change le type de l'ingredient
     * @param typeIngredient c'est le type du groupe d'ingredient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    /**
     * change la quantite de l'ingredient
     * @param disponible c'est la quantité d'un type d'ingredient
     */
    public void setDisponible(int disponible){this.disponible = disponible;}

    /**
     * retourne la quantite de l'ingredient
     */
    public int getDisponible(){return disponible;}

    /**
     * Enleve un ingredients lorsque un plat est crée
     */
    public void utilise1dispo(){
        disponible = disponible-1;
    }
}
