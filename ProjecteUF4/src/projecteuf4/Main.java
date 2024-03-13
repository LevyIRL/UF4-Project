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

        Professor prof1 = new Professor("12345678A", "nomprof1", "cognom1prof1 cognom2prof1", 2018);
        prof1.addMateria("M01", uni);
        prof1.addMateria("M02", uni);
        prof1.addMateria("M06", uni);

        Alumne alum1 = new Alumne("12345678B", "nomalum1", "cognom1alum1 cognom2alum1");
        alum1.addMateria("M01", uni);

        Becat beca1 = new Becat("12345678C", "nombeca1", "cognom1beca1 cognom2beca1", "skibidi");
        beca1.addMateria("M02", uni);

        Doctorat doct1 = new Doctorat("12345678D", "nomdoct1", "cognom1doct1 cognom2doct1", prof1, 2023, "sigma");
        doct1.addMateria("M04", uni);

        uni.addMember(prof1);
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
