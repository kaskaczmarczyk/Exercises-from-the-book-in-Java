package CwiczeniaZJavaPodstawyHelion;


/**
 * Created by Kasia on 2017-05-22.
 */
public class NullTest {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        System.out.println("Imie: " + osoba.getName());

        if (osoba.getName() != "" && osoba.getName() != null){
            System.out.println(" NIE JEST");
        }
    }
}
