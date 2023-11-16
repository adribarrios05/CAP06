public class Ej5 {
    public static void main(String[] args) {
        int valor = 0;
        int valormax = 0;
        int valormin = 200;
        int media = 0;
        int suma = 0;
        for(int i=1; i<=50;i++){
            valor = (int)(Math.random()*100+100);
            System.out.print(valor+" ");
            suma+=valor;
            if(valor>valormax)
                valormax = valor;
            else if(valor<valormin)
                valormin = valor;
        }
        System.out.println();
        media = suma/50;
        System.out.println("Máximo: "+valormax);
        System.out.println("Mínimo: "+valormin);
        System.out.println("Media: "+media);
    }
}
