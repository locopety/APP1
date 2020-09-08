package menufact.plats;

import menufact.plats.exceptions.PlatException;

/**
 * État d'un plat
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class EtatServi implements EtatPlat {

    /**
     * @throws PlatException en cas que l'état du plat soit à l'état final
     */
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
