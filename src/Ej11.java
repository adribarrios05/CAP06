public class Ej11 {
    public static void main(String[] args) {
        int suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;
        for(int i=1; i<=20;i++){
            int numero = (int)(Math.random()*5)+1;
            String nota = "";
            switch (numero) {
                case 1:
                    nota = "suspenso";
                    suspenso++;
                    break;
                case 2:
                    nota = "suficiente";
                    suficiente++;
                    break;
                case 3:
                    nota = "bien";
                    bien++;
                    break;
                case 4:
                    nota = "notable";
                    notable++;
                    break;
                case 5:
                    nota = "sobresaliente";
                    sobresaliente++;
                    break;
            }
            System.out.println(nota);
        }
        System.out.printf("Ha habido %d suspensos, %d suficientes, %d bienes, %d notables y %d sobresalientes.",suspenso, suficiente, bien, notable, sobresaliente);
    }
}
