public class Ej14 {
    public static void main(String[] args) {
        System.out.print("Introduce un número y yo intentaré adivinarlo: ");
        int numero = Integer.parseInt(System.console().readLine());
        boolean acierto = false;
        int intento = (int)(Math.random()*100);
        int nummin = 0;
        int nummax = 100;
        for(int i=1;i<=5 && !acierto;i++){
            System.out.print(intento+". ");
            if(intento==numero){
                acierto = true;
                System.out.print("¡He acertado!");
            }
            if(intento!=numero){
                System.out.printf("He fallado. Me quedan %d intentos. ¿El número es mayor o menor?(Mayor:M, menor:m): ",5-i);
                String mayoromenor = System.console().readLine();
                switch (mayoromenor) {
                    case "M":
                    nummin = intento;
                        intento = (int)(Math.random()*(nummax-intento)+nummin);
                        break;
                    case "m":
                    nummax = intento;
                        intento = (int)(Math.random()*nummax)+nummin;
                        break;
                }
            }
        }
    }
}
