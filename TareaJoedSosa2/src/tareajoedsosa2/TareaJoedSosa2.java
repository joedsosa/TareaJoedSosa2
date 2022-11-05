/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareajoedsosa2;

import java.util.Scanner;

/**
 *
 * @author joeds
 */
import java.util.Scanner;


public class TareaJoedSosa2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("########## REPLACE ########################");
        // Llamado a la funcion miMetodoDeReemplazo
        System.out.println("Ingrese cadena principal");
        String cadenaPrincipal1 = sc.nextLine();
        System.out.println("Ingrese caracter a reemplazar");
        String char1 = sc.nextLine();
        System.out.println("Ingrese caracter de reemplazo");
        String char2 = sc.nextLine();
        miMetodoDeReemplazo(cadenaPrincipal1,char1, char2);
        System.out.println("");
        System.out.println("########## FACTORIAL ########################");
        // Llamado a la funcion returnFactorial
        System.out.println("Ingrese numero para calcular el factorial");
        int num=sc.nextInt();
        int factorial = returnFactorial(num);
        System.out.println("El factorial de "+num+" es: "+factorial);
        System.out.println("");
        System.out.println("########## MENSAJES ########################");
        // Llamado a la funcion que imprime mensaje en pantalla
        System.out.println("Funcion que imprime mensaje en pantalla");
        printMessage("Hola Mundo");
        System.out.println("");
        System.out.println("########## PROMEDIOS ########################");
        // Llamado a la funcion promedios
        Double promedio = promedios();
        System.out.println("El promedio de las 4 notas es "+promedio);
        System.out.println("");
        System.out.println("########## APROBADO O REPROBADO #############");
        System.out.println("Ingrese nota del alumno");
        int notaAlumno = sc.nextInt();
        boolean alumnoAprobo=returnAprobado(notaAlumno);
        if(alumnoAprobo){
            System.out.println("Alumno Aprobo con nota: "+notaAlumno);
        }else{
            System.out.println("Alumno Reprobo con nota: "+notaAlumno);
        }
        System.out.println("");
        System.out.println("########## CONTAINS ########################");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese cadena principal");
        String cadenaPrincipal2 = sc2.nextLine();
        System.out.println("Ingrese sub cadena");
        String subCadena = sc2.nextLine();
        boolean existe=cadenaContains(cadenaPrincipal2,subCadena);
        if(existe){
            System.out.println("La cadena principal "+cadenaPrincipal2+", contiene la sub cadena: "+subCadena);
        }else{
            System.out.println("La cadena principal "+cadenaPrincipal2+", no contiene la sub cadena: "+subCadena);
        }
    }   
    
    public static void miMetodoDeReemplazo(String cadena,String char1, String char2){
        System.out.println(cadena.replace(char1, char2));
    }
    
    public static int returnFactorial(int num){
        int fact = 1;
        for( int i = 1; i <= num; i++ ) {
           fact *= i;
        }
        return fact;
    }
    
    public static void printMessage(String cadena){
        System.out.println(cadena);
    }
    
    public static double promedios(){
        System.out.println("Ingreso de calificaciones");
        int sumNotas=0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese nota "+(i+1));
            int nota = sc.nextInt();
            sumNotas+=nota;
        }
        return sumNotas/4;
    }
    
    public static boolean returnAprobado(int nota){
        boolean valueReturn=false;
        if(nota>=60){
            valueReturn=true;
        }
        return valueReturn;
    }
    
    public static boolean cadenaContains(String cadenaPrincipal, String subCadena){
        boolean valueReturn=false;
        if(cadenaPrincipal.contains(subCadena)){
            valueReturn=true;
        }
        return valueReturn;
    }
}


