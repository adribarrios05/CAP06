public class Ej22 {
    public static void main(String[] args) {
        System.out.print("Introduce la longitud de la serpiente: ");
        int longitud = Integer.parseInt(System.console().readLine());
        int posicion = 0;
        int desplazamiento = 12;
        System.out.printf("%"+desplazamiento+"s@","");
        for(int i=1; i<=longitud; i++){
            posicion+=(int)(Math.random()*3)-1;
            System.out.printf("%"+(desplazamiento+posicion)+"s@","");
        }
    }
}
