package io.outputinputstreamexam;

import java.io.*;

public class InputOutputStreamExam {
    private final String path;

    public InputOutputStreamExam(String path){
        this.path = path;
    }

    public void write(String st) throws IOException {
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(st.getBytes());
        outputStream.close();
    }

    public void read() throws IOException {
        InputStream inputStream = new FileInputStream(path);
        int data = inputStream.read();
        char content;
        while (data != -1){
            content = (char) data;
            System.out.println(content);
            data = inputStream.read();
        }
        inputStream.close();
    }
}
