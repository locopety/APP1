package menufact.plats;

import menufact.plats.exceptions.PlatException;

public interface EtatPlat {
    void next(PlatAuMenu platAuMenu) throws PlatException;
    void prev(PlatAuMenu platAuMenu) throws PlatException;
    void printStatus() throws PlatException;
}
