package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private EtatPlat etat;

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.etat = new EtatCommande();
    }

    public PlatAuMenu() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
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
