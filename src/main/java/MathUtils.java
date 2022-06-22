import java.util.ArrayList;

public class MathUtils {

    public static int additionner(int a, int b){
        return a+b ;
    }


    public static int soustraire(int a,int b){
        return a-b;
    }

    public static int multiplier(int a,int b){
        return a*b;
    }

    public static int additionner(int [] table){
        int somme=0;

        for (int i = 0; i < table.length; i++) {
            somme=somme+table[i];

       //   Arrays.stream(table).sum()

        }
        return somme ;
    }


//    public static int multiplier(int a, int b){
//        return a*b;
//    }
//
//    public static int soustraire(int a, int b){
//        return a-b;
//    }
}


