package app;

public class Application {

    public static void main(String args[]) {

        Ami jeanMiche = new Ami(2, "Jean-Miche");
        Ami medhiTerane = new Ami(3, "Medhi Térané");
        Ami alainTerieur = new Ami(4, "Alain térieur");

        System.out.println(jeanMiche.getNom() + " peut encore boire " + jeanMiche.getBieresRestantes() + " bières");
        jeanMiche.boitUneBiere();
        System.out.println(jeanMiche.getNom() + " peut encore boire " + jeanMiche.getBieresRestantes() + " bières");
        jeanMiche.boitUneBiere();
        jeanMiche.boitUneBiere();
        medhiTerane.boitUneBiere();
        System.out.println(medhiTerane.getNom() + " peut encore boire " + medhiTerane.getBieresRestantes() + " bières");
        alainTerieur.boitUneBiere();
    }
}
