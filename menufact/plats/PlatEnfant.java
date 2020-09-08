package menufact.plats;

/**
 * Plat pour enfant
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class PlatEnfant extends PlatAuMenu{
    private double proportion;
    private double prixEnfant;

    public PlatEnfant() {
    }

    public PlatEnfant(int code, String description, double prix, double proportion) {
        super(code, description, prix );
        this.proportion = proportion;
        this.prixEnfant = proportion * prix;
    }
    /**
     * @return la proportion du plat
     */
    public double getProportion() {
        return proportion;
    }

    /**
     * Affiche les informations du plat
     */
    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "Prix pour Enfant="+ prixEnfant +
                "} " + super.toString();
    }
}
