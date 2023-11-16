public class Ej9 {
    public static void main(String[] args) {
        boolean salida = false;
        int cantidad = 0;
        while(!salida){
            int numero = (int)(Math.random()*101);
            System.out.print(numero+" ");
            cantidad++;
            switch (numero) {
                case 24:
                    salida = true;
                    break;
            }
        }
        System.out.println();
        System.out.printf("Se han imprimido %d números", cantidad);
    }
}
