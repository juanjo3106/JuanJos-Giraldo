import java.util.Stack;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class metodos {
    
    public int[][] LLenarMatriz(int [][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int)(Math.random()*50+1);
            }
        }
        return m;
    }

    public Stack<Integer> LLenarPilaFilas(int[][] m1, Stack<Integer> pila1){

        boolean seguir = true;
        int opcion;

        Scanner sc = new Scanner(System.in);


            for (int i = 0; i < m1.length; i++) {
                int sumaFilas = 0;
                for (int j = 0; j < m1[i].length; j++) {
                    sumaFilas += m1[i][j];
                }
                pila1.push(sumaFilas);
            }     

        return pila1;
    }

    public void MostrarPilaF(Stack<Integer> pila1){
        System.out.println(pila1);
    }

    public Stack<Integer> LlenarPilaColumnas(int[][] m2, Stack<Integer> pila2){

        for (int j = 0; j < m2[0].length; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < m2.length; i++) {
                sumaColumnas += m2[i][j];
            }
            pila2.push(sumaColumnas);
        }

        return pila2;
    }

    public void MostrarPilaC(Stack<Integer> pila2){
        System.out.println(pila2);
    }

    public int factorial(int n){
        int resultado = 1;

            if(n < 0){
                System.out.println("El numero factorial es solo para nuemeros positivos.");
            }else if(n > 0){
                for (int i = 1; i <= n; i++) {
                    resultado *= i;
                }
            }

        return resultado;

    }

    public void OrdenarPila(Stack<Integer> pila2){
        Collections.sort(pila2, Collections.reverseOrder());
        System.out.println(pila2);
    }

}
