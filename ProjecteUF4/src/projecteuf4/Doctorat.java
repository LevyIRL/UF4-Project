package projecteuf4;

public class Doctorat extends Alumne {
    Professor director;
    int anyInici;
    String tipusContracte;

    public Professor getDirector() {
        return director;
    }

    public void setDirector(Professor director) {
        this.director = director;
    }

    public int getAnyInici() {
        return anyInici;
    }

    public void setAnyInici(int anyInici) {
        this.anyInici = anyInici;
    }

    public String getTipusContracte() {
        return tipusContracte;
    }

    public void setTipusContracte(String tipusContracte) {
        this.tipusContracte = tipusContracte;
    }

    public Doctorat(String dni, String nom, String cognoms, Professor director, int anyInici, String tipusContracte) {
        super(dni, nom, cognoms);
        this.director = director;
        this.anyInici = anyInici;
        this.tipusContracte = tipusContracte;
    }

    @Override
    public String toString() {
        return "Alumne Doctorat\t[dni=" + this.getDni() + ", nom=" + this.getNom() + ", cognoms=" + this.getCognoms()
                + ", materiesMatriculat=" + this.getMateriesMatriculat() + ", director=" + this.getDirector().getNom()
                + " " + this.getDirector().getCognoms() + ", anyInici=" + this.getAnyInici() + ", tipusContracte="
                + this.getTipusContracte() + "]";
    }

    @Override
    public void showMember() {
        System.out.println("== ALUMNE DOCTORAT ==");
        System.out.println("▪ DNI:\t\t" + this.getDni());
        System.out.println("▪ Nom:\t\t" + this.getNom());
        System.out.println("▪ Cognoms:\t" + this.getCognoms());
        System.out.println("▪ Tutor:\t" + this.director.getNom());
        System.out.println("▪ Any d'inici:\t" + this.getAnyInici());
        System.out.println("▪ Tipus de Contracte: " + this.getTipusContracte());
    }
}
