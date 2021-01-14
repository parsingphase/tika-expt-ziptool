package org.phase;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, TikaException {
        Tika tika = new Tika();
        for (String file : args) {
            System.out.println(file);
            File file1 = new File(file);
            String type = tika.detect(file1);
            String text = tika.parseToString(file1);
            System.out.println(type);
            System.out.println(file1.length());
            System.out.println(text.length());
            System.out.println(text);
        }
    }
}
