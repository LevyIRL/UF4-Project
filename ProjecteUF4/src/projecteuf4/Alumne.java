package projecteuf4;

import java.util.ArrayList;

public class Alumne extends Membre{
    ArrayList <String> materiesMatriculat = new ArrayList<String>();

    public ArrayList<String> getMateriesMatriculat() {
        return materiesMatriculat;
    }

    public void setMateriesMatriculat(ArrayList<String> materiesMatriculat) {
        this.materiesMatriculat = materiesMatriculat;
    }

    public Alumne(String dni, String nom, String cognoms) {
        super(dni, nom, cognoms);
        this.materiesMatriculat = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Alumne\t\t[dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", materiesMatriculat=" + materiesMatriculat + "]";
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
            this.materiesMatriculat.add(afegir);
        }else{
            System.out.println("Aquesta materia no existeix, afegeix-la primer a l'universitat.");
        }
    }

    @Override
    public void showMember(){
        System.out.println("== ALUMNE ==");
        System.out.println("▪ DNI:\t\t" + this.getDni());
        System.out.println("▪ Nom:\t\t" + this.getNom());
        System.out.println("▪ Cognoms:\t" + this.getCognoms());
    }
}
