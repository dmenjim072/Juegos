/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package juegos;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class ParesNones {

    //main
    public static void main(String[] args) {
                    
        mostrarMenuInicial();
        
        if (menuInicial.equalsIgnoreCase("jugar")){
            menuParesNones();
        }
        
    }
    
    //metodo para mostrar el menu inicial
    public static String mostrarMenuInicial(){
        
        String menuInicial;
        
        do{
        menuInicial = JOptionPane.showInputDialog("Introduce JUGAR para entrar \n"
                + "o introduce SALIR para salir del programa");
        
            switch (menuInicial){
            case "jugar": 
                
                break;
            case "salir":
                JOptionPane.showMessageDialog(null, "Hasta luego!");
                break;
        }
                
        }while(!menuInicial.equalsIgnoreCase("salir"));
        return menuInicial;
    }
    
    //metodo para eleccion de pares o nones
    public static void menuParesNones(){
        
        String menuParesNones;
        
        do{menuParesNones = JOptionPane.showInputDialog("Introduce PARES si quieres ser pares \n"
                + "Introduce NONES si quieres ser nones"
                + "Introduce SALIR si quieres salir");
        
            switch (menuParesNones){
                case "pares":
                    break;
                case "nones":
                    break;
            }    
        
        }while (!menuParesNones.equalsIgnoreCase("salir"));{
        
        }
    }
}
