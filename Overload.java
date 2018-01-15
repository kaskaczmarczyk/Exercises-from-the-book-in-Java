package CwiczeniaZJavaPodstawyHelion;

/**
 * Created by Kasia on 2017-05-31.
 */

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    //wyświetl i oraz j
    void show() {
        System.out.println("i i j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //przeciąża metodę show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show("Składowa k: "); //wywołanie metody show() klasy B
        subOb.show(); //wywołanie metody show() klasy A
    }
}
