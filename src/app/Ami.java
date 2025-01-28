package app;

public class Ami {

    private int bieresRestantes;
    private String nom;

    public Ami(int bieresRestantes, String nom) {
        this.bieresRestantes = bieresRestantes;
        this.nom = nom;
    }
    public int getBieresRestantes() {
        return bieresRestantes;
    }
    public String getNom() {
        return nom;
    }
    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            System.out.println(nom + " a fait glouglou");
            bieresRestantes--;
        } else {
            System.out.println("Non, il a trop bu");
        }
    }
}
