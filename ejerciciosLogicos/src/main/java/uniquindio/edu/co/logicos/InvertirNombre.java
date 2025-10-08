package uniquindio.edu.co.logicos;

public class InvertirNombre {

    public static String invertirNombre(String nombre){
        String palabraInvertida = "";
        for(int i = nombre.length()-1 ; i>=0; i--){
            palabraInvertida += nombre.charAt(i);
        }
        return palabraInvertida;
    }

    public static void main(String args[]){
        System.out.println(invertirNombre("raul"));
    }


}
