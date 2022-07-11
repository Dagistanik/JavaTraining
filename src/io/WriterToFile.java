package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testWriterToFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("test");
        pw.println("test2");
        pw.println(11);

        pw.close();
    }
}
