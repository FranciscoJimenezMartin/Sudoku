
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
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
            }
            
        }
 
    }
    
    @Override
    public String toString()
            
    {
    String resultadoFinal = "";
    return resultadoFinal;
    }
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuExcepcion
   
    {

    }

    public void vaciarElemento(int fila, int columna)
    {

    }
    private boolean comprobarFila(int fila, int elemento)
    {
    boolean resultado = true;
    return resultado;
    }
    private boolean comprobarColumna(int columna, int elemento)
    {
    boolean resultado = true;
    return resultado;
    }
    private boolean comprobarCuadrante(int fila, int columna, int elemento)
    {
    boolean resultado = true;

    return resultado;
    }
    private boolean puedoInsertar(int fila, int columna, int elemento)
    {
    boolean resultado = false;
    return resultado;
    }
    
    
}
