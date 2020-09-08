package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatImposibleServir implements EtatPlat {

    @Override
    public void next(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    @Override
    public void prev(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Plat impossible de servir (manque d’ingrédients)\n.");
    }

    @Override
    public String getStatus() {
        return "Plat impossible de servir (manque d’ingrédients)\n.";
    }
}
