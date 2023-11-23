public class Ej13 {
    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 0;
        boolean iguales = false;
        while(!iguales){
            dado1 = (int)(Math.random()*6)+1;
            dado2 = (int)(Math.random()*6)+1;
            System.out.println("Dado 1: "+dado1);
            System.out.println("Dado 2: "+dado2);
            if(dado1==dado2)
                iguales = true;
            else
                System.out.println();
        }
        System.out.println("Han salido dobles.");
    }
}
