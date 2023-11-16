public class Ej7 {
    public static void main(String[] args) {
        for(int i=1; i<=14;i++){
            int quiniela = (int)(Math.random()*3)+1;
            String resultado = "";
            switch(quiniela){
                case 1:
                    resultado = quiniela+"";
                    break;
                case 2:
                    resultado = quiniela+"";
                    break;
                case 3:
                    resultado = "x";
                    break;
            }
            System.out.println(resultado);
        }
        for(int i=1; i<=2;i++){
            int pleno = (int)(Math.random()*3)+1;
        String resultadopleno = "";
            switch (pleno) {
                case 0:
                    resultadopleno = pleno+"";
                    break;
                case 1:
                    resultadopleno = pleno+"";
                    break;
                case 2:
                    resultadopleno = pleno+"";
                    break;
                case 3:
                    resultadopleno = "M";
            }
            System.out.print(resultadopleno);
            if(i<=1)
                System.out.print("-");
        }
    }
}
