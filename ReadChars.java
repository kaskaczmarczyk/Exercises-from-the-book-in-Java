package CwiczeniaZJavaPodstawyHelion;

import java.io.*;

/**
 * Created by Kasia on 2017-06-26.
 */

class ReadChars {
    public static void main(String args[])
            throws IOException {
        char c;
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Wprowadź znaki, kropka kończy działąnie programu.");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}

