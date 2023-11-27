public class Ej19 {
    public static void main(String[] args) {
        int parmax = 0;
        int imparmin = 0;
        int suma = 0;
        for(int i=1; i<=50; i++){
            int numero = (int)(Math.random()*301)-100;
            System.out.print(numero+" ");
            if(numero%2==0 && numero>parmax)
                parmax = numero;
            else if(numero%2!=0 && numero<imparmin)
                imparmin = numero;
            suma+=numero;
        }
        System.out.println();
        System.out.println("Número par máximo: "+parmax);
        System.out.println("Número impar mínimo: "+imparmin);
        System.out.println("Media: "+suma/50);
    }
}
