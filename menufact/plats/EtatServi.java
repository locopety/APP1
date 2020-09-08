package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatServi implements EtatPlat {

    @Override
    public void next(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Le plat est deja servi au client.");
    }

    @Override
    public void prev(PlatChoisi platChoisi) {
        platChoisi.setState(new EtatTermine());
    }

    @Override
    public String getStatus() {
        return  "Plat servi.";
    }
}
