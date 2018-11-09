/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yandrypracticagithub;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Yandrypracticagithub {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
      char letra ;
      String cadena;
      int seguir;
      
      Scanner sc=new Scanner(System.in);
      do{
      System.out.println("dime caracter");
      letra=sc.nextLine().charAt(0);//solo me leera un unico caracter que yo de 
      System.out.println("dime cadena ");
      cadena=sc.nextLine();
     
     System.out.println("otra cadena s/n");
     seguir=sc.nextLine().charAt(0);
     System.out.println("he contado " +contarLetras(cadena,letra)+ " con el caracter " +letra);
      }while(seguir=='s');
      if(seguir=='s'){
      System.out.println("dime caracter");
      letra=sc.nextLine().charAt(0);//solo me leera un unico caracter que yo de 
      System.out.println("dime cadena ");
      cadena=sc.nextLine();
     System.out.println("he contado " +contarLetras(cadena,letra)+ " con el caracter " +letra);
      }else{
          System.out.println("fin");
      }
          
    }
    
    public static int contarLetras(String cadena,char letra){
        int posicion;
        int contador=0;
        posicion=cadena.indexOf(letra);//me dice la posicion de letra 
        while(posicion!=-1){ //solo va a contar el caracter hasta dicha posicion indicada
        contador++;
        posicion=cadena.indexOf(letra,posicion+1);//sigue buscando a partir de la posicion +1
        }
        return contador;}
  
      
}
   