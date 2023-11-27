public class Ej26 {
    public static void main(String[] args) {
        System.out.print("Introduce la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());
        int posicion = (int)(Math.random()*(anchura*altura-(anchura*2+((altura-2)*2)))+1);
        int cont = 0;   
    }
}
