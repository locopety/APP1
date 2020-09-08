package menufact.plats;

public class EtatEnPreparation implements EtatPlat {

    @Override
    public void next(PlatChoisi platChoisi) {
        platChoisi.setState(new EtatTermine());
    }

    @Override
    public void prev(PlatChoisi platChoisi) {
        platChoisi.setState(new EtatEnPreparation());
    }

    @Override
    public String getStatus() {
        return "Plat en preparation.";
    }
}
