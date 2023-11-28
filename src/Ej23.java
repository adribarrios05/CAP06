public class Ej23 {
    public static String Dados(){
        int tirada = (int)(Math.random()*6)+1;
        String res = "";
        switch (tirada) {
            case 1:
                res = "As";
                break;
            case 2:
                res = "K";
                break;
            case 3:
                res = "Q";
                break;
            case 4:
                res = "J";
                break;
            case 5:
                res = "7";
                break;
            case 6:
                res = "8";
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            System.out.print(Dados()+" ");
        }
    }
}
