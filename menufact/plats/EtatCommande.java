package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatCommande implements EtatPlat {

    @Override
    public void next(PlatAuMenu platAuMenu) {
        /*if(IngredientsInsufissants)
            platAuMenu.setState(new EtatImposibleServir());
          else
         */
            platAuMenu.setState(new EtatEnPreparation());
    }

    @Override
    public void prev(PlatAuMenu platAuMenu) throws PlatException {
        throw new PlatException("Le plat est a son etat initial.");
    }

    @Override
    public void printStatus() {
        System.out.println("Plat commande.");
    }
}
