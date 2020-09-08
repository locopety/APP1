package menufact.plats;

import menufact.plats.exceptions.PlatException;

/**
 * État d'un plat
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class EtatImposibleServir implements EtatPlat {

    /**
     * @throws PlatException en cas que l'état ne peut pas changer à cause d'un erreur de preparation
     */
    @Override
    public void next(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    /**
     * @throws PlatException en cas que l'état ne peut pas changer à cause d'un erreur de preparation
     */
    @Override
    public void prev(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    @Override
    public String getStatus() {
        return "Plat impossible de servir (manque d’ingrédients)\n.";
    }
}
