public class Ej2 {
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4+1);
        int carta = (int)(Math.random()*13+1);
        String paloString = "";
        String cartaString = "";
        switch (palo) {
            case 1://picas
                paloString = "picas";
                break;
            case 2://corazones
                paloString = "corazones";
                break;
            case 3://diamantes
                paloString = "diamantes";
                break;
            case 4://treboles
                paloString = "tréboles";
                break;
        }
        switch (carta) {
            case 1://as
                cartaString = "As";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                cartaString = carta + "";
                break;
            case 11:
                cartaString = "J";
                break;
            case 12:
                cartaString = "Q";
                break;
            case 13:
                cartaString = "K";
                break;
        }
        System.out.printf("%s de %s", cartaString, paloString);
    }
}
