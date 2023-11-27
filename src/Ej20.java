public class Ej20 {
    public static void main(String[] args) {
        System.out.print("Introduce la capacidad de la cuba en litros: ");
        int capacidad = Integer.parseInt(System.console().readLine());
        int cantidad = (int)(Math.random()*capacidad)+1;
        for(int i = 1; i<=(capacidad-cantidad);i++){
            System.out.println("*    *");
        }
        for(int i=1; i<=cantidad;i++)
            System.out.println("*####*");
        System.out.println("******");
    }
}
