package menufact.plats;

import menufact.plats.exceptions.PlatException;

/**
 * État d'un plat
 * @author Rober Baker, Daniel Castro
 * @version 2.0
 */
public class EtatCommande implements EtatPlat {

    @Override
    public void next(PlatChoisi platChoisi) {
        /*if(IngredientsInsufissants)
            platAuMenu.setState(new EtatImposibleServir());
          else
         */
        platChoisi.setState(new EtatEnPreparation());
    }
    /**
     * @throws PlatException en cas que l'état du plat soit à l'état initial
     */
    @Override
    public void prev(PlatChoisi platChoisi) throws PlatException {
        throw new PlatException("Le plat est a son etat initial.");
    }

    @Override
    public String getStatus() {
        return "Plat commande.";
    }
}
