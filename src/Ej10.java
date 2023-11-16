public class Ej10 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            int fila = (int)(Math.random()*40)+1;
            for(int j=1; j<=fila;j++){
                int caracter = (int)(Math.random()*6)+1;
                switch (caracter) {
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("-");
                        break;
                    case 3:
                        System.out.print("=");
                        break;
                    case 4:
                        System.out.print(".");
                        break;
                    case 5:
                        System.out.print("|");
                        break;
                    case 6:
                        System.out.print("@");
                        break;
                }
            }
            System.out.println();
        }
    }
}
