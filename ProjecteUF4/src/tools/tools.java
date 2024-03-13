package tools;

import java.io.File;
import java.util.Scanner;

public class tools {

    static final Scanner input = new Scanner(System.in);

    public static int demanarInt(){
        int entrat = 0;
        boolean correcte = false;
        do{
            if(input.hasNextInt()){
                entrat = input.nextInt();
                correcte = true;
            }else{
                System.out.println("ERROR!!\nEl caracter introduit no es un numero sencer.");
                input.nextLine();
            }
        }while(!correcte);
        return entrat;
    }

    public static int demanarInt(int min, int max){
        int entrat = 0;
        boolean correcte = false;
        do{
            if(input.hasNextInt()){
                entrat = input.nextInt();
                if(entrat >= min && entrat <= max){
                    correcte = true;
                }else{
                    System.out.printf("ERROR!!\nEl nombre introduit no està entre %d i %d.\n", min, max);
                    input.nextLine();
                }
            }else{
                System.out.println("ERROR!!\nEl caracter introduit no es un numero sencer.");
                input.nextLine();
            }
        }while(!correcte);
        return entrat;
    }

    public static int demanarInt(int min){
        int entrat = 0;
        boolean correcte = false;
        do{
            if(input.hasNextInt()){
                entrat = input.nextInt();
                if(entrat >= min){
                    correcte = true;
                }else{
                    System.out.printf("ERROR!!\nEl nombre introduit es més petit que %d.\n", min);
                    input.nextLine();
                }
            }else{
                System.out.println("ERROR!!\nEl caracter introduit no es un numero sencer.");
                input.nextLine();
            }
        }while(!correcte);
        return entrat;
    }
    
    public static double percent(double a, int percent){
        double result;

        result = (percent * a) / 100;

        return result;
    }

    public static double demanarDouble(){
        double entrat = 0;
        boolean correcte = false;
        do{
            if(input.hasNextDouble()){
                entrat = input.nextDouble();
                correcte = true;
            }else{
                System.out.println("ERROR!!\nEl caracter introduit no es double.");
                input.nextLine();
            }
        }while(!correcte);
        return entrat;
    }

    public static boolean fileExists(String fileName){
        File fil = new File(fileName);
        if(fil.exists()){
            return true;
        }else{
            return false;
        }
    }

    public static int demanarDouble(int min){
        int entrat = 0;
        boolean correcte = false;
        do{
            if(input.hasNextDouble()){
                entrat = input.nextInt();
                if(entrat >= min){
                    correcte = true;
                }else{
                    System.out.printf("ERROR!!\nEl nombre introduit es més petit que %d.\n", min);
                    input.nextLine();
                }
            }else{
                System.out.println("ERROR!!\nEl caracter introduit no es un double.");
                input.nextLine();
            }
        }while(!correcte);
        return entrat;
    }
}