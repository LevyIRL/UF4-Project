package projecteuf4;

import java.util.ArrayList;

public class Universitat {
    private String nom;
    private ArrayList <Membre> llistaMembres;
    private ArrayList <String> assignatures;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(ArrayList<String> assignatures) {
        this.assignatures = assignatures;
    }

    public ArrayList<Membre> getLlistaMembres() {
        return llistaMembres;
    }

    public void setLlistaMembres(ArrayList<Membre> llistaMembres) {
        this.llistaMembres = llistaMembres;
    }

    public Universitat(String nom) {
        this.nom = nom;
        this.assignatures = new ArrayList<>();
        this.llistaMembres = new ArrayList<>();
    }

    public void showMembres(){
        System.out.println("========== LLISTAT DE MEMBRES DE L'UNIVERSITAT ==========");
        for (Membre i : llistaMembres) {
            i.showMember();
            System.out.println();
        }
        System.out.println();
    }

    public void showMembre(String dni){
        for (Membre i : llistaMembres) {
            if(i.getDni().equals(dni)){
                i.showMember();
            }
        }
        System.out.println();
    }

    public void showAlumnes(){
        System.out.println("========== LLISTAT D'ALUMNES DE L'UNIVERSITAT ==========");
        for (Membre i : llistaMembres) {
            if(i instanceof Alumne){
                i.showMember();
                System.out.println();
            }
        }
        System.out.println();
    }

    public void showDoctorat(){
        System.out.println("========== LLISTAT D'ALUMNES DE DOCTORAT ==========");
        for (Membre i : llistaMembres) {
            if(i instanceof Doctorat){
                i.showMember();
                System.out.println();
            }
        }
        System.out.println();
    }

    public void showProfessors(){
        System.out.println("========== LLISTAT DE PROFESSORS DE L'UNIVERSITAT ==========");
        for (Membre i : llistaMembres) {
            if(i instanceof Professor){
                i.showMember();
                System.out.println();
            }
        }
        System.out.println();
    }

    public void addMember(Membre afegir){
        if (searchDni(afegir.getDni()) == -1){
            llistaMembres.add(afegir);
        }else{
            System.out.println("Un membre amb aquest DNI ja existeix!");
        }
    }

    public void addMateria(String afegir){
        assignatures.add(afegir);
    }

    public int searchDni(String search){
        int pos = 0;
        for (Membre i : llistaMembres) {
            if(i.getDni().equals(search)){
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public void deleteMembre(String dni){
        if(searchDni(dni) != -1){
            llistaMembres.remove(searchDni(dni));
        }
    }

    public void showAssignatures(){
        int qtyEnroll;
        System.out.println("== ASSIGNATURES QUE OFEREIX LA UNIVERSITAT AMB MEMBRES PARTICIPANTS ==");
        for (String i : assignatures) {
            qtyEnroll = 0;
            System.out.println("==" + i + "==");
            for (Membre j : llistaMembres) {
                if(j instanceof Professor){
                    for (String k : ((Professor) j).getMateriesImpartides()) {
                        if(k.equals(i)){
                            System.out.println("- Professor: " + j.getNom() + " " + j.getCognoms());
                            qtyEnroll++;
                        }
                    }
                }else if(j instanceof Alumne){
                    for (String k : ((Alumne) j).getMateriesMatriculat()) {
                        if(k.equals(i)){
                            System.out.println("- Alumne: " + j.getNom() + " " + j.getCognoms());
                            qtyEnroll++;
                        }
                    }
                }
            }
            if (qtyEnroll == 0) {
                System.out.println("No hi ha ningún professor ni alumne per aquesta assignatura!");
            }
            System.out.println("");
        }
    }
}
