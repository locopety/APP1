package menufact.plats;

/**
 * État d'un plat
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class EtatTermine implements EtatPlat {

    @Override
    public void next(PlatChoisi platChoisi) {
        platChoisi.setState(new EtatServi());
    }

    @Override
    public void prev(PlatChoisi platChoisi) {
        platChoisi.setState(new EtatEnPreparation());
    }

    @Override
    public String getStatus() {
        return "Plat termine.";
    }
}
