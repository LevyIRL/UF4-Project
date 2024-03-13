package projecteuf4;

import java.util.ArrayList;

public class Professor extends Membre{
    int anyInici;
    ArrayList <String> materiesImpartides ;
    public int getAnyInici() {
        return anyInici;
    }
    public void setAnyInici(int anyInici) {
        this.anyInici = anyInici;
    }
    public ArrayList<String> getMateriesImpartides() {
        return materiesImpartides;
    }
    public void setMateriesImpartides(ArrayList<String> materiesImpartides) {
        this.materiesImpartides = materiesImpartides;
    }
    
    public Professor(String dni, String nom, String cognoms, int anyInici) {
        super(dni, nom, cognoms);
        this.anyInici = anyInici;
        this.materiesImpartides = new ArrayList<>();
    }

    @Override
    public void addMateria(String afegir, Universitat membreDe){
        boolean exists = false;
        for (String i : membreDe.assignatures) {
            if(i.equals(afegir)){
                exists = true;
            }
        }
        if(exists){
            materiesImpartides.add(afegir);
        }else{
            System.out.println("Aquesta materia no existeix, afegeix-la primer a l'universitat.");
        }
    }

    @Override
    public String toString() {
        return "Professor\t[dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", anyInici=" + anyInici + ", materiesImpartides=" + materiesImpartides + "]";
    }

    @Override
    public void showMember(){
        System.out.println("== PROFESSOR ==");
        System.out.println("▪ DNI:\t\t" + this.getDni());
        System.out.println("▪ Nom:\t\t" + this.getNom());
        System.out.println("▪ Cognoms:\t" + this.getCognoms());
        System.out.println("▪ Any d'inici:\t" + this.getAnyInici());
    }
}
