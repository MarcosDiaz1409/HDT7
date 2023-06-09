import java.util.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Clase principal donde el usuario interactua con el programa
 */

public class Principal{

    public static void main(String[] args){

        // Se crea el ArrayList que almacena todas las lineas del archivo
        ArrayList<String> lineasArchivo = new ArrayList<>();

        // Lee el archivo de texto y agrega todas las lineas al ArrayList anterior
        File file = new File("C:/Ejemplos/ejemploHDT7.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                while(br.ready()) {
                    lineasArchivo.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crea los arboles de los tres idiomas y los imprime ya inOrder

        Association<String, String, String> association = new Association<>();

        System.out.println("\n..:: DICCIONARIO DE INGLES ::..");
        association.createEnglishTree(lineasArchivo);

        System.out.println("\n");

        System.out.println("..:: DICCIONARIO EN ESPAÑOL ::..");
        association.createSpanishTree(lineasArchivo);

        System.out.println("\n");

        System.out.println("..:: DICCIONARIO EN FRANCES ::..");
        association.createFrenchTree(lineasArchivo);

        System.out.println("\n");

        System.out.println("=============================================== \n");

        // Codigo que traduce la linea de texto ingresada

        System.out.println(">>>> Traduccion del archivo ingresado <<<< \n");
        // Se crea el ArrayList que almacena todas las lineas del archivo
        ArrayList<String> lineasTrad = new ArrayList<>();

        // Lee el archivo de texto y agrega todas las lineas al ArrayList anterior
        File file1 = new File("C:/Ejemplos/traduccion.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file1))){
                while(br.ready()) {
                    lineasTrad.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}