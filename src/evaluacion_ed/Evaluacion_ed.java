/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_ed;

import java.util.Scanner;

/**
 *
 * @author Kisko
 * Entornos de Desarrollo
 * Evaluacion Tema 4 
 * Poniente Formacion
 */
public class Evaluacion_ed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SudokuExcepcion 
    {

        Sudoku sudoku = new Sudoku ();
        
        //Menu del juego
        Scanner teclado = new Scanner (System.in);
        int respuesta = 0;
        
        do
            {
                System.out.println("-----------------------");
                System.out.println("1.Iniciar/Reiniciar Sudoku\n" + "2.Realizar movimiento\n" + "3.Vaciar casilla\n" + "4.Mostrar sudoku\n" + "5.Terminar");
                System.out.println("-----------------------");
                respuesta=teclado.nextInt();
                
                /**
                 * Iniciar el sudoku
                 */
                if (respuesta == 1)
                {
                    sudoku.inicializar();
                }
                /**
                 * Insertar un numero en una fila y columna
                 */
                else if (respuesta == 2)
                {
                    System.out.println("Dime la fila: ");
                    int s_fila = teclado.nextInt();
                    System.out.println("Dime la columna: ");
                    int s_colum = teclado.nextInt();
                    System.out.println("Dime el numero: ");
                    int s_num = teclado.nextInt();
                    sudoku.modificarElemento(s_fila, s_colum, s_num); 
                }
                
                /**
                 * Vacia un elemento de una casilla y fila dicha
                 */
                else if (respuesta == 3)
                {
                    System.out.println("Dime la fila de la casilla a vaciar: ");
                    int s_fila = teclado.nextInt();
                    System.out.println("Dime la columna de la casilla a vaciar: ");
                    int s_colum = teclado.nextInt();
                    sudoku.vaciarElemento(s_fila, s_colum); 
                }
                /**
                 * Muestra el sudoku con el metodo toString
                 */
                if (respuesta == 4)
                {
                    System.out.println("Este es el sudoku: ");
                    System.out.println(sudoku.toString());
                }
                
            }while( respuesta > 1 || respuesta < 5 );
    
    }
    }
