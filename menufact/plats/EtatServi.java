package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatServi implements EtatPlat {

    @Override
    public void next(PlatAuMenu platAuMenu) throws PlatException {
        throw new PlatException("Le plat est deja servi au client.");
    }

    @Override
    public void prev(PlatAuMenu platAuMenu) {
        platAuMenu.setState(new EtatTermine());
    }

    @Override
    public void printStatus() {
        System.out.println("Plat servi.");
    }
}
