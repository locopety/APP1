package menufact;

public class Chef {
    private String nom;
    private int platsAPreparer;

    private static Chef instaceChef;

    private Chef(String nom) {
        this.nom = nom;
        this.platsAPreparer = 0;
    }

    public static Chef getInstance(String nom){
        if (instaceChef == null)
            instaceChef = new Chef(nom);
        else
            System.out.println("Le Chef existe déjà.");
        return instaceChef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void notifier() {
        platsAPreparer++;
        System.out.println("Actuellement, le chef prepare" + platsAPreparer + "plats.\n");
    }

    public void viderNombreDePlats() {
        platsAPreparer = 0;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "hash Code=" + this.hashCode() + " " +
                ", nom='" + nom + '\'' +
                '}';
    }
}
