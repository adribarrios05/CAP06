public class Ej18 {
    public static String Cuarto1(int cuarto1){
        String color = "";
        switch (cuarto1) {
            case 1:
                color = "\033[0;31m rojo";
                break;
            case 2:
                color = "\033[0;34m azul";
                break;
            case 3:
                color = "\033[0;32m verde";
                break;
            case 4:
                color = "\033[0;33m yellow";
                break;
            case 5:
                color = "\033[0;35m violeta";
                break;
            case 6:
                color = "naranja";
                break;
        }
        return color;
    }
    public static String Cuarto2(int cuarto2){
        String color = "";
        switch (cuarto2) {
            case 1:
                color = "\033[0;31m rojo";
                break;
            case 2:
                color = "\033[0;34m azul";
                break;
            case 3:
                color = "\033[0;32m verde";
                break;
            case 4:
                color = "\033[0;33m yellow";
                break;
            case 5:
                color = "\033[0;35m violeta";
                break;
            case 6:
                color = "naranja";
                break;
        }
        return color;
    }
    public static String Cuarto3(int cuarto3){
        String color = "";
        switch (cuarto3) {
            case 1:
                color = "\033[0;31m rojo";
                break;
            case 2:
                color = "\033[0;34m azul";
                break;
            case 3:
                color = "\033[0;32m verde";
                break;
            case 4:
                color = "\033[0;33m amarillo";
                break;
            case 5:
                color = "\033[0;35m violeta";
                break;
            case 6:
                color = "\033[0m naranja";
                break;
        }
        return color;
    }
    
    public static void main(String[] args) {
        int cuarto1 = (int)(Math.random()*6)+1;
        int cuarto2 = (int)(Math.random()*6)+1;
        while (cuarto2==cuarto1)
            cuarto2 = (int)(Math.random()*6)+1;
        int cuarto3 = (int)(Math.random()*6)+1;
        while(cuarto3==cuarto2 || cuarto3==cuarto1)
            cuarto3 = (int)(Math.random()*6)+1;
            System.out.print(Cuarto1(cuarto1)+Cuarto2(cuarto2)+Cuarto3(cuarto3)+"\033[0m");
    }
}
