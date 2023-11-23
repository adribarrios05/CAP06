public class Ej15 {
    public static void main(String[] args) {
        int melodia = (int)(Math.random()*7)+1;
        String nombreprimeranota = "";
        for(int i = 1; i<=melodia;i++){
            for(int j=1;j<=4;j++){
                int nota = (int)(Math.random()*7)+1;
                String nombrenota = "";
                switch (nota) {
                    case 1:
                        nombrenota = "do";
                        break;
                    case 2:
                        nombrenota = "re";
                        break;
                    case 3:
                        nombrenota = "mi";
                        break;
                    case 4:
                        nombrenota = "fa";
                        break;
                    case 5:
                        nombrenota = "sol";
                        break;
                    case 6:
                        nombrenota = "la";
                        break;
                    case 7:
                        nombrenota = "si";
                        break;
                }
                if(i==1 && j==1){
                    nombreprimeranota = nombrenota;
                    System.out.print(nombreprimeranota+ " ");
                } else if((i==melodia && j==4))
                    System.out.print(nombreprimeranota);
                else
                    System.out.print(nombrenota+" ");
            }
            if(i<melodia)
                System.out.print("| ");
            else    
                System.out.print("|");
        }
        System.out.print("|");
    }
}