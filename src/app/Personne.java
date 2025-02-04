package app;

public class Personne {
    String prenom;
    String nom;
    int MAX_COPAINS = 10;
    String[] copains = new String[MAX_COPAINS];

    Personne(String prenomPersonne, String nomPersonne) {
        this.prenom = prenomPersonne;
        this.nom = nomPersonne;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom () {
        return this.nom;
    }

    public String toString() {
        if () {
            
        }
        return this.prenom+" "+(this.nom.toUpperCase())+"et ses copains ";
    }

    public void ajouterCopain(String copain) {
        for (int i = 0; i < this.copains.length; i++) {
            if (this.copains[i] == null) {
                this.copains[i] = copain;
            }
        }
    }

    public void suprimmerCopain(String copain) {
        for (int i = 0; i < this.copains.length; i++) {
            if (this.copains[i] == copain) {
                this.copains[i] = null;
            }
        }
    }
}
