package projecteuf4;

public abstract class Membre {
    private String dni;
    private String nom;
    private String cognoms;
    
    @Override
    public String toString() {
        return "Membre [dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + "]";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public Membre(String dni, String nom, String cognoms) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
    }

    abstract void addMateria(String afegir, Universitat membreDe);
    abstract void showMember();
}