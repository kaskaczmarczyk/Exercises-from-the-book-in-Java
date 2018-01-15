package CwiczeniaZJavaPodstawyHelion;
import java.io.*;

/**
 * Created by Kasia on 2017-06-26.
 */

class PrintWriterDemo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Używam strumienia PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " równa się " + (i + d));
    }
}
