public class Ej3 {
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4+1);
        int carta = (int)(Math.random()*10+1);
        String paloString = "";
        String cartaString = "";
        switch (palo) {
            case 1://picas
                paloString = "oros";
                break;
            case 2://corazones
                paloString = "copas";
                break;
            case 3://diamantes
                paloString = "espadas";
                break;
            case 4://treboles
                paloString = "bastos";
                break;
        }
        switch (carta) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                cartaString = carta + "";
                break;
            case 8:
                cartaString = "Sota";
                break;
            case 9:
                cartaString = "Caballo";
                break;
            case 10:
                cartaString = "Rey";
                break;
        }
        System.out.printf("%s de %s", cartaString, paloString);
    }
}
