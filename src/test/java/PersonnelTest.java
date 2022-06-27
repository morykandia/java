
import org.junit.jupiter.api.Test;
import Travailleur.Personnel;
import Travailleur.ManutARisque;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnelTest {


    @Test
    void Tescalcul(){
        Personnel p = new Personnel();
        ManutARisque manutARisque = new ManutARisque("Al", "Abordage", 30, "2001", 45);
        assertEquals(manutARisque, p.ajouterEmploye(manutARisque));
        assertEquals(p.salaireMoyen(),  3125.0);
    }

}
