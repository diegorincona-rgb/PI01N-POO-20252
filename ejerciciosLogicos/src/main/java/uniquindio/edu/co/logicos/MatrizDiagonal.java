package uniquindio.edu.co.logicos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MatrizDiagonal {

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] diagonalPrincipal() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                if(i==j){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        int[][] matriz = diagonalPrincipal();
        System.out.println("Matriz con diagonal principal:");
        imprimirMatriz(matriz);
    }

}