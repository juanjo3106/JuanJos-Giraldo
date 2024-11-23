import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt = 0;
        boolean flag = true;
        
        int n = 0;
        System.out.println("Ingrese la dimencion de la matriz: ");
        n = sc.nextInt();

        int [][] m1 = new int[n][n];


        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        metodos mt = new metodos();
        m1 = mt.LLenarMatriz(m1);

        while (flag) {
            System.out.println("\n\t Ingrese la opcion que desea ejecutar \t");
            System.out.println("1. LLenar y Mostrar Pila con la suma de las filas de la matriz");
            System.out.println("2. LLenar y Mostar Pila con la suma de las columnas de la matriz");
            System.out.println("3. Mostrar el factorial de la dimencion de la matriz");
            System.out.println("4. Mostrar la pila ordenada de mayor a menor de la suma de columnas");
            System.out.println("5. salir");

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opcion valida");
                sc.next();
            }
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("\nSe ha generado una matriz de enteros de orden "+ n);
                    for (int i = 0; i < m1.length; i++) {
                        for (int j = 0; j < m1[i].length; j++) {
                            System.out.print(m1[i][j] +" ");
                        }
                        System.out.println(" ");
                    }
                    
                    pila1 = mt.LLenarPilaFilas(m1, pila1);
                    mt.MostrarPilaF(pila1);
                    break;

                case 2:
                    System.out.println("\nSe ha generado una matriz de enteros de orden "+ n);
                    for (int i = 0; i < m1.length; i++) {
                        for (int j = 0; j < m1[i].length; j++) {
                            System.out.print(m1[i][j] +" ");
                        }
                        System.out.println(" ");
                    }

                    pila2 = mt.LlenarPilaColumnas(m1, pila2);
                    mt.MostrarPilaC(pila2);
                    break;

                case 3:
                    int result;
                    result = mt.factorial(n);
                    System.out.println("El factorial de la matriz es: "+ result);
                    break;

                case 4:
                    mt.OrdenarPila(pila2);
                    break;

                case 5:
                    System.out.println("Saliendo del prgrama");
                    flag = false;
                    break;
            
                default:
                    System.out.println("Pagina en mantemiento");
                    break;
            }
        }

    }
}