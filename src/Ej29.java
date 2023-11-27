public class Ej29 {
    public static int TEMP_MIN_PRIMAVERA = 15;
    public static int TEMP_MAX_PRIMAVERA = 30;
    public static int TEMP_MIN_VERANO = 25;
    public static int TEMP_MAX_VERANO = 45;
    public static int TEMP_MIN_OTONO = 20;
    public static int TEMP_MAX_OTONO = 30;
    public static int TEMP_MIN_INVIERNO = 0;
    public static int TEMP_MAX_INVIERNO = 25;
    public static void menu(){
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación de año: ");
    }
    public static int obtenerTemperatura(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        menu();
        int opcion = Integer.parseInt(System.console().readLine());
        int max = 0, min = 0;
        String cielo="";    
        switch (opcion) {
            case 1:
                min = obtenerTemperatura(TEMP_MIN_PRIMAVERA,TEMP_MAX_PRIMAVERA);
                max = obtenerTemperatura(min, TEMP_MAX_PRIMAVERA);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        System.out.printf("Temperatura mínima: %d%n", min);
    }
}
