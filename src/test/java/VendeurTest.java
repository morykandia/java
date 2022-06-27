import org.junit.jupiter.api.Test;
import Travailleur.vendeur;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendeurTest {

    @Test
    void Testcalcul(){

        vendeur v = new vendeur("Pierre", "Business", 45, "1995", 30000);
        double salaire = v.calculerSalaire();
        assertEquals(6400.0, salaire);
        assertEquals(v.getTitre(), "Le vendeur ");
    }



}
