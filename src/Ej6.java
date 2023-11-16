public class Ej6 {
    public static void main(String[] args) {
        int numero = (int)(Math.random()*101);
        System.out.print("Intente adivinar el número. Tienes 5 intentos: ");
        boolean acierto = false;
        for(int i=1; i<=5 && !acierto; i++){
            int intento = Integer.parseInt(System.console().readLine());
            if(numero!=intento)
                System.out.printf("No has acertado. El número es %s. Te quedan %d intentos.%n", (numero>intento)?"mayor":"menor",5-i);
            else
                acierto = true;
            }
        if(!acierto)
            System.out.println("Lo siento, no has acertado. El número era "+numero);
        else
            System.out.println("Felicidades. Has acertado el número");
    }
}
