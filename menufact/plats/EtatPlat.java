package menufact.plats;

import menufact.plats.exceptions.PlatException;

/**
 * État d'un plat
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public interface EtatPlat {
    /**
     * change l'état du plat à l'état suivant
     */
    void next(PlatChoisi platChoisi) throws PlatException;

    /**
     * change l'état du plat à l'état anterieur
     */
    void prev(PlatChoisi platChoisi) throws PlatException;

    /**
     * affiche l'état
     */
    String getStatus();
}
