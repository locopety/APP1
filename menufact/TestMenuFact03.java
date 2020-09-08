package menufact;

import ingredients.Ingredient;
import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;
import menufact.plats.exceptions.PlatException;

public class TestMenuFact03 {
    public static void main(String[] args) throws FactureException, PlatException{
        boolean trace = true;

        TestMenuFact03 t = new TestMenuFact03();

        PlatAuMenu p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
        PlatAuMenu p2 = new PlatAuMenu(1,"PlatAuMenu1",20);

        PlatSante ps1 = new PlatSante(10,"PlatSante0",10,11,11,11);
        PlatSante ps2 = new PlatSante(11,"PlatSante1",20,11,11,11);

        PlatEnfant pe1 = new PlatEnfant(20,"PlatEnfant0",10, 0.5);
        PlatEnfant pe2 = new PlatEnfant(21,"PlatEnfant1",21,0.6);

        Menu m1 = new Menu("menufact.Menu 1");

        Inventaire inv1 = new Inventaire();

        Ingredient poulet = new Ingredient();
        poulet.setNom("poulet");
        poulet.setDescription("viande blanche");
        poulet.setDisponible(12);

        Ingredient tomate = new Ingredient();
        tomate.setNom("tomate");
        tomate.setDescription("tomage fraiche");
        tomate.setDisponible(0);

        Ingredient yagout = new Ingredient();
        yagout.setNom("yagout");
        yagout.setDescription("au fraise");
        yagout.setDisponible(1);

        Facture f1 = new Facture("Ma facture");

        Client c1 = new Client(1,"Mr Client","1234567890");

        t.test1_AffichePlatsAuMenuSansIngredient(trace, p1,p2,ps1,ps2,pe1,pe2);
        t.test2_AjoutInventaire(trace,inv1,poulet,tomate,yagout);
        t.test3_AjoutMenu(trace, m1);
        t.test4_Ajoutingredient(trace,p1, poulet, p2,ps1, ps2, pe1, pe2, tomate,  yagout);
        t.test5_AjoutPlatsAuMenu(trace, m1, p1, p2, ps1, ps2, pe1, pe2);
        t.test1_AffichePlatsAuMenuSansIngredient(trace, p1,p2,ps1,ps2,pe1,pe2);

        try {
            t.test6_DeplacementMenuAvancer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }
        try {
            t.test7_DeplacementMenuReculer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }
        try {
            t.test8_CreerFacture(f1, m1);
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }

        t.test9_AjouterClientFacture(f1, c1);

        try {
            t.test10_AjouterPlatsFacture(f1, m1,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        t.test11_PayerFacture(f1);

        try {
            t.test10_AjouterPlatsFacture(f1, m1,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        try {
            f1.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        System.out.println("FIN DE TOUS LES TESTS...");

        System.out.println(f1.genererFacture());
    }
    private void test1_AffichePlatsAuMenuSansIngredient(boolean trace, PlatAuMenu p1, PlatAuMenu p2,
                                          PlatSante p3, PlatSante p4, PlatEnfant p5,PlatEnfant p6)
    {
        System.out.println("=== test1_AffichePlatsAuMenu");
        if(trace)
        {
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);
            System.out.println(p6);
        }
    }
    private void test2_AjoutInventaire(boolean trace, Inventaire inv1,Ingredient poulet,
                                       Ingredient tomate, Ingredient yagout){
        System.out.println("=== test2_2_AjoutInventaire");
        inv1.ajouter(poulet);
        inv1.ajouter(tomate);
        inv1.ajouter(yagout);
    }
    private static void test3_AjoutMenu(boolean trace, Menu m1)
    {

        System.out.println("=== test3_AjoutMenu");

        if(trace) {
            System.out.println(m1);
        }
    }
    private void test4_Ajoutingredient(boolean trace,PlatAuMenu p1,Ingredient poulet,
                                       PlatAuMenu p2,PlatSante ps1,PlatSante ps2,
                                       PlatEnfant pe1, PlatEnfant pe2,
                                       Ingredient tomate, Ingredient yagout){
        System.out.println("===test4_AjoutIngredient");
        System.out.println("=== Ajout de poulet au plat p1");
        p1.ajoute(poulet);
        System.out.println("=== Ajout de tomate et poulet au plat p2");
        p2.ajoute(poulet);
        p2.ajoute(tomate);
        System.out.println("ajout tomate au plat ps1");
        ps1.ajoute(tomate);
        System.out.println("ajout tomate et yagout au plat ps2");
        ps2.ajoute(tomate);
        ps2.ajoute(yagout);
        System.out.println("ajout yagout au plat pe1");
        pe1.ajoute(yagout);
        System.out.println("ajout yagout et poulet pe2");
        pe2.ajoute(yagout);
        pe2.ajoute(poulet);

        if (trace){
            System.out.println(p1);
        }
    }
    private void test5_AjoutPlatsAuMenu(boolean trace, Menu m1,
                                        PlatAuMenu p1, PlatAuMenu p2,
                                        PlatSante ps1, PlatSante ps2,
                                        PlatEnfant pe1, PlatEnfant pe2)
    {
        System.out.println("=== test5_AjoutPlatsAuMenu");
        System.out.println("=== Ajout de plats au menu 1");
        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(ps1);
        m1.ajoute(ps2);
        m1.ajoute(pe1);
        m1.ajoute(pe2);


        if(trace) {
            System.out.println(m1);

        }
    }
    private void test6_DeplacementMenuAvancer(Menu m1) throws MenuException
    {
        System.out.println("=== test6_DeplacementMenuAvancer");

        System.out.println("===Selectionner un plat du menu 0");
        m1.position(0);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Avancer le plat courant");
            System.out.println("1.");
            m1.positionSuivante();
            System.out.println("2.");
            m1.positionSuivante();
            System.out.println("3.");
            m1.positionSuivante();
            System.out.println("4.");
            m1.positionSuivante();
            System.out.println("5.");
            m1.positionSuivante();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }
    private void test7_DeplacementMenuReculer(Menu m1) throws MenuException
    {
        System.out.println("===test7_DeplacementMenuReculer");

        System.out.println("===Selectionner un plat du menu 3");
        m1.position(3);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Reculer le plat courant");
            System.out.println("2.");
            m1.positionPrecedente();
            System.out.println("1.");
            m1.positionPrecedente();
            System.out.println("0.");
            m1.positionPrecedente();
            System.out.println("-1.");
            m1.positionPrecedente();
            System.out.println("-2.");
            m1.positionPrecedente();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }
    private void test8_CreerFacture(Facture f1, Menu m1) throws FactureException
    {
        System.out.println("===test8_CreerFacture");

        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5);
        try
        {
            f1.ajoutePlat(platChoisi);
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }
    private void test9_AjouterClientFacture(Facture f1,Client c1) {
        System.out.println("===test9_AjouterClientFacture");
        f1.associerClient(c1);
        System.out.println(f1);
    }
    private void test10_AjouterPlatsFacture(Facture f1, Menu m1, int pos) throws MenuException,FactureException
    {
        System.out.println("===test10_AjouterPlatsFacture");

        try{
            for (int i=0; i< pos; i++)
                m1.positionSuivante();
        }
        catch (MenuException me)
        {
            throw me;
        }

        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5);
        try
        {
            f1.ajoutePlat(platChoisi);
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }
    private void test11_PayerFacture(Facture f1)
    {
        System.out.println("===test9_PayerFacture");

        System.out.println("Avant payer la facture");
        System.out.println(f1);
        f1.payer();
        System.out.println("Apres avoir paye la facture");
        System.out.println(f1);
    }
}
