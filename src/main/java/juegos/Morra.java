/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegos;

import java.util.Random;
import javax.swing.JOptionPane;


public class Morra {
    
    public static void main(String[] args) {
        
        //Declaramos variables
        String menuPrincipal = "";
        int numeroDedos = 0;
        int numeroDedosTotal = 0;
        int dedosMaquina = 0;
        int dedosMaquinaTotal = 0;
        
        
        
        //llamamos al metodo menu principal
        menuPrincipal = mostrarMenuPrincipal();
        
        if(menuPrincipal.equalsIgnoreCase("jugar")){
            
            //llamamos al metodo para elegir dedos
            numeroDedos = mostrarEleccionDedos();
            
            if (numeroDedos>=1 && numeroDedos<=5){
                
                //llamamos al metodo para elegir el total de dedos
                numeroDedosTotal = mostrarEleccionDedosTotal();
                
                if (numeroDedosTotal>=2 && numeroDedosTotal<=10){
                    
                    //llamamos al metodo para que la maquina elija sus dedos
                    dedosMaquina = eleccionDedosMaquina();
                    
                    //llamamos al metodo para que la maquina elija el total de dedos
                    dedosMaquinaTotal = eleccionDedosMaquinaTotal();
                    
                    //llamamos al metodo para mostrar resultados
                    mostrarResultado(numeroDedos, dedosMaquina, numeroDedosTotal, dedosMaquinaTotal);
                }
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
            
        }while(numeroDedos<1 || numeroDedos>5);
        
        return numeroDedos;
    }
    
    public static int mostrarEleccionDedosTotal(){
        
        int numeroDedosTotal;
        
        do{
            String eleccionDedosTotalString = JOptionPane.showInputDialog
            ("Introduce el numero de dedos que crees que habrá en total (2 - 10)");
            numeroDedosTotal = Integer.parseInt(eleccionDedosTotalString);
        }while(numeroDedosTotal<2 || numeroDedosTotal>10);
        
        return numeroDedosTotal;
    }
    
    public static int eleccionDedosMaquina(){
        
        Random numAleatorio = new Random();
              
        int dedosMaquina = numAleatorio.nextInt(1, 5);
        
        return dedosMaquina;                
    }
    
    public static int eleccionDedosMaquinaTotal(){
        
        Random numAleatorio = new Random();
              
        int dedosMaquinaTotal = numAleatorio.nextInt(2, 10);
        
        return dedosMaquinaTotal;         
        }
    
    public static void mostrarResultado(int numeroDedos, int dedosMaquina, int numeroDedosTotal, int dedosMaquinaTotal){
        
        
        String resultado = """
                           
                           El jugador ha sacado  %d
                           La maquina ha sacado  %d
                           El jugador ha dicho   %d
                           La maquina ha dicho   %d   
                          """.formatted(numeroDedos, dedosMaquina,
                numeroDedosTotal, dedosMaquinaTotal);

        //Imprimo el resultado
        JOptionPane.showMessageDialog(null, resultado);
        
        
    }

  
}
