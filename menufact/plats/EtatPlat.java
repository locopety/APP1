package menufact.plats;

import menufact.plats.exceptions.PlatException;

public interface EtatPlat {
    void next(PlatChoisi platChoisi) throws PlatException;
    void prev(PlatChoisi platChoisi) throws PlatException;
    String getStatus();
}
