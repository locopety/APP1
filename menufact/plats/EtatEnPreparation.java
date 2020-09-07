package menufact.plats;

public class EtatEnPreparation implements EtatPlat {

    @Override
    public void next(PlatAuMenu platAuMenu) {
        platAuMenu.setState(new EtatTermine());
    }

    @Override
    public void prev(PlatAuMenu platAuMenu) {
        platAuMenu.setState(new EtatEnPreparation());
    }

    @Override
    public void printStatus() {
        System.out.println("Plat en preparation.");
    }
}
