
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_ed;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kisko
 * Entornos de Desarrollo
 * Evaluacion Tema 4 
 * Poniente Formacion
 */
public class Sudoku 
{
    // Variables privadas de la clase
    
    private ArrayList<ArrayList<Integer>> sudoku;
    private Random n_aleatorio;
    
    
    /**
     * Constructor por defecto
     */
    public Sudoku()
    {
        sudoku = new ArrayList<>();
        n_aleatorio = new Random();
    }
    
    /**
     * Metodo para el tablero del sudoku
     * @throws SudokuExcepcion se lanzará si no se puede insertar un elemento en una posición del sudoku. 
     */
    public void inicializar() throws SudokuExcepcion
    {
        
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                
            }
            
        }
 
    }
    
    /**
     * Muestra el tablero del sudoku
     * @return devuelve el tablero del sudoku
     */
    
    @Override
    public String toString()      
    {
        String resultadoFinal = "";
        for (int i = 0; i < sudoku.size(); i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                int resultado = sudoku.get(i).get(j);
                resultadoFinal=resultado +" ";
            }
            resultadoFinal ="\n";
            
        }
        return resultadoFinal;
    }
    
    /**
     * Le pasamos un elemento diciendole la fila y la columna y este metodo lo modifica utilizando el metodo puedoInsertar
     * @param fila la fila que le vamos a decir
     * @param columna la columna que le vamos a decir
     * @param elemento el numero que vamos a insertar en fila y columna
     * @throws SudokuExcepcion 
     */

    public void modificarElemento(int fila, int columna, int elemento) throws SudokuExcepcion
   
    {
        if(puedoInsertar(fila, columna, elemento)==true)
        {
            sudoku.get(fila).set(columna, elemento);
        }
        else
        {
            System.out.println("FALLO! El elemento no se puede modificar");
        }

    }
    
    /**
     * Quita el elemento del tablero
     * @param fila le decimos la fila donde este el elemento a quitar
     * @param columna le decimos la columna donde este el elemento a quitar
     */

    public void vaciarElemento(int fila, int columna)
    {
        sudoku.get(fila).set(columna, 0);

    }
    /**
     * Comprueba que el numero que le digamos se pueda introducir en esa fila
     * @param fila fila donde vamos a introducir el numero
     * @param elemento el numero a introducir
     * @return 
     */
    private boolean comprobarFila(int fila, int elemento)
    {
        boolean resultado = true;
        for (int i = 0; i < sudoku.size(); i++) 
        {
            if(sudoku.get(fila).get(i) == elemento)
            {
                resultado = false;
            }
        }
    return resultado;
 
    }
    
    
    /**
     * Comprueba que el numero que le digamos se pueda introducir en esa columna
     * @param columna columna donde vamos a introducir el numero
     * @param elemento el numero a introducir
     * @return 
     */
    private boolean comprobarColumna(int columna, int elemento)
    {
        boolean resultado = true;
        for (int i = 0; i < sudoku.size(); i++) 
        {
            for (int j = 0; j < sudoku.size(); j++) 
            {
                if(sudoku.get(i).get(columna) == elemento)
                {
                    resultado = false;
                }
            }  
        }
        return resultado;
        
        
    }
    private boolean comprobarCuadrante(int fila, int columna, int elemento)
    {
        boolean resultado = true;

        return resultado;
    }
    /**
     * Para saber si puedes insertar el numero, comprobando columna y fila
     * @param fila comprueba la fila
     * @param columna comprueba la columna  
     * @param elemento comprueba el numero a introducir
     * @return 
     */
    private boolean puedoInsertar(int fila, int columna, int elemento)
    {
        boolean resultado = false;
        if(comprobarFila (fila, elemento) == true && comprobarColumna(columna, elemento) == true )
        {
            resultado=true;
        }
        return resultado;
    }
    
    
}
