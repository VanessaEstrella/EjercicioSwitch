/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author starco
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("---------------[Ejercicio 1]------------------"); 
        
        System.out.println("Bienvenido a artesanias y manias");
        System.out.println("Por favor introduzca un número del 1-5: ");
        int num= entrada.nextInt();
        
        switch(num){
            case 1: System.out.println("Pulseras");
            break;
            case 2: System.out.println("Dulceros");
            break;
            case 3: System.out.println("Canastas");
            break;
            case 4: System.out.println("Blusas");
            break;
            case 5: System.out.println("Muñequitos");
            break;
            default:
                System.out.println("Producto inexistente en la tienda");
        }
             System.out.println( "------------------[Ejercicio 2]------------------");  
                     
        System.out.println("Introduzca su acción que realiza");
            String accion;
        accion=entrada.next();
        switch(accion){
            case "Correr": System.out.println("Estas corriendo");
            break;
            case "Saltar": System.out.println("Estas Saltando");
            break;
            case "Dormir": System.out.println("Estas durmiendo");
            break;
            case "Comer": System.out.println("Estas comiendo");
            break;
            case "Estudiar": System.out.println("Estas estudiando");
            break;
            default:
                System.out.println("No realizas ninguna acción");
        }
 
        
        System.out.println("---------------[Ejercicio 3]----------------");  
        System.out.println("Hoy es Lunes");
        System.out.println("Introduzca un número del 1-24: ");
            int ld= entrada.nextInt();
        
        switch(ld){
            case 1: System.out.println("A las 6:30- Despertar");
            break;
            case 2: System.out.println("A las 7:00-Sacar al perro al patio");
            break;
            case 3: System.out.println("A las 7:30-Desayunar");
            break;
            case 4: System.out.println("A las 9:00-Clases de Algebra Lineal");
            break;
            case 5: System.out.println("A las 10:00-Clase de Algebra Lineal");
            break;
            case 6: System.out.println("A las 11:00-Clase de Algebra Lineal");
            break;
            case 7: System.out.println("A las 11:30-Empezar a hacer tarea");
            break;
            case 8: System.out.println("A las 13:00-Ver que comere");
            break;
            case 9: System.out.println("A las 13:30-Comer");
            break;
            case 10: System.out.println("A las 14:00-Bañarme");
            break;
            case 11: System.out.println("A las 14:30-Jugar con el perro");
            break;
            case 12: System.out.println("A las 15:00-Ver television");
            break;
            case 13: System.out.println("A las 15:30-Dibujar");
            break;
            case 14: System.out.println("A las 16:00-Comer otra vez");
            break;
            case 15: System.out.println("A las 16:30-Seguir viendo television");
            break;
            case 16: System.out.println("A las 17:00-Hacer tarea otra vez");
            break;
            case 17: System.out.println("A las 17:30-Ver anime");
            break;
            case 18: System.out.println("A las 18:30-Comer fruta");
            break;
            case 19: System.out.println("A las 19:00-Ver la novela");
            break;
            case 20: System.out.println("A las 20:00-Ver la novela");
            break;
            case 21: System.out.println("A las 21:00-Hacer la cena");
            break;
            case 22: System.out.println("A las 22:00-Cenar");
            break;
            case 23: System.out.println("A las 23:00-Dormir");
            break;
            case 24: System.out.println("A las 24:00-Estoy dormida");
            break;
            
            default:
                System.out.println("Se termino el horario");
        }
         System.out.println("----------------[Ejercicio 4]----------------");
         
         System.out.println("Introduzca un número del 1-7: ");
            int dia= entrada.nextInt();
        
        switch(dia){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Lunes");
            break;
            case 3: System.out.println("Martes");
            break;
            case 4: System.out.println("Miércoles");
            break;
            case 5: System.out.println("Jueves");
            break;
             case 6: System.out.println("Viernes");
            break;
            case 7: System.out.println("Sábado");
            break;
            default:
                System.out.println("Fecha no valida");
        }
                if (dia==1){
                System.out.println("Semana inglesa");
                }         
                else {
                System.out.println("Semana laboral");
                }
            
         
    
    
}
}
          
        // TODO code application logic here
        
    



