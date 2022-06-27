
package Travailleur;

public class Personnel {
    private final Employe[] staff;
    private int nbreEmploye;
    private final static int MAXEMPLOYE = 200;

    public Personnel() {
        staff = new Employe[MAXEMPLOYE];
        nbreEmploye = 0 ;
    }

    public Employe ajouterEmploye(Employe e) {

            ++nbreEmploye;
            Employe [] equipe = new Employe[nbreEmploye];

            if (nbreEmploye <= MAXEMPLOYE)

                staff[nbreEmploye - 1] = e;

            return equipe[nbreEmploye-1] = staff[nbreEmploye-1];
    }

    public double salaireMoyen() {
        double somme = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {
            somme += staff[i].calculerSalaire();
        }
        return somme / nbreEmploye;
    }

    public void afficherSalaires() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(staff[i].getNom() + " gagne "+ staff[i].calculerSalaire() + " francs.");
        }
    }
}
