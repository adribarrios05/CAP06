public class Ej21 {
    public static String Moneda(int moneda){
        String monedaString = "";
        switch (moneda) {
            case 1:
                monedaString = "1 céntimo";
                break;
            case 2:
                monedaString = "2 céntimos";
                break;
            case 3:
                monedaString = "5 céntimos";
                break;
            case 4:
                monedaString = "10 céntimos";
                break;
            case 5:
                monedaString = "20 céntimos";
                break;
            case 6:
                monedaString = "50 céntimos";
                break;
            case 7:
                monedaString = "1 euro";
                break;
            case 8:
                monedaString = "2 euros";
                break;
        }
        return monedaString;
    }
    public static String CaraoCruz(int lado){
        String ladoString = "";
        switch (lado) {
            case 1:
                ladoString = "cara";
                break;
        
            case 2:
                ladoString = "cruz";
                break;
        }
        return ladoString;
    }
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            int moneda = (int)(Math.random()*8)+1;
            int lado = (int)(Math.random()*2)+1;
            System.out.printf("%s - %s%n",Moneda(moneda), CaraoCruz(lado));
        }
    }
}
