package CwiczeniaZJavaPodstawyHelion;

import java.io.*;

/**
 * Created by Kasia on 2017-06-26.
 */

class ReadLines {
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Wprowadź wiersze tekstu.");
        System.out.println("Wprowadź 'stop', aby zakończyć program.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}

