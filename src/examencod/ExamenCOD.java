package examencod;

public class ExamenCOD {

    public static void main(String[] args) {

        int ini = 11;

        if (metodoSanti(ini)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoSanti(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoSanti(int variable) {
        int y = 2;
        boolean aux = true;

        while ((aux) && (y != variable)) {
            if (variable % y == 0) {
                aux = false;
            }
            y++;
        }

        return aux;

    }

}
