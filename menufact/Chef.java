package menufact;

import menufact.plats.*;

/**
 * Un Chef du systeme Menufact
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */

public class Chef {
    private String nom;
    private int platsAPreparer;

    private static Chef instaceChef;

    /**
     *
     * @param nom le nom du chef
     */
    private Chef(String nom) {
        this.nom = nom;
        this.platsAPreparer = 0;
    }
    /**
     * retourne l'objet chef
     */
    public static Chef getInstance(String nom){
        if (instaceChef == null)
            instaceChef = new Chef(nom);
        else
            System.out.println("Le Chef existe déjà.");
        return instaceChef;
    }
    /**
     * retourne le nom du chef en String
     */
    public String getNom() {
        return nom;
    }

    /**
     * change le nom du chef
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * notifie au chef qu'il y a un plat à preparer
     * @param platChoisi le plat à preparer
     */
    public void notifier(PlatChoisi platChoisi) {
        platsAPreparer++;
        platChoisi.setState(new EtatCommande());
        System.out.println("Actuellement, le chef prepare " + platsAPreparer + " plats.\n");
    }

    /**
     * met à zero le nombre des plats à preparer
     */
    public void viderNombreDePlats() {
        platsAPreparer = 0;
    }

    /**
     * affiche les variables de l'objet
     */
    @Override
    public String toString() {
        return "Chef{" +
                "hash Code=" + this.hashCode() + " " +
                ", nom='" + nom + '\'' +
                '}';
    }
}
