package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-29.
 */
public class VarArgs {
    //vaTest ma zmienną liczbę argumentów.
    static void vaTest(int ... v) {
        System.out.println("Liczba argumentów: " + v.length);
        System.out.println("Zawartosć: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" argument " + i + ": " + v[i]);
        }
        System.out.println();
        }

        public static void main(String args[]) {

        //vaTest() może być wywołana z różną liczbą argumentów.
            vaTest(10); //1 argument
            vaTest(1, 2, 3); //3 argumenty
            vaTest(); //bez argumentu
    }
}
