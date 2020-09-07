package menufact.plats;

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

    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "Prix pour Enfant="+ prixEnfant +
                "} " + super.toString();
    }
}
