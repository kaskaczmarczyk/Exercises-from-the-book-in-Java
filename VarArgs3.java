package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-29.
 */
class VarArgs3 {

    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " + "Liczba argumentów: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...): " + "Liczba argumentów: " + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" argument " + i + ":" + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Testuję: ", 10, 20);
        vaTest(true, false, false);
    }
}
