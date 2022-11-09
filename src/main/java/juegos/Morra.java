/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegos;

import javax.swing.JOptionPane;


public class Morra {
    
    public static void main(String[] args) {
        
        //Declaramos variables
        String menuPrincipal = "";
        int numeroDedos = 0;
        int numeroDedosTotal = 0;
        //llamamos al metodo menu principal
        menuPrincipal = mostrarMenuPrincipal();
        
        if(menuPrincipal.equalsIgnoreCase("jugar")){
            
            //llamamos al metodo para elegir dedos
            numeroDedos = mostrarEleccionDedos();
            
            if (numeroDedos>=1 && numeroDedos<=5){
                
                numeroDedosTotal = mostrarEleccionDedosTotal();
                
            }
            
        }
        
    }
    
    
    public static String mostrarMenuPrincipal(){
        
        String menuPrincipal;
        do{
            menuPrincipal = JOptionPane.showInputDialog("MENU PRINCIPAL \n"
                + "---------------------------- \n"
                + "Escribe JUGAR si quiere acceder al programa \n"
                + "Escribe SALIR si quiere salir del programa");
            
        }while(!menuPrincipal.equalsIgnoreCase("jugar")
                && !menuPrincipal.equalsIgnoreCase("salir"));
        
        return menuPrincipal;
    }
                   
    public static int mostrarEleccionDedos(){
        
        int numeroDedos;
        
        do{
            String eleccionDedosString = JOptionPane.showInputDialog
            ("Elige el numero de dedos para sacar (1 - 5)");
            numeroDedos = Integer.parseInt(eleccionDedosString);
            
        }while(numeroDedos)
        
        return numeroDedos;
    }
    
    public static int mostrarEleccionDedosTotal(){
        
        int numeroDedosTotal;
        
        String eleccionDedosTotalString = JOptionPane.showInputDialog
        ("Introduce el numero de dedos que crees que habrá en total (2 - 10");
        numeroDedosTotal = Integer.parseInt(eleccionDedosTotalString);
        
        return numeroDedosTotal;
    }
}
