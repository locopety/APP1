package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatImposibleServir implements EtatPlat {

    @Override
    public void next(PlatAuMenu platAuMenu) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    @Override
    public void prev(PlatAuMenu platAuMenu) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    @Override
    public void printStatus() throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }
}
