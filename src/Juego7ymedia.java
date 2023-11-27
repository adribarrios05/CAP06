public class Juego7ymedia {
    public static int palo(){
        int palo = (int)((Math.random()*39)+1)/10;
        return palo;
    }
    public static int carta(){
        int carta = (int)((Math.random()*39)+1)%10;
        return carta;
    }
    public static double imprimeCarta(){
        double valor = 0;
        String paloString = "";
        String cartaString = "";
        switch(palo()){
            case 0:
                paloString = "Oros";
                break;
            case 1:
                paloString = "Copas";
                break;
            case 2:
                paloString = "Espadas";
                break;
            case 3:
                paloString = "Bastos";
                break;
        }
        switch (carta()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                cartaString = (carta()+1)+"";
                valor = (carta()+1);
                break;
            case 7:
                cartaString = "Sota";
                valor = 0.5;
                break;
            case 8:
                cartaString = "Caballo";
                valor = 0.5;
                break;
            case 9:
                cartaString = "Rey";
                valor = 0.5;
            default:
                break;
        }
        System.out.printf("%s de %s. ",cartaString, paloString);
        return valor;
    }
    public static void main(String[] args) {
        System.out.println("VAMOS A JUGAR A LAS 7 Y MEDIA");
        System.out.println("-----------------------------");
        System.out.println("Tu turno:");
        boolean salida = false;
        double puntuacion = 0;
        System.out.print("Tu primera carta es: ");
        while(!salida){
            imprimeCarta();
            puntuacion+=Valores();
            System.out.print("¿Quiere seguir jugando?(Sí/No):");
            String seguir = System.console().readLine().toUpperCase();
            switch (seguir) {
                case "SI":
                case "SÍ":
                    System.out.print("Su siguiente carta es: ");
                    break;
                case "NO":
                    salida = true;
                default:
                    break;
            }
            if(puntuacion>7.5)
                salida = true;
        }
    }
}
