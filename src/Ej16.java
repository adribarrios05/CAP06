public class Ej16 {
    public static String primeraFigura(int primerafigura){
        String res = "";
        switch (primerafigura) {
            case 1:
                res = "corazon";
                break;
            case 2:
                res = "diamante";
                break;
            case 3:
                res = "herradura";
                break;
            case 4:
                res = "campana";
                break;
            case 5:
                res = "limon";
                break;
        }
        return res;
    }
    public static String segundaFigura(int segundafigura){
        String res = "";
        switch (segundafigura) {
            case 1:
                res = "corazon";
                break;
            case 2:
                res = "diamante";
                break;
            case 3:
                res = "herradura";
                break;
            case 4:
                res = "campana";
                break;
            case 5:
                res = "limon";
                break;
        }
        return res;
    }
    public static String terceraFigura(int tercerafigura){
        String res = "";
        switch (tercerafigura) {
            case 1:
                res = "corazon";
                break;
            case 2:
                res = "diamante";
                break;
            case 3:
                res = "herradura";
                break;
            case 4:
                res = "campana";
                break;
            case 5:
                res = "limon";
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        boolean salir = false;
        int monedas = 30;
        while(!salir || monedas>0){
            int primerafigura = (int)(Math.random()*5)+1;
            int segundafigura = (int)(Math.random()*5)+1;
            int tercerafigura = (int)(Math.random()*5)+1;

            System.out.println();
            System.out.printf("%s %s %s%n", primeraFigura(primerafigura), segundaFigura(segundafigura), terceraFigura(tercerafigura));
            System.out.println();

            if(primeraFigura(primerafigura)==segundaFigura(segundafigura) && primeraFigura(primerafigura)==terceraFigura(tercerafigura)){
                System.out.println("¡Felicidades, has ganado 10 monedas!");
                monedas+=10;
            }
            else if(primeraFigura(primerafigura)!=segundaFigura(segundafigura) && primeraFigura(primerafigura)!=terceraFigura(tercerafigura) && segundaFigura(segundafigura)!=terceraFigura(tercerafigura)){
                System.out.println("Lo siento, ha perdido.");
                monedas--;
            }
            else
                System.out.println("Bien, ha recuperado su moneda");
            System.out.printf("Tiene %d monedas%n", monedas);
            System.out.print("Pulse s para salir. Pulse solo intro para seguir jugando.");
            String salida = System.console().readLine().toUpperCase();
            if(monedas==0){
                salir=true;
                System.out.print("Te has quedado sin monedas");
            }
            switch (salida) {
                case "S":
                    salir = true;
                    System.out.println("Gracias por jugar.");
                    break;
            }
            
        }
    }
}
