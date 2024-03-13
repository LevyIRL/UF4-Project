package projecteuf4;

public class Becat extends Alumne{
    String tipusBeca;

    public String getTipusBeca() {
        return tipusBeca;
    }

    public void setTipusBeca(String tipusBeca) {
        this.tipusBeca = tipusBeca;
    }

    public Becat(String dni, String nom, String cognoms, String tipusBeca) {
        super(dni, nom, cognoms);
        this.tipusBeca = tipusBeca;
    }

    @Override
    public String toString(){
        return "Alumne Becat\t[dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", materiesMatriculat=" + materiesMatriculat + ", tipusBeca=" + tipusBeca + "]";
    }

    @Override
    public void showMember(){
        System.out.println("== ALUMNE BECAT ==");
        System.out.println("▪ DNI:\t\t" + this.getDni());
        System.out.println("▪ Nom:\t\t" + this.getNom());
        System.out.println("▪ Cognoms:\t" + this.getCognoms());
        System.out.println("▪ Tipus de beca:" + this.getTipusBeca());
    }
}


