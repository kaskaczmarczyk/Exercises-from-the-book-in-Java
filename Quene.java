/*
package CwiczeniaZJavaPodstawyHelion;

*/
/**
 * Created by Kasia on 2017-06-11.
 *//*


//Interfejs koleki przechowującej znaki.
public interface ICharQ {
    void put(char ch);  //umieszcza znak w kolejce
    char get();  //pobiera znak z kolejki
}

//Zadanie znaków o stałym rozmiarze.
class FixedQuene implements ICharQ {
    private char q[];   //tablica przechowująca elementy kolejki
    private int putloc, getloc;  //indeksy operacji put i get

    //Tworzy pustą kolejkę o podanym rozmiarze.
    public FixedQuene(int size) {
        q = new char[size]; //przydziela pamięc kolejce
        putloc = getloc = 0;
    }

    //Umieszcza znak w kolejce.
    public void put(char ch) {
        if (putloc == q.length;) {
            System.out.println("--Zadanie pełna.");
            return;
        }
        q[putloc++] = ch;
    }

    //Pobiera znak z kolejki.
    public char get() {
        if (getloc == putloc;) {
            System.out.println("-- KOlejak pusta.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

//Zadanie cykliczna.
class CircularQueue implements ICharQ {
    private char q[];   //tablica przechowująca elementy kolejki
    private int putloc, getloc;  //indeksy operacji put i get

    //Tworzy pustą kolejkę o podanym rozmiarze.

    public CircularQueue(int size) {
            q = new char[size +1]];
            putloc = getloc = 0;
}

//Umieszcza znak w kolejce.
    public void put (char ch) {
    if (putloc+1 == getloc) | ((putloc == q.length-1) & (getloc == 0))) {
            System.out.println("--Zadanie pełna.");
            return;
        }

        q[putloc++] = ch;
    if (putloc == q.length)
            {putloc = 0;} //powrót na początek tablicy
    }

    //Pobiera znak z kolejki.
    public char get() {
        if (getloc == putloc) {
            System.out.println("--Zadanie pusta.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) {
            getloc = 0;
        }
        return ch;
    }
}

public class Quene {
}
*/
