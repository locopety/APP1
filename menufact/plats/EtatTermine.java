package menufact.plats;

public class EtatTermine implements EtatPlat {

    @Override
    public void next(PlatAuMenu platAuMenu) {
        platAuMenu.setState(new EtatServi());
    }

    @Override
    public void prev(PlatAuMenu platAuMenu) {
        platAuMenu.setState(new EtatEnPreparation());
    }

    @Override
    public void printStatus() {
        System.out.println("Plat termine.");
    }
}
