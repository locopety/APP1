package menufact.plats;

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
    public void printStatus() {
        System.out.println("Plat termine.");
    }
}
