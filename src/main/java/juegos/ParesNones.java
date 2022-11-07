/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package juegos;

import java.util.Random;
import javax.swing.JOptionPane;

public class ParesNones {

    //main
    public static void main(String[] args) {

        //Declaramos variables 
        int menuDedos = 0;
        int numMaquina = 0;
        int sumaDedos = 0;
        String menuInicial = "";
        String menuParesNones;
        final int MINIMO = 1;
        final int MAXIMO = 5;
        
        
        //Hacemos el bucle menu 1
        do{
       
            //Mostramos el menu inicial  
            menuInicial = mostrarMenuInicial();

            //Hacemos una condicion para que entre al siguiente menu si escribimos "jugar"
            if (menuInicial.equalsIgnoreCase("jugar")) {
                           
                //llamamos al metodo para elegir pares o nones
                menuParesNones = mostrarMenuParesNones();
                
                //hacemos la condicion para que avance al siguiente menu
                if (menuParesNones.equalsIgnoreCase("pares")
                        ||menuParesNones.equalsIgnoreCase("nones")){
                    
                    //llamamos al metodo para elegir el numero de dedos
                    menuDedos = mostrarMenuDedos();
                    
                    //hacemos la condicion para que avance
                    if (menuDedos>=1 && menuDedos<=5){
                                            
                        //llamamos al metodo para que la maquina elija dedos
                        numMaquina = dedosMaquina(MINIMO, MAXIMO);
                        
                        //llamamos al metodo para que sume los dedos de ambas manos
                        sumaDedos = totalDedos(menuDedos, numMaquina);
                        
                        //llamamos al metodo para que muestre el resultado
                        mostrarResultado(menuParesNones, sumaDedos);
                    
                    }
                }
            }
            
        //se repite hasta que ponga "salir" bucle menu 1
        }while(!menuInicial.equalsIgnoreCase("salir"));  
    }
    
        //metodo para mostrar el menu inicial
    public static String mostrarMenuInicial() {

        String menuInicial;
        
        menuInicial = JOptionPane.showInputDialog("Introduce JUGAR para entrar \n"
                + "o introduce SALIR para salir del programa");

        return menuInicial;
        
    }

    //metodo para eleccion de pares o nones con bucle
    public static String mostrarMenuParesNones() {
        
        String menuParesNones;
        do{
            menuParesNones = JOptionPane.showInputDialog("Introduce PARES si quieres ser pares \n"
                + "Introduce NONES si quieres ser nones \n"
                + "Introduce SALIR si quieres salir");
         
            
        }while(!menuParesNones.equalsIgnoreCase("pares")
                && !menuParesNones.equalsIgnoreCase("nones"));
        return menuParesNones;
    }

    //metodo para eleccion dedos jugador
    public static int mostrarMenuDedos() {

        int menuDedos;
        do{
            String menuDedosString = JOptionPane.showInputDialog
            ("Introduce el numero de dedos (1 - 5): ");
            menuDedos = Integer.parseInt(menuDedosString);

            
        }while(menuDedos<1 || menuDedos>5);
        return menuDedos;
    }
    
    //metodo para dedos maquina aleatorio
    public static int dedosMaquina(final int MINIMO, final int MAXIMO){
        
        Random numAleatorio = new Random();
              
        int numMaquina = numAleatorio.nextInt(MINIMO, MAXIMO+1);
        
        return numMaquina;
    }
    
    //metodo para sumar dedos de ambas manos
    public static int totalDedos(int numMaquina, int menuDedos){
        
        int sumaDedos;
        
        sumaDedos = numMaquina + menuDedos;
        
        return sumaDedos;
    }
    
    //metodo para mostrar el resultado
    public static void mostrarResultado(String menuParesNones, int sumaDedos){
        
        //si es pares
        if(menuParesNones.equalsIgnoreCase("pares")){
            if (sumaDedos % 2 == 0){
            JOptionPane.showMessageDialog(null, "Has ganado! La suma de los dedos es: " + sumaDedos);
            
            }else{
            JOptionPane.showMessageDialog(null, "Has perdido! La suma de los dedos es: " + sumaDedos);
            }
        
        }
    
        //si es nones
        if(menuParesNones.equalsIgnoreCase("nones")){
            if (sumaDedos % 2 == 1){
            JOptionPane.showMessageDialog(null, "Has ganado! La suma de los dedos es: " + sumaDedos);
            
            }else{
            JOptionPane.showMessageDialog(null, "Has perdido! La suma de los dedos es: " + sumaDedos);
            }
        
        }
    
    }
    
    }
