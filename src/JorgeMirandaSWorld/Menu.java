/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JorgeMirandaSWorld;
import AbstracFactory.FactoryProducer;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class Menu {
   
   private static Menu menu;
   
   Menu(){
   }
   
   public static Menu getInstance(){
       if(menu == null){
           menu= new Menu();
      }
       return menu;
   }
   
   public void op1(){
       int opc;
       Scanner leer = new Scanner(System.in);
       opc = 0;
       System.out.println("|||| BIENVENIDO ||||");
       System.out.println("Precione 1 para iniciar Partida o 2 para salir. ");
       opc = leer.nextInt();
       switch(opc){
           case 1:
               op2();
           case 2:
               break;
           default:
               System.out.println("Ingrese una opcion valida");
       }
      }
   //Jugador 1
   public void op2(){
      int opc;
       Scanner leer = new Scanner(System.in);
       FactoryProducer raza = new FactoryProducer();
       System.out.println("Jugador 1: ");
       System.out.println("Seleccione la raza: ");
       System.out.println("1. Demacia");
       System.out.println("2. Nexeanos");
       System.out.println("3. Voodolanders");    
       try{
               
               opc = leer.nextInt();
                switch(opc){
                    case 1:
                        if (opc==1){
                         String Demacia = "Demacia";
                         System.out.println("Jugador 1: ");
                         System.out.println("DEMACIANO..");
                         System.out.println("");
                          
                        }
                      default:
                        System.out.println("Ingrese una opcion valida");
               }
           
          } catch (InputMismatchException e){
               System.err.println("Ingrese una opcion correcta");
               leer.nextLine();
           
          }
       }
   }
   // Jugador 2
   
   
 
