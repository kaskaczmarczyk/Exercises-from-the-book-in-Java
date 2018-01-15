package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-25.
 */

class Quene {
    private char q[]; //tablica przechowująca elementy kolejki
    private int putloc, getloc; //indeksy operacji put i get

    //Tworzy pustą kolejkę o podanym rozmiarze.
    Quene(int size) {
        q = new char[size]; //przydziela pamieć kolejki
        putloc = getloc = 0;
    }

    //Tworzy obiekt Quene na podstawie innego obiektu Quene.
    Quene(Quene ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //Kopiuje elementy.
        for (int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    //Tworzy kolejkę, umieszczajac w niej elementy.
    Quene(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    //Umieszcza znak w kolejce.
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("--Zadanie pełna.");
            return;
        }
        q[putloc++] = ch;
    }

    //Pobiera znak z kolejki.
    char get() {
        if (getloc == putloc) {
            System.out.println("--Zadanie pusta.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

//Demonstruje użycie klasy Quene.
class QDemo2 {
    public static void main(String[] args) {
        //Tworzy 10-elementową pustą kolejkę.
        Quene q1 = new Quene(10);

        char name[] = {'J', 'a', 'n'};
        //tworzy kolejkę ne podstawie tablicy.
        Quene q2 = new Quene(name);

        char ch;
        int i;

        //umieszcza znaki w kolejce q1.
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        //Tworzy kolejkę z innej kolejki.
        Quene q3 = new Quene(q1);

        //Wyświetla kolejki.
        System.out.print("Zawartość q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Zawartość q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Zawartość q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
