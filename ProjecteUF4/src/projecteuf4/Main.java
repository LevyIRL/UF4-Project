package projecteuf4;

import java.util.Scanner;

import tools.tools;

public class Main {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean actiu = true;
        String search = null;

        Universitat uni = new Universitat("Universitat 1");
        uni.addMateria("M01");
        uni.addMateria("M02");
        uni.addMateria("M03");
        uni.addMateria("M04");
        uni.addMateria("M05");

        Professor prof1 = new Professor("111", "Jordi", "Soto", 2010);
        prof1.addMateria("M02", uni);

        Professor prof2 = new Professor("222", "David", "Martínez", 2013);
        prof1.addMateria("M03", uni);

        Alumne alum1 = new Alumne("333", "Aran", "Casanoves");
        alum1.addMateria("M02", uni);
        alum1.addMateria("M03", uni);


        Becat beca1 = new Becat("444", "Blai", "Massana", "Beca Erasmus");
        beca1.addMateria("M02", uni);
        beca1.addMateria("M03", uni);

        Doctorat doct1 = new Doctorat("555", "Roc", "Tomás", prof1, 2023, "Contracte Precari");
        doct1.addMateria("M06", uni);

        uni.addMember(prof1);
        uni.addMember(prof2);
        uni.addMember(prof2);
        uni.addMember(alum1);
        uni.addMember(beca1);
        uni.addMember(doct1);

        do {
            switch (menu()) {
                case 1:
                    uni.showMembres();
                    break;
                case 2:
                    uni.showAlumnes();
                    break;
                case 3:
                    uni.showDoctorat();
                    break;
                case 4:
                    uni.showProfessors();
                    break;
                case 5:
                    System.out.println("Introdueix DNI per cercar:");
                    search = input.nextLine();
                    if (uni.searchDni(search) != -1) {
                        uni.showMembre(search);
                    } else {
                        System.out.println("No hi ha ningún membre amb aquest DNI!");
                    }
                    break;
                case 6:
                    System.out.println("Introdueix DNI per eliminar:");
                    search = input.nextLine();
                    if (uni.searchDni(search) != -1) {
                        uni.deleteMembre(search);
                    } else {
                        System.out.println("No hi ha ningún membre amb aquest DNI!");
                    }
                    break;
                case 7:
                    uni.showAssignatures();
                    break;
                case 8:
                    actiu = false;
                    break;
            }
        } while (actiu);
    }

    public static int menu() {

        System.out.println("1.- Llistar tots els membres de la Universitat\n" +
                "2.- Llistar tots els alumnes\n" +
                "3.- Llistar només els alumnes de doctorat\n" +
                "4.- Llistar tots els professors\n" +
                "5.- Cercar i mostrar informació d'un membre per el seu DNI\n" +
                "6.- Eliminar membres demanant el DNI\n" +
                "7.- Llistar les assignatures de la Universitat mostrant el professors que les imparteixen i els alumnes matriculats.\n" +
                "8.- Sortir");

        return tools.demanarInt(1, 8);
    }

}
